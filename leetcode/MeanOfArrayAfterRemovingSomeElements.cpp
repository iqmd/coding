#include<bits/stdc++.h>
#include <cmath>

using namespace std;

//psuedocode
//sort the array
//remove the first 5% elements i.e. 0.05*size of the array 0.05*5 = 0.25 so we will have to take 
//ceiling value , say we have 23 elements , no of elements to remove 23*0.05 = 1.15 ceiling value 2 
//do the same with last elemetns 
//save the elements to remove in "remint"
//nums.begin()+remint, num.end()-(remint+1)
//then we can take the average of remaining elements
//sum/size-(2*remint)

double solve(vector<int>& arr){
    sort(arr.begin(),arr.end());
    int lengthofarr = arr.size();
    int remint = ceil(0.05*lengthofarr);
    double sum = 0;
    for(auto i= arr.begin()+remint; i< arr.end()-remint;i++){
       sum += *i; 
    }
    double average = sum/(lengthofarr-(2*remint));
    return average;
}


int main(){

    vector<int> nums{6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
    double ans = solve(nums);
    cout<<ans;
    return 0;


}
