package com.onlinebookstore.view;

import com.onlinebookstore.model.*;


/**
 * BookView
 */
public class BookView {
    private Book book;
    public BookView(Book book){
        this.book = book;
    }

    public void viewBook(){
        System.out.printf("Details of your book : \n Name : %s\n Author : %s \n Price : %.2f",book.getName(), book.getAuthor(), book.getPrice());
    }
}
