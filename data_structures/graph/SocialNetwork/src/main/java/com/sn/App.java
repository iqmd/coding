package com.sn;


public class App
{
    public static void main( String[] args )
    {
        Network network = new Network();
        int i = 0;
        while(i < 5){
            network.takeUser();
            i++;
        }

        i=0;

        while( i < 3){
            network.addFriend();
            i++;
        }

        network.display("otis");

    }
}
