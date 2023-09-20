package com.mongodb;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import com.github.javafaker.Faker;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class BlogPosts {
    MongoClient mongoclient;
    MongoDatabase database;
    MongoCollection<Document> collection;
    Faker faker = new Faker();

    Scanner read = new Scanner(System.in);
    ObjectId loggedin;


    public BlogPosts(MongoClient mongoclient){
        this.mongoclient = mongoclient;
        setup("javaDatabase", "blogposts");
    }
    public void setup(String db, String c){
        this.database = mongoclient.getDatabase(db);
        this.collection = database.getCollection(c);
    }

    public void addDocuments(){
        try{
            for(int i=0; i < 5; i++){
                String username = faker.harryPotter().character();
                String userId = faker.idNumber().invalid();
                String blog_post = faker.lorem().paragraph();
                String pastring = faker.backToTheFuture().character();
                int pass = pastring.hashCode();
                System.out.println(pastring);
                Document doc = new Document();
                doc.append("_id", new ObjectId());
                doc.append("UserId", userId);
                doc.append("UserName", username);
                doc.append("Password", pass);
                doc.append("blog_id", new ObjectId());
                doc.append("blog_post", blog_post);
                InsertOneResult result = collection.insertOne(doc);
                System.out.println("Successfully inserted !"+result.getInsertedId());

            }
        }catch(MongoException e){
            System.err.println("Unable to insert document !!");
            System.err.println(e);
        }

    }

    public boolean login(){
        String user;
        String password;
        System.out.println("------------Login Page------------");
        System.out.print("User:");
        user = read.nextLine();
        System.out.print("Password:");
        password = read.nextLine();
        int hashpass = password.hashCode();
        Bson filter = Filters.eq("UserName",user);
        FindIterable<Document> found = collection.find(filter);

        for(Document doc:found){
           if((int)doc.get("Password")==hashpass){
              loggedin = (ObjectId)doc.get("UserId");
              System.out.println("Welcome "+doc.get("UserName"));
              return true;
           }
        }
        return false;

    }

    public void register(){
        String user;
        String password;
        System.out.println("------------Register Page------------");
        System.out.print("User:");
        user = read.nextLine();
        System.out.print("Password:");
        password = read.nextLine();
        int pass = password.hashCode();
        try{
            Document doc = new Document();
            doc.append("UserId", new ObjectId());
            doc.append("UserName", user);
            doc.append("Password", pass);
            InsertOneResult result = collection.insertOne(doc);
            System.out.println("Successfully inserted !" + result.getInsertedId());

        }catch(MongoException e){
            System.err.println("Unable to insert document !!");
            System.err.println(e);
        }

    }
    public void menu(){
        int input;
        List<Document> results = new ArrayList<>();
        String answer="n";
        while(answer.equals("n")){
        System.out.println("1.List Blogs");
        System.out.println("2.Write blog");
        System.out.println("3.Comment");
        System.out.println("4.Log Out");
        input = Integer.parseInt(read.nextLine());

        switch(input){
            case 2:
                String post;
                System.out.println("Write blog post ?");
                post = read.nextLine();

                if(loggedin != null){
                    Bson filter = Filters.eq("UserId",loggedin);
                    Document blogPost = new Document();
                    blogPost.append("blog_id",new ObjectId());
                    blogPost.append("blog_post",post);
                    Bson update= Updates.set("blog",blogPost);
                    collection.updateOne(filter, update);
                }else{
                    System.out.println("Pls login to post !!");
                }
                break;
            case 1:
                results = listBlogs();
                break;
            case 3:
                if(results.size() != 0){
                    System.out.println("Enter the post number ?");
                    input = Integer.parseInt(read.nextLine());
                    // System.out.println(results);
                    Document postid = (Document)results.get(input-1).get("blog");
                    ObjectId id = (ObjectId)postid.get("blog_id");
                    comment(id);
                }else{
                    System.out.println("pls list the blogs first !!");
                }
            case 4:
                answer = "y";

        }

        }

    }

    public List<Document> listBlogs(){
            Bson filter = Filters.exists("blog.blog_post");
            FindIterable<Document> found = collection.find(filter);
            List<Document> results = new ArrayList<>();

            found.into(results);
            for(int i=0; i < results.size(); i++){
                Document blogs = (Document) results.get(i).get("blog");
                System.out.println(i+1+": "+blogs.getString("blog_post"));
            }
            return results;
    }

    private void comment(ObjectId id){
        String post;
        Bson filter = Filters.eq("UserId",loggedin);
        Bson blogid = Filters.eq("blog.blog_id",id);
        Document newfilter = new Document("blog.blog_id", id);
        System.out.println(id);
        Document author = collection.find(filter).first();
        Document blogpost = collection.find(blogid).first();
        Document comment = new Document();
        System.out.println("Write comment :");
        post = read.nextLine();
        System.out.println(blogpost.toJson());
        comment.append("author",author.get("UserName"));
        comment.append("comment",post);
        Document update = new Document("$set", new Document("blog.comment", comment));
        // Bson update= Updates.push("blog",comment);
        collection.updateOne(newfilter, update);

    }



}
