import java.util.Arrays;

public class Combinations {

    public static void main(String args[]){
        int n = 13;
        int k = 9;
        int[][] dp = new int[n+1][k+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }

        System.out.println(combineTabulated(n,k,dp));
        System.out.println(combine(n,k,dp));


    }

    static int combine(int n, int k,int[][] dp){
        if(dp[n][k] != -1){
            return dp[n][k];
        }
        if(n==k || k == 0){
            return 1;
        }

        dp[n][k] = combine(n-1,k-1,dp) + combine(n-1,k,dp);
        return dp[n][k];
    }

    static int combineTabulated(int n, int k , int[][] dp){

        for(int i=0; i < n+1; i++){
            for(int j = 0; j < k+1; j++){
                if(i==0){
                    dp[i][j] = 0;
                }else if(j ==0){
                    dp[i][j] = 1;
                }else if(i==j){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];

                }
            }
        }

        return dp[n][k];
    }

}
