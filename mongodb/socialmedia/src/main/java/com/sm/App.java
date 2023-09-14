package com.sm;

import com.github.javafaker.Faker;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class App{
    public static void main( String[] args ){
        String connectionString = "mongodb+srv://newme:newpass@cluster0.asnmcoi.mongodb.net/?retryWrites=true&w=majority";
        MongoClient client = MongoClients.create(connectionString);
        Faker faker = new Faker();

    }
}
