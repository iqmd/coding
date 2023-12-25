#include <bits/stdc++.h>
#include <cctype>
#include <unordered_map>

using namespace std;

class Solution {
public:
    bool isPathCrossing(string path) {
        set<pair<int,int>> points;

        unordered_map<char,pair<int,int>> dirs;

        dirs['N'] = {0,1};
        dirs['S'] = {0,-1};
        dirs['E'] = {1,0};
        dirs['W'] = {-1,0};

        points.insert({0,0});
        pair<int,int> last_pos = {0,0};

        for(const auto& p : path){
          last_pos.first += dirs[p].first;
          last_pos.second += dirs[p].second;

          if(points.count(last_pos)){
            return true;
          }else{
            points.insert(last_pos);
          }
        }

        return false;
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
