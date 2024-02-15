#include <algorithm>
#include<iostream>
#include <vector>

using namespace std;

vector<int> merge_sort(vector<int>& vec, int l , int r){
    vector<int> merged;
    if(l == r){
        merged.push_back(vec[l]);
        return  merged;
    }

    int mid = (l+r)/2;

    vector<int> left = merge_sort(vec,l,mid);
    vector<int> right = merge_sort(vec,mid+1,r);


    int left_size = left.size();
    int right_size = right.size();

    int i = 0;
    int j = 0;

    while(i < left_size && j < right_size){
        if(left[i] < right[j]){
            merged.push_back(left[i]);
            i++;
        }else if(left[i] > right[j]){
           merged.push_back(right[j]);
           j++;
        }else{
            merged.push_back(left[i]);
            merged.push_back(right[j]);
            i++;
            j++;
        }
    }

    while(i < left_size){
        merged.push_back(left[i]);
        i++;
    }

    while(j < right_size){
        merged.push_back(right[j]);
        j++;
    }

    return merged;
}


int main(){

    vector<int> vec = {4,1,9,45,12,15,0,-4,2,7};
    for(int i = 0; i < 10; i++){
        vec[i] = rand()%100;
    }

    for(int i = 0; i < 10; i++){
        cout << vec[i] << ",";
    }

    cout << endl;

    vector<int> sorted_arr = merge_sort(vec, 0, vec.size()-1);

    for(int i = 0; i < 10; i++){
        cout << sorted_arr[i] << ",";
    }
    sort(vec.begin(), vec.end());

    bool flag = true;

    for(int i = 0; i < 10; i++){
        if(vec[i] != sorted_arr[i]){
            flag = false;
        }
    }

    cout << endl;
    if(flag){
        cout << "ACCEPTED !";
    }else{
        cout << "FAILED !";
    }

    return 0;
}
