public class Main{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
        int k = 12;
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(arr[mid] == k){
                System.out.println(mid);
                break;
            }else if(arr[mid] < k){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(left > right){
            System.out.println("Element not found !!");
        }
    }
}
