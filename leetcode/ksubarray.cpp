#include<iostream>
#include<vector>

using namespace std;

vector<int> ksubarraysum(vector<int> &A,int k){
    vector<int> res;
    int sum=0;
    for(int i=0; i<k;i++){
        sum += A[i];
    }
    res.push_back(sum);
    for(int i = 0; i < A.size(); i++){
        sum -= A[i];
        sum += A[i+k];
        res.push_back(sum);
    }
    return res;
}

int main(){

}
