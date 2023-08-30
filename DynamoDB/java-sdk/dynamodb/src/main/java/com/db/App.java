package com.db;

import java.util.Scanner;

public class App {
    public static void main(String args[]){

       Scanner read = new Scanner(System.in);
       String answer = "y";
       PutItem newItem = new PutItem();
       while(answer.equals("y")){
           newItem.putItem();
           System.out.println("Do you want to add more item ?");
           answer = read.nextLine();
       }

       read.close();
    }
}
