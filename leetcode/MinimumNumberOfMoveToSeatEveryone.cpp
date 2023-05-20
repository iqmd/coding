#include<bits/stdc++.h>
#include <cmath>

using namespace std;
//psuedocode
//n seats and n students
//seats[i] = position of ith seats ex: 1st seat is at 3rd position
//students[j] = position of jth students ex: 2nd  student is at 4th position 
//[3,1,5] [2,7,4]
//1->s2->3->s4->5->s7
//   -1     -1     -2
//
//[1,4,5,9] [1+0,2+2,3+2,6+3]
//sort both arrays
//iterate over seats
//for each seat look at students 1->1 , 4->2 , 
//difference seats[i] ~ students[i]
//add the difference
//[2,2,6,6] [1,2,3,6]
//2->1 = 1
//2->2 = 0
//6->3 = 3
//6->6 = 0


int solve(vector<int>& seats,vector<int>& students){
    sort(seats.begin(), seats.end());
    sort(students.begin(), students.end());
    int sumdiff = 0;
    int diff;
    for(auto i = 0; i < seats.size(); i++){
        diff = abs(seats[i]-students[i]);
        sumdiff += diff;
    }

    return sumdiff;

}


int main(){

    vector<int> nums{2,2,6,6};
    vector<int> num{1,3,2,6};
    int res = solve(nums,num);
    cout<<res;
    return 0;


}
