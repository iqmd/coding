package com.sorting;

import java.util.Random;

public class GenerateRandomNumber {

    private int size;

    GenerateRandomNumber(int size){
        this.size = size;
    }

    public int[] getArray(){
        Random random = new Random();
        int[] array = new  int[size];

        for(int i=0 ; i < size; i++){
            array[i] = random.nextInt(1000000);
        }

        return array;
    }

}
