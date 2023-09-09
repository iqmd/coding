package com.mongodb;


import java.util.Arrays;
import java.util.List;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

import org.bson.Document;
import org.bson.types.ObjectId;

public class InsertDocument {
    MongoClient mongoclient;


    public InsertDocument(MongoClient mongoclient){
        this.mongoclient = mongoclient;
    }

    public void addDocument(){
        MongoDatabase database = mongoclient.getDatabase("javaDatabase");
        MongoCollection<Document> collection = database.getCollection("Products");

        try{
            for(int i=2; i < 5; i++){
                String pid = "P"+Integer.toString(i);
                Document doc = new Document();
                doc.append("_id", new ObjectId());
                doc.append("ProductId", pid);
                doc.append("Product_description", "this is some prodc");
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
}
