package com.db;

import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.Item;

import java.util.Scanner;

import com.amazonaws.services.dynamodbv2.document.DynamoDB;

public class PutItem {
    DynamoDB dynamoDB = DynamoDBInstance.getInstance();

    Scanner read = new Scanner(System.in);

    public void putItem(){


        Table table = dynamoDB.getTable("Books");
        Item item = new Item();
        String answer="y";
        String key;
        String value;

        System.out.println("Set the primary Key ");
        key = read.nextLine();
        System.out.println("Set the primary Key value ");
        value = read.nextLine();

        item.withPrimaryKey(key,value);


        System.out.println("Do you want to add more attributes ?");
        answer = read.nextLine();


        while(answer.equals("y")){
            System.out.println("Key : ");
            key = read.nextLine();
            System.out.println("Value :");
            value = read.nextLine();

            item.withString(key, value);


            System.out.println("Do you want to add more attributes ?");
            answer = read.nextLine();


        }

        table.putItem(item);
    }
}
