package com.onlinebookstore.model;

import java.util.*;

import com.onlinebookstore.controller.BookService;


/**
 * Cart
 */
public class Cart {
    private List<BookService> bookCart = new ArrayList<>();

    private double OrderAmount = 0;

    public Cart(){}


    public void  listBooks() {
        int i=1;
        for(BookService bk:bookCart){
            System.out.println(i+" : "+bk.getName()+" Units : "+bk.getUnits());
        }
        i++;
    }

    public void addBook(Book book, int units){
        bookCart.add(new BookService(book, units));
        OrderAmount += bookCart.get(bookCart.size()-1).totalPrice();
    }

    public void removeBook(Book book,int units){
        for(int i=0; i < bookCart.size(); i++){
            if(book.getISBN().equals(bookCart.get(i).getISBN())){
                if(bookCart.get(i).getUnits() - units > 0){
                    int newunits = bookCart.get(i).getUnits() - units;
                    bookCart.get(i).setUnits(newunits);
                    OrderAmount -= bookCart.get(i).totalPrice();
                }else{
                    OrderAmount -= bookCart.get(i).totalPrice();
                    bookCart.remove(i);
                }
            }
        }
    }


    public double getOrderAmount(){
        return OrderAmount;
    }


}
