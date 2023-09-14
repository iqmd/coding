package com.mongodb;
import java.util.ArrayList;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ClientConnect {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://newme:newpass@cluster0.asnmcoi.mongodb.net/?retryWrites=true&w=majority";
        String connectionLocalString = "mongodb://localhost:27017";

        // ServerApi serverApi = ServerApi.builder()
        //         .version(ServerApiVersion.V1)
                // .build();

        // MongoClientSettings settings = MongoClientSettings.builder()
        //         .applyConnectionString(new ConnectionString(connectionString))
        //         .serverApi(serverApi)
        //         .build();

        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            try {
                // MongoDatabase database = mongoClient.getDatabase("javaDatabase");
                // MongoCollection<Document> collection = database.getCollection("locations");
                // FindIterable<Document> docs = collection.find();
                // for(Document doc:docs){
                //     System.out.println(doc.toJson());
                // }
                InsertDocument insertDoc = new InsertDocument(mongoClient);
                // insertDoc.addDocument();
                // CreateIndex ci = new CreateIndex(mongoClient);
                // ci.textIndex();
                insertDoc.aggregation();
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
    }
}
