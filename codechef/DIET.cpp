#include<bits/stdc++.h>
#include <cmath>
#include <unordered_map>

using namespace std;

//k = 5
//7 3 6 5
//0+7-5 2+3-5 0+6-5 1+5-5
//3 10 10 
//0+3 > 4 false 
//+7 >5 true
//diff = 7 -5
//2+3 >= 5 true
//diff = 5-5 0
//0+ 6 >


#define tt    \
    int t;    \
    cin >> t; \
    while (t--)


int main(){
    tt{
        int n,k;
        cin>>n>>k;

        int a[n];
        for(int i = 0; i < n; i++){
            cin>>a[i];
    }

    int diff = 0;
    bool flag = true;
    int index;
    for(int i = 0; i < n;  i++){
        if(diff + a[i] >= k){
            diff = diff + a[i] -k;

        }else{
            flag = false;
            index = i+1;
            break;
        }
    }

    if(flag){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO "<<index<<endl;
    }


}


}
