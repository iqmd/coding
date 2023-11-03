public class Main {
    public static void main(String args[]){
        String s = "racecar";
        reverse(0,s);
        System.out.println();
        System.out.println("Is palindrome :"+palindrome(0,s.length()-1, s));
    }

    static void reverse(int i , String s){
        if(i == s.length()){
            return;
        }

        reverse(i+1, s);
        System.out.print(s.charAt(i));
    }

    static boolean palindrome(int i, int j,String s){
        if(i > j) {
            return true;
        }

        if(s.charAt(i) == s.charAt(j)){
            return true && palindrome(i+1, j-1, s);
        }
        return false;
    }

}
