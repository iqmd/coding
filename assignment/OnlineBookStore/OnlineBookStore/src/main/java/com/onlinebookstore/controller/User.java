package com.onlinebookstore.controller;

import com.onlinebookstore.model.*;
import com.onlinebookstore.view.BookView;

import java.util.Scanner;


/**
 * User
 */
public class User {
    private Database database;
    private String isbn;
    private Book book;
    private String addtocart;

    private Cart cart = new Cart();

    private BookView bv;

    Scanner read = new Scanner(System.in);

    public User(Database database){
        this.database = database;
    }

    public void display(){
        int choice = 0;
        System.out.println("Welcome to Online BookStore");
        System.out.println("Do you want to search(1) or Browse(2) books ? press 1 or 2");
        choice = Integer.parseInt(read.nextLine());

        if(choice==1){
            System.out.println("Please enter the ISBN");
            isbn = read.nextLine();

            book = database.searchBook(isbn);

            if(book == null){
                System.out.println("Book Not Found !! Maybe you can browse our books");
            }else{
                bv = new BookView(database.searchBook(isbn));
                bv.viewBook();
                System.out.println("\nDo you want to add this to cart ? (y/n)");
                addtocart=read.nextLine();

                if(addtocart.equals("y")){
                    System.out.println("How many units ?");
                    int units = Integer.parseInt(read.nextLine());
                    cart.addBook(book, units);
                    cart.listBooks();
                    System.out.println(cart.getOrderAmount());
                }
            }
        }else if(choice == 2){
            database.listBooks();
        }

    }


}
