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


// 2 types of candies A B
// N different cities
// A should have distinct price in all cities
// B should have distinct price in all cities
// A can 4 in I city
// B can 3 in I city
// A can 3 in J city
// B can 4 in J city
// 1,2,3,4,1,2,3,5
// a 4 i 
// a 4 j
// a 6 k
// b 4 i 
// b 7 j
// b 3 k

string solve(vector<int>& nums){
    for(auto i: nums){
        if (count(nums.begin(), nums.end(), i) > 2){
            return "NO";
        }
    }
    return "YES";

}


int main(){
    int T;
    cin>>T;
    for(int i = 0 ; i < T; ++i){
        cout<<"i"<<i<<"T:"<<T;
        int cities;
        vector<int> nums;
        cin>>cities;
        for(int j = 0; j < 2*cities; ++j){
            int n;
            cin>>n;
            nums.push_back(n);
        }

        //print(nums);
        cout<<solve(nums);


    }

}
