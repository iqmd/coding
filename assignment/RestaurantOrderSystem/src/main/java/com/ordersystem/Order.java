package com.ordersystem;

import java.util.*;

public class Order {

    public static Order order = null;

    private HashMap<String,Item> items = new HashMap<>();

    private Order(){}

    public static Order getInstance(){
        if(order == null){
            return new Order();
        }

        return order;
    }
    public void addItem(Item item){
        items.put(item.getFood(),item);
    }

    public void removeItem(Item item){
        items.remove(item.getFood());
    }

    public void submit(){
        System.out.println("Order Submitted");
        for(Item i:items.values()){
            System.out.println(i.getFood());
        }
    }
}
