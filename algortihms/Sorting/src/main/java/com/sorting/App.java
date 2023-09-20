package com.sorting;

public class App
{
    public static void main( String[] args )
    {
        GenerateRandomNumber genNumber = new GenerateRandomNumber(1000000);
        int[] arr =  genNumber.getArray();
        QuickSort quickSort = new QuickSort(arr);

        long start = System.currentTimeMillis();
        int[] sorted = quickSort.sort();
        long end = System.currentTimeMillis();

        // for(int i=0; i < sorted.length; i++){
        //     System.out.println(sorted[i]);
        // }

        System.out.println("Quick sort took : "+(end-start)+" milliseconds");
        MergeSort mergeSort = new MergeSort(arr);

        start = System.currentTimeMillis();
        sorted = mergeSort.sort();
        end = System.currentTimeMillis();

        // for(int i=0; i < sorted.length; i++){
        //     System.out.println(sorted[i]);
        // }

        System.out.println("Merge sort took : "+(end-start)+" milliseconds");

        HeapSort heapSort = new HeapSort(arr);
        start = System.currentTimeMillis();
        sorted = heapSort.sort();
        end = System.currentTimeMillis();
        System.out.println("HeapSort  took : "+(end-start)+" milliseconds");
    }
}
