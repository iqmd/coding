#include<bits/stdc++.h>

using namespace std;

//pseudocode
//[1,2,0,4]
//1*2*4
//if there is a zero in nums



vector<int> productExceptSelf(vector<int>& nums){
    int pronums = 1;
    int zflag = 0;
    vector<int> res(nums.size(), 0);
    for(int i = 0; i < nums.size(); i++){

        if(nums[i] == 0){
            zflag++;
            continue;

        }
        pronums *= nums[i];

    }

    if (zflag >= 2){
        return res;

    }

    for(int i = 0 ; i < nums.size(); i++){
        if(nums[i] == 0){
            res[i] = pronums;
            return res;
        }else{

        res[i] = pronums/nums[i];
        }
    }
    return res;
}








template<typename T>
void print(T var){
    for(auto i: var){
        cout<<i<<" ";
    }
}



int main(){

    vector<string> strs;

    vector<int> nums{1,2,3,4};
    print(productExceptSelf(nums));
}
