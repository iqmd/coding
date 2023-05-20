#include<bits/stdc++.h>

int searchInsert(vector<int>& nums, int target){
    int left = 0;
    int right = nums.size()-1;
    int mid;

    while(left <= right ){
        mid = (left + right)/2;

        if (nums[mid] == target){
            return mid;
        }else if (nums[mid] < target){
            mid = left +1;
        }else {
            mid = right -1;
        }

    }
    return left;
}

int main(){

    return 0;
}
