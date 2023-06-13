import java.util.*;
public class Main{
    public static void main(String args[]){
        for(int i = 0; i < 50; i++){
            System.out.println(fibonacci(i));
        }

    }
    public static int fibonacci(int n){
        if(n == 1)
            return 1;
        if(n == 0) 
            return 0;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
