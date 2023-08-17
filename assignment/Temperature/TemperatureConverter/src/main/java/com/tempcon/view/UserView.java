package com.tempcon.view;

import java.util.Scanner;

import com.tempcon.model.*;
import com.tempcon.controller.*;
    ;

/**
 * UserView
 */
public class UserView {

    Scanner read = new Scanner(System.in);
    Temperature temp ;
    TempConv convert ;

    public void display(){
        System.out.println("Celsius(1) or Fahrenheit(2)");
        int choice = Integer.parseInt(read.nextLine());

        System.out.println("Enter Temperature :");

        double  temperature = Integer.parseInt(read.nextLine());

        if(choice == 1){

            temp = new Celsius(temperature);
            System.out.println("Do you want it in Fahrenheit ?(y/n)");
            String op = read.nextLine();

            if(op.equals("y")){
                convert = new TempConv(temp);
                temp = convert.convertToFahrenheit();
                System.out.println("Temperature in Fahrenheit :"+temp.getTemp());
            }
        }else if(choice == 2){
            temp= new Fahrenheit(temperature);
            System.out.println("Do you want it in Celsius ?(y/n)");
            String op = read.nextLine();

            if(op.equals("y")){
                convert = new TempConv(temp);
                temp = convert.convertToCelsius();
                System.out.println("Temperature in Celsius :"+temp.getTemp());
            }
        }

    }
}
