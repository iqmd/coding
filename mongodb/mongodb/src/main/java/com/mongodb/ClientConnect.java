package com.mongodb;

import java.util.Scanner;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class ClientConnect {
    public static void main(String[] args) {
        String connectionString = "mongodb+srv://newme:newpass@cluster0.asnmcoi.mongodb.net/?retryWrites=true&w=majority";
        String connectionLocalString = "mongodb://localhost:27017";
        Scanner read = new Scanner(System.in);
        String answer = "y";
        String input;
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(connectionLocalString)) {
                try {
                    BlogPosts bp = new BlogPosts(mongoClient);

                    while(answer.equals("y")){
                        System.out.println("Do you want to register or login  or exit?");
                        input = read.nextLine();

                        switch (input) {
                            case "register":
                                while (answer.equals("y")) {
                                    bp.register();
                                    System.out.println("Do you want to register more users ?");
                                    answer = read.nextLine();
                                }
                                System.out.println("Do you want to continue ? (y/n)");
                                answer = read.nextLine();
                                break;
                            case "login":
                                if (bp.login()) {
                                    bp.menu();
                                } else {
                                    System.out.println("Wrong Password !!\n Do you want to try again ?(y/n)!!");
                                    answer = read.nextLine();
                                }
                                break;
                            case "exit":
                                answer = "n";
                                break;

                        }
                    }
                    bp.listBlogs();

                } catch (MongoException e) {
                        e.printStackTrace();
            }
        }
    }
}
