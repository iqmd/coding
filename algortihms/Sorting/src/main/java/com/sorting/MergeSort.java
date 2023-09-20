package com.sorting;


public class MergeSort {

    private int[] arr;

    MergeSort(int[] arr){
        this.arr = arr;
    }

    public int[] sort(){
       return divide(arr) ;
    }

    public int[] divide(int[] subarr){
        if(subarr.length <= 1){
            return subarr;
        }
        int mid = subarr.length/2;
        int[] left = new int[mid];
        int[] right = new int[mid];

        for(int i=0; i < mid; i++){
           left[i] = subarr[i] ;
           right[i] = subarr[i+mid];
        }
        //divide
        left = divide(left);
        right = divide(right);

        //conquer
        return mergeSort(left, right);
    }

    public int[] mergeSort(int[] left, int[] right){
       int length = left.length+right.length;
       int[] result = new int[length];

       int i=0;
       int j =0;
       int k = 0;
       while(i < left.length && j < right.length){
           if(left[i] <= right[j]){
               result[k] = left[i];
               i++;
           }else{
               result[k] = right[j];
               j++;
           }
           k++;
       }

       while(i < left.length){
           result[k] = left[i];
           i++;
           k++;
       }
       while(j < right.length){
           result[k] = right[j];
           j++;
           k++;
       }


       return result;
    }



}
