package com.mongodb;


import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Indexes;

public class CreateIndex {

    MongoClient mongoclient;
    MongoDatabase database;
    MongoCollection<Document> collection;



    public CreateIndex(MongoClient mongoclient){
        this.mongoclient = mongoclient;
    }

    public void setup(String db, String c){
        this.database = mongoclient.getDatabase(db);
        this.collection = database.getCollection(c);
    }

    public void wildCardIndex(){
        String resultCreateIndex = collection.createIndex(Indexes.ascending("*_description"));
        System.out.println(String.format("Index created: %s", resultCreateIndex));

    }

    public void sphereIndex(){
        setup("javaDatabase", "locations");
        String resultCreateIndex = collection.createIndex(Indexes.geo2dsphere("geometry.features.geometry"));
        System.out.println(String.format("Index created: %s", resultCreateIndex));
    }

    public void compoundIndex(){
        setup("javaDatabase", "products");
        String resultCreateIndex = collection.createIndex(Indexes.ascending("type","rating"));
        System.out.println(String.format("Index created: %s", resultCreateIndex));
    }

    public void textIndex(){
        setup("javaDatabase", "books");
        String resultCreateIndex = collection.createIndex(Indexes.text("longDescription"));
        System.out.println(String.format("Index created: %s", resultCreateIndex));

    }

}
