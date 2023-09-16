package com.bp;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class App 
{
    public static void main( String[] args ){
        String connectionString = "mongodb+srv://newme:newpass@cluster0.asnmcoi.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(connectionString);
    }
}
