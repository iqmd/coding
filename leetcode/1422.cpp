#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxScore(string s) {

      int sum = 0;

      for(int i = 0; i < s.size() - 1; i++){
        int countZeroes = 0;
        int countOnes = 0;
        for(int j = 0; j <= i; j++){
          if(s[j] == '0'){
            countZeroes++;
          }
        }
        for(int k = i+1; k < s.size(); k++){
          if(s[k] == '1'){
            countOnes++;
          }
        }

        sum = max(sum,countZeroes+countOnes);
      }

      return sum;

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

  vector<int> arr;
  int n ;
  while(cin >> n){
    arr.push_back(n);
  }

  for(auto& v:arr) cout << v << endl;
  cout << sol.canJump(arr) << endl;

  return 0;
}
