public class Main{
    public static void main(String args[]){
        int arr[] ={1,5,4,2,3,7,9};
        int elem = 1;
        int n = 12;
        int numbers[] = new int[n+1];
        numbers[0] = 1;
        for(int i = 1; i < numbers.length; i++){
            numbers[i] = 0;
        }
        for(int i = 0; i < arr.length; i++){
            numbers[arr[i]] = 1;
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0){
                System.out.println(i);
            }
        }
    }
}
