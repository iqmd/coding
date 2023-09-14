package com.sn;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Network network = new Network();
        Scanner read = new Scanner(System.in);
        String answer = "y";

        while(answer.equals("y")){
            network.addFriend();
            System.out.println("Do you want to add more ?(y/n)");
            answer = read.nextLine();
        }

        network.display("0");

    }
}
