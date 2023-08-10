package com.onlinebookstore.model;

import java.util.HashMap;


public class Database {

    private HashMap<String, Book> books;
    public Database(){
        books = new HashMap<>();
    }

    public int addBook(Book book){
        if(books.containsKey(book.getISBN())){
            return 0;
        }else{
            books.put(book.getISBN(),book);
            return 1;
        }
    }

    public int removeBook(String ISBN){
        if(books.containsKey(ISBN)){
            books.remove(ISBN);
            return 1;
        }else{
            return 0;
        }
    }

    public void listBooks() {
        int i = 1;
        for (Book bk : books.values()) {
            System.out.println(i+" : "+bk.getName());
            i++;
        }
    }

    public Book searchBook(String isbn){
        if(books.containsKey(isbn)){
            return books.get(isbn);
        }else{
            return null;
        }
    }

}
