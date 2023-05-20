#include<bits/stdc++.h>

using namespace std;

bool containsDuplicate(vector<int>& nums) {
  vector<int> arr[256];

  for(int i:nums){
    arr[i&0xff].push_back(i);
  }
  for(int i=0; i < 256; i++){
    int n = arr[i].size();
    if (n < 2) continue;
    sort(arr[i].begin(), arr[i].end());
    for(int j=0; j < n-1; j++){
      if(arr[i][j] == arr[i][j+1]){
        return true;
      }
    }
  }
  return false;
}

int main(){
  return 0;
}
