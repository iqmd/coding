package com.onlinebookstore.controller;

import com.onlinebookstore.model.*;

/**
 * BookService
 */
public class BookService extends Book{
    private int units = 1;

    public BookService(Book book, int units){
        super(book.getISBN(),book.getName(), book.getAuthor(), book.getPrice());
        this.units = units;
    }


    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double totalPrice(){
        return getPrice()*units;
    }


}
