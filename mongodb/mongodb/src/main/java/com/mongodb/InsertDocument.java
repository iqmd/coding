package com.mongodb;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.BsonField;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.result.InsertOneResult;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class InsertDocument {
    MongoClient mongoclient;
    Faker faker = new Faker();


    public InsertDocument(MongoClient mongoclient){
        this.mongoclient = mongoclient;
    }

    public void addDocument(){
        MongoDatabase database = mongoclient.getDatabase("javaDatabase");
        MongoCollection<Document> collection = database.getCollection("SocialMedia");

        try{
            for(int i=0; i < 50; i++){
                Random rnd = new Random();
                Date date = new Date(Math.abs(System.currentTimeMillis() - rnd.nextLong()));
                String username = faker.harryPotter().character();
                String timestamp = date.toString();
                int likes = faker.number().randomDigit();
                int comments = faker.number().randomDigit();
                int shares = faker.number().randomDigit();
                String postId = faker.idNumber().ssnValid();
                String userId = faker.idNumber().invalid();
                Document doc = new Document();
                doc.append("_id", new ObjectId());
                doc.append("UserId", userId);
                doc.append("UserName", username);
                doc.append("PostId", postId);
                doc.append("timestamp",timestamp);
                doc.append("likes",likes);
                doc.append("comments",comments);
                doc.append("shares",shares);
                InsertOneResult result = collection.insertOne(doc);
                System.out.println("Successfully inserted !"+result.getInsertedId());

            }
        }catch(MongoException e){
            System.err.println("Unable to insert document !!");
        }
    }

    public void addLocation(){
        MongoDatabase database = mongoclient.getDatabase("javaDatabase");
        MongoCollection<Document> collection = database.getCollection("places");
        double[] cordinates= new double[2];
        cordinates[0] = 86.93968938228613 ;
        cordinates[1] = 23.701138123139078;

        try{
            for(int i=0; i < 20; i++){
                cordinates[0]++;
                cordinates[1]++;
                String theatre = "Carnival"+Integer.toString(i);
                List<Double> locations = Arrays.asList(cordinates[0],cordinates[1]);
                Document doc = new Document();
                Document geoJson = new Document();

                doc.append("_id", new ObjectId());
                doc.append("Theatre", theatre);
                geoJson.append("type","Point");
                geoJson.append("coordinates",locations);
                doc.append("location", geoJson);
                InsertOneResult result = collection.insertOne(doc);
                System.out.println("Successfully inserted !"+result.getInsertedId());

            }
        }catch(MongoException e){
            System.err.println("Unable to insert document !!");
        }
    }

    public void aggregation(){
        MongoDatabase database = mongoclient.getDatabase("javaDatabase");
        MongoCollection<Document> collection = database.getCollection("SocialMedia");
        // AggregateIterable<Document> docs = collection.aggregate(
        //         Arrays.asList(
        //                 Aggregates.project(Projections.fields(Projections.include("likes"), Projections.include("comments"))),
        //                 Aggregates.group("PostId", Accumulators.sum("total",1))));
        Bson interactions = Projections.fields(Projections.include("PostId"));
        AggregateIterable<Document> docs = collection.aggregate(
                Arrays.asList(
                        Aggregates.group("PostId",Accumulators.sum("interactions","$shares"),
                                         Accumulators.sum("interactions", "$comments"),
                                         Accumulators.sum("interactions","$likes"))));

        for(Document doc:docs){
            System.out.println(doc.toJson());
        }

        
    }
}
