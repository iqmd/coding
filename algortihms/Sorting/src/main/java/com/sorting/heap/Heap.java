package com.sorting.heap;


public class Heap {

    private int[] heap;
    private int N = 0;

    public Heap(int cap){
        heap = new int[cap+1];
    }

    public void insert(int k){
        heap[++N] = k;
        swim(N);
    }

    public int delMax(){
        int max = heap[0];
        exch(0,N--);
        sink(0);
        return max;
    }

    private void swim(int i){
        while(i > 1 && less(i/2,i)){
            exch(i,i/2);
            i = i/2;
        }
    }

    private void sink(int i){
        while(2*i <= N){
            int j = 2*i;
            if(j < N && less(j, j+1)) j++;
            if(!less(i,j)) break;
            exch(i,j);
            i=j;
        }
    }

    private boolean less(int i, int j){
        return heap[i] < heap[j];
    }

    private void exch(int i, int j){
       int temp = heap[i];
       heap[i] = heap[j];
       heap[j] = temp;
    }

}
