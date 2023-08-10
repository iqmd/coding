package com.onlinebookstore;

import com.onlinebookstore.controller.*;
import com.onlinebookstore.model.*;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Database database = new Database();

        Book HarryPotter = new Book("1234","Harry Potter","JK Rowling", 588);
        Book Sapiens = new Book("67QW","Sapiens","YNH", 699);
        Book Sherlock = new Book("5432", "Sherlock Holmes","ACD" ,700);

        database.addBook(HarryPotter);
        database.addBook(Sapiens);
        database.addBook(Sherlock);

        User me = new User(database);

        me.display();
    }
}
