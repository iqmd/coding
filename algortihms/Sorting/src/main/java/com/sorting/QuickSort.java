package com.sorting;


public class QuickSort {

    int[] arr;

    QuickSort(int[] arr){
        this.arr = arr;
    }

    public int[] sort(){
        quicksort(arr, 0, arr.length-1);
        return arr;
    }

    public void quicksort(int[] A, int l, int h){
        if(l >= h){
            return ;
        }

        int p = partition(A,l,h);

        quicksort(A,l,p-1);
        quicksort(A,p+1,h);

    }

    private int partition(int[] A, int l, int h){
        int pivot = A[h];

        int i = l-1;

        for(int j=l; j < h; j++){
            if(A[j] <= pivot){
                i++;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        i++;
        int temp = A[i];
        A[i] = A[h];
        A[h] = temp;

        return i;

    }

}
