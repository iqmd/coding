import java.util.ArrayList;
public class DP{
    public static void main(String[] args) {
        int[] A = {4,6,8,456,2,13,9,2};
        System.out.println(findMax(A,0));

        String text = "daggad";
        System.out.println(isPalindrome(text, 0, text.length()-1));

        int[] B = {8,6,5,4,3,2,1};
        System.out.println(isSequence(B, B.length-1));

        System.out.println(sum(12345));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(7);
        boolean[] used = new boolean[a.size()];
        ArrayList<Integer> partial = new ArrayList<>();
        permute(a,partial,used);

        
    }

    //Find max with recursion
    static int findMax(int[] A, int index){
        if(index == A.length-1){
            return A[A.length-1];
        }

        return Math.max(A[index], findMax(A,index+1));
    }

    //Palindrome with recursion
    static boolean isPalindrome(String text, int i, int j){
        if(i >= j){
            return true;
        }

        return isPalindrome(text,i+1,j-1) && text.charAt(i) == text.charAt(j);
    }

    //Is Sequence
    static boolean isSequence(int[] A, int i){
        return i == 0 || A[i] == A[i-1]+1 || A[i] == A[i-1] - 1  && isSequence(A,i-1);
    }

    //Sum
    static long sum(int A){
        if(A == 0){
            return 0;
        }
        return A%10 + sum(A/10);
    }

    //permutation
    static void permute(ArrayList<Integer> a, ArrayList<Integer> partial,boolean[] used){
        if(partial.size() == a.size()){
            System.out.println(String.valueOf(partial));
        }

        for(int i=0; i < a.size(); i++){
            if(!used[i]){
                partial.add(a.get(i));
                used[i] = true;
                permute(a,partial,used);
                partial.remove(a.get(i));
                used[i] =false;
            }
           
        }
    }
}