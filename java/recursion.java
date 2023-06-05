public class Main{
    public static void main(String[] args){
        int arr[] = {4,3,2,1,8};
        recurse(0,arr);

    }
    public static void recurse(int i, int[] A){
        if(i == A.length){
            return;
        }
        System.out.println(A[i]);
        recurse(i+1,A);
    }
}
