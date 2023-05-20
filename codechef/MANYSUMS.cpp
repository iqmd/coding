#include<bits/stdc++.h>

using namespace std;


//psuedocode
// {2,3,4,5,6,7}
// 7-2+1
// 4 5 6 7 8 9 10 11 12 13 14
//
// 4 5 6 7 9 8 10 11 12 
//{11,12,13,14,15}
//22,23,24,25,26,27,28,29
int main(){
    int t;
    cin>>t;

    while(t--){
        int l,r,sum;
        cin>>l>>r;
        sum = r-l+1;
        cout<<sum+(sum-1)<<endl;


        
    }
}
