#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getLengthOfOptimalCompression(string s, int k) {
      return solve(0,k,s);
    }

    int solve(int i , int k, string s){
      if(i == s.length()) return 0;

      int start = i;
      int length = 1;

      int cmp_length = 0;

      for(int j = i+1; j <= s.length(); j++){
        if(s[start] != s[j]){
          if(length <= k){
            cmp_length = solve(j,k-length,s) + compress(length);
            cmp_length = min(cmp_length,solve(j,k,s));
          }else{
            return compress(length);
          }
        }else{
          length++;
        }


      }
        return cmp_length;
    }

    int compress(int count){
      if(count < 2) return count;
      if(count < 10) return 2;
      if(count < 100) return 3;
      return 4;
    }

};

    int getCompressedLength(string s){
      int i = 0;
      int length = 0;
      int count =  1;
      for(int j = i+1; j <= s.length(); j++){
        if(s[i] != s[j]) {
          if(count >= 10){
            length += 3;
          }else if(count == 1){
            length += 1;
          }else if(count == 100){
            length += 4;
          }else{
            length += 2;
          }
          i = j;
          count  = 1;
        }else{
          count++;
        }
      }
      return length;
    }

int main() {

  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

#ifndef ONLINE_JUDGE
  // for getting input from input.txt
  freopen("input.txt", "r", stdin);
  // for writing output to output.txt
  freopen("output.txt", "w", stdout);
#endif

  string s;
  int k;


  cin >> s;
  cin >> k;

  Solution sol;
  int ans = sol.getLengthOfOptimalCompression(s, k);
  cout << ans;
  return 0;
}
