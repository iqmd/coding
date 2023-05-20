#include<bits/stdc++.h>

using namespace std;

#define tt\
    int t;\
    cin >> t;\
    while (t--)


int main(){
    tt{
        int n,k;
        cin>>n>>k; 
        int pd =1;
        int a[n];
        for(int i =0;i<n;i++){
            cin>>a[i];
            pd *= a[i];
    }
    cout<<pd<<endl;
    if(pd%k==0){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO"<<endl;
    }


    }

}
