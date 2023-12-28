#include <bits/stdc++.h>
#include <cctype>
#include <unordered_map>

using namespace std;

class Solution {
public:
    int numDecodings(string s) {
      // unordered_map<string,int> dp;
      vector<int> dp(s.size());
      return decode(0,s,dp);
    }

    int decode(int i, string s,vector<int> dp){

        if(s.size() == 0){
            return dp[i] = 1;
        }
        if(dp[i] != -1){
          return dp[i];
        }

      string sub1 = s.substr(0,1);
      string sub2 = s.substr(0,2);

      int ways = 0;
      if(stoi(sub1) <= 26 && sub1[0] != '0'){
        int size = s.size() - 1;
        if(size >= 0)
            ways += decode(i+1,s.substr(1,size),dp);
      }
      if(stoi(sub2) <= 26 && sub2[0] != '0'){
        int size = s.size() - 2;
        if(size >= 0)
            ways += decode(i+2,s.substr(2,size),dp);
      }

      dp[i] = ways;
      return ways;
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
  return 0;
}
