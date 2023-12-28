#include <bits/stdc++.h>
#include <cctype>
#include <climits>
#include <unordered_map>

using namespace std;

class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {

      int removeTime = 0;
      for(int i = 1; i < colors.size(); i++){
        if(colors[i-1] == colors[i]){
          if(neededTime[i] < neededTime[i-1]){
            removeTime += neededTime[i];
            neededTime[i] = neededTime[i-1];
          }else{
            removeTime += neededTime[i-1];
            neededTime[i-1] = neededTime[i];
          }
        }
      }
      return removeTime;



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

  int n, k, target;

  cin >> n >> k >> target;
  cout << n << "," << k << "," << target << endl;
  return 0;
}
