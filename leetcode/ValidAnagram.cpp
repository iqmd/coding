#include <bits/stdc++.h>
#include <cctype>

using namespace std;


class Solution {
public:
    bool isPalindrome(string s) {

      int i = 0;
      int j = s.size();

      while(i < j){
        bool left = isalphanum(s[i]);
        bool right = isalphanum(s[j]);

        if(left && right){
          if(getChar(s[i]) != getChar(s[j])){
            return false;
          }
          i++;
          j--;
        }else if(!left && right){
          i++;
        }else if(left && !right){
          j--;
        }else{
          i++;
          j--;
        }
      }

      return true;

    }

    bool isalphanum(char ch){
      if(ch >= 'A' && ch <= 'Z'){
        return true;
      }else if(ch >= 'a' && ch <= 'z'){
        return true;
      }else if(ch >= '0' && ch <= '9'){
        return true;
      }
      return false;
    }

    char getChar(char ch){
      if(ch >= 'A'&& ch <= 'Z'){
        return ch + 32;
      }
      return ch;
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
