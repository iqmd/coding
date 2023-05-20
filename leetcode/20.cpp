#include<bits/stdc++.h>

using namespace std;

template<typename T>
void print(T& var){
    for(auto i: var){
        cout<<i<<",";
    }
}



int  solve(vector<int>& nums){
   int maxc = 0; 
   int count = 1;
    sort(nums.begin(),nums.end());
    for(int i = 1; i < nums.size(); i++){

        if (nums[i] ==  nums[i-1]+ 1){
            count++;
        }else if (nums[i] == nums[i-1]){
            maxc =  max(maxc, count);
            count = 1;
        }

    }

    maxc  = max(maxc, count);

    return maxc;
    
    
}


int main(){

    vector<string> strs;
    vector<int> nums{100,4,200,1,3,2};

    cout<<solve(nums);
}
