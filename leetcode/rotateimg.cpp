#include<bits/stdc++.h>

using namespace std;

void rotate(vector<vector<int>>& matrix) {
  int n,m, i=0, j=0;
  n = m = matrix[0].size();
  int temp = matrix[0][0];
  fo  swap(temp,matrix[0][m]);
  swap(temp,matrix[n][m]);
  swap(temp,matrix[n][0]);
  swap(temp,matrix[0][0]);
  return matrix;
}
int main(){
  ans = vowelStrings(words,queries);
  for(int i=0; i < ans.size(); i++){
    cout <<ans[i];
  }
  return 0;
}
