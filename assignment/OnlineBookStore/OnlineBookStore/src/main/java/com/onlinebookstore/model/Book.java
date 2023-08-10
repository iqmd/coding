package com.onlinebookstore.model;


public class Book {


    private String Name;
    private String ISBN;
    private String author;
    private double price;

    public Book(){}

    public Book(String ISBN, String Name, String author, double price){
        this.Name = Name;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
