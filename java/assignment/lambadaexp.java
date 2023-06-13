interface operations{
    boolean isOdd(int n);
}
public class Main implements operations{
    public static void main(String args[]){
        operations number;

        number = (int n) -> n%2==0; 

        System.out.println(operations.number(4));

    }
}
