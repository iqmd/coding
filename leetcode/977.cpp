#include<bits/stdc++.h>
#include <climits>
#include <vector>

using namespace std;

template<typename T>
void print(T& var){
    for(auto i: var){
        cout<<i<<",";
    }
}

//-3 -2 -1 2 4 5 6
//4 16 25 36 l
//1 4 9f

vector<int> solve(vector<int>& nums){
    int f,l;
    f = 0;
    l = nums.size() -1;

    vector<int> res;

    while(f <=l ){
        int fsq = nums[f] * nums[f];
        int lsq = nums[l] * nums[l];

        if(fsq > lsq){
            res.push_back(fsq);
            f++;
        }else{
            res.push_back(lsq);
            l--;
        }
    }
    
    reverse(res.begin(), res.end());
        

    return res;

}


int main(){
    int T;
    while(T--){
        int A,B,X;
        cin>>A>>B>>X;
        cout<<(B-A)/X;  
    }
}
