#include <algorithm>
#include<bits/stdc++.h>
#include <queue>

using namespace std;

//[1,1,1,2,2,3]
//count the numbers
//1:3
//2:2
//3:1
//
template<typename T>
void print(T& var){
    for(auto i: var){
        cout<<i<<",";
    }
}

 vector<int> solve(vector<int>& nums, int k){

    map<int, int> counts;
    vector<int> ans;
    priority_queue<pair<int, int>> q;

    for(auto i:nums){
        counts[i] = count(nums.begin(), nums.end(), i);
    }


    for(auto a: counts){
        q.push({a.second, a.first});
    }
    while(k--){
        ans.push_back(q.top().second);
        q.pop();

    }
    return ans;
    }




int main(){
    vector<int> nums{3,0,1,0};
    auto r = solve(nums,1);
    print(r);

}
