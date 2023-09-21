package com.lb;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

public class Library {

    private MongoClient mnClient = ClientConnect.getInstance();
    MongoDatabase database;
    MongoCollection<Document> collection;
    Scanner read = new Scanner(System.in);
    String loggedin="";

    public void setup(String db, String c){
        this.database = mnClient.getDatabase(db);
        this.collection = database.getCollection(c);
    }

    public List<Document> listBooks(){
        setup("Library","books");
        FindIterable<Document> found = collection.find(Filters.empty());
        List<Document> results = new ArrayList<>();
        found.into(results);
        for(int i=0; i < results.size(); i++){
            System.out.println(i+1+": "+results.get(i).get("title"));
        }

        return results;
    }

    public List<Document> searchBooks(String book){
        setup("Library","books");
        List<Document> results = new ArrayList<>();
        collection.createIndex(Indexes.text("title"));
        Bson filter = Filters.text(book);
        FindIterable<Document> found = collection.find(filter);
        found.into(results);
        for(int i=0; i < results.size(); i++){
            System.out.println(i+1+": "+results.get(i).get("title"));
        }

        return results;


    }

    public void register(){
        setup("Library","user");
        String user;
        String password;
        String email;
        List<String> books = Arrays.asList("");
        System.out.println("------------Register Page------------");
        System.out.print("User:");
        user = read.nextLine();
        System.out.print("Password:");
        password = read.nextLine();
        System.out.print("email:");
        email = read.nextLine();
        int pass = password.hashCode();
        try{
            Document doc = new Document();
            doc.append("name", user);
            doc.append("email", email);
            doc.append("password", pass);
            doc.append("books",books);
            InsertOneResult result = collection.insertOne(doc);
            System.out.println("User created !!" + result.getInsertedId());

        }catch(MongoException e){
            System.err.println("Cannot create user !!");
            System.err.println(e);
        }

    }

    public boolean login(){
        setup("Library","user");
        String user;
        String password;
        System.out.println("------------Login Page------------");
        System.out.print("User:");
        user = read.nextLine();
        System.out.print("Password:");
        password = read.nextLine();
        int hashpass = password.hashCode();
        Bson filter = Filters.eq("name",user);
        FindIterable<Document> found = collection.find(filter);

        for(Document doc:found){
           if((int)doc.get("password")==hashpass){
              loggedin = (String)doc.get("name");
              System.out.println("Welcome "+doc.get("name"));
              return true;
           }
        }
        return false;

    }

    public void menu(){
        int input;
        List<Document> results = new ArrayList<>();
        String answer="n";
        while(answer.equals("n")){
        System.out.println("1.List Books");
        System.out.println("2.Search Book");
        System.out.println("3.Borrow Book");
        System.out.println("4.Return Book");
        input = Integer.parseInt(read.nextLine());

        switch(input){
            case 1:
                results = listBooks();
                break;
            case 2:
                System.out.print("Seach Book :");
                String books;
                books = read.nextLine();
                results = searchBooks(books);
                break;
            case 3:
                setup("Library","books");
                borrow(results);
            case 4:
                answer = "y";

        }

        }

    }
    // public void transactions(){
    //     setup("Library","transactions");
    //     Document transaction = new Document();

    // }

    public void borrow(List<Document> results){
        int input;
        System.out.println("Which books do you want to borrow ?");
        if (results.size() != 0) {
            System.out.println("Enter the book number ?");
            input = Integer.parseInt(read.nextLine());
            Document book = (Document) results.get(input - 1);
            Document findbook = new Document("_id", book.get("_id"));
            Bson update = Updates.set("available", false);
            collection.updateOne(findbook, update);
            System.out.println("You have succesfully borrowed " + book.get("title"));
            addBookToUser(book);
        } else {
            System.out.println("pls list the books first");
        }
    }

    public void addBookToUser(Document book){
        setup("Library", "user");
        Document user = new Document("name", loggedin);
        Bson update = Updates.push("books", book.get("title"));
        collection.updateOne(user, update);

    }

    public void returnBooks(List<Document> results){
        setup("Library","user");
       System.out.println("Books borrowed by you:");
    }




}
