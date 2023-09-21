package com.lb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class ClientConnect {

    private static MongoClient mnClient = null;
    private static String cstring = "mongodb+srv://newme:newpass@cluster0.asnmcoi.mongodb.net/?retryWrites=true&w=majority";

    private ClientConnect(){
    }

    public static MongoClient getInstance(){
        if(mnClient == null){
            mnClient = MongoClients.create(cstring);
            return mnClient;
        }
        return mnClient;
    }


}
