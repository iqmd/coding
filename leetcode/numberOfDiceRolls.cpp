#include <bits/stdc++.h>
#include <cctype>
#include <unordered_map>

using namespace std;
class Solution {
public:
    int M = 1000000007;
    int numRollsToTarget(int n, int k, int target) {
        vector<vector<long>> dp(n+1,vector<long>(target+1,-1L));
        vector<int> memo(target,-1);
        cout << solve(n,target,k,dp);
        return 0;
    }

    long solve(int i, int n, int k,vector<vector<long>>dp){
        if(i == 0){
            if(n == 0) return 1;
            return 0;
        }
        if(dp[i][n] != -1){
            // cout << "here";
            return dp[i][n];
        }

        for(int j = 1; j <= k; j++){
            dp[i][n-j]= solve(i-1, n - j,k,dp);
        }

        return dp[i][n];

    }
};

int main() {

  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

#ifndef ONLINE_JUDGE
  // for getting input from input.txt
  freopen("input.txt", "r", stdin);
  // for writing output to output.txt
  freopen("output.txt", "w", stdout);
#endif

  Solution sol;
  int n , k , target;

  cin >> n >> k >> target;
  sol.numRollsToTarget(n, k, target);
  return 0;
}
