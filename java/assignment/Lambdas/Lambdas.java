public class Lambdas{
    public static void main(String args[]){

        //isOdd
        operations numbers = (n) -> n%2==1;

        //isPalindrome
        palindrome plndr = (n) -> {
            String str = Integer.toString(n);
            int i = 0;
            int j = str.length() -1;

            while(i <j){
                if(str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;

        };

        //isPrime
        prime isitprime = (n)-> {
            for(int i = 2; i <=n; i++){
                if(n%i == 0){
                    if(i == n){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        };

        System.out.println("Is it Odd : "+numbers.isOdd(5));
        System.out.println("Is it Palindrome : "+plndr.isPalindrome(67765));
        System.out.println("Is it Prime : "+isitprime.isPrime(48));
        

    }
}
