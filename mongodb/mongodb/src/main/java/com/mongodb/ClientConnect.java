package com.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class ClientConnect {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://newme:newpass@cluster0.asnmcoi.mongodb.net/?retryWrites=true&w=majority";
        String connectionLocalString = "mongodb://localhost:27017";
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(connectionLocalString)) {
                try {
                        InsertDocument insertDoc = new InsertDocument(mongoClient);
                        insertDoc.addDocument();
                } catch (MongoException e) {
                        e.printStackTrace();
            }
        }
    }
}
