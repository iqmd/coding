import java.util.*;
public class Main{
    public static void main(String args[]){
        int arr[] ={1,5,4,2,3,7,9};
        Arrays.sort(arr);
        int elem = 1;
        int n = 12;
        int i = 0;
        while(elem < n && i < arr.length){
            if(arr[i] != elem){
                System.out.println(elem);
                elem++;
            }else{
                elem++;
                i++;
            }
        }
        if(i == arr.length){
                for(; elem <= n; elem++){
                    if(elem != arr[i-1]){
                        System.out.println(elem);
                }
            }
        }
//        for(int i=0; i < n; i++){
//            if(arr[i] != elem){
//                System.out.println(elem);
//                elem += 2;
//            }else{
//                elem++;
//            }
//        }
    }
}
