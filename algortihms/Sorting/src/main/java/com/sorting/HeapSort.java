package com.sorting;
import com.sorting.heap.*;


public class HeapSort {

    int[] arr;
    Heap heap;

    HeapSort(int[] arr){
        this.arr = arr;
        heap = new Heap(arr.length);
        add();
    }

    private void add(){
        for(int i=0; i< arr.length; i++){
            heap.insert(arr[i]);
        }
    }

    public int[] sort(){
       int[] sorted = new int[arr.length];
       for(int i=0; i < sorted.length; i++){
           sorted[i] = heap.delMax();
       }

       return sorted;
    }

}
