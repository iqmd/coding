#include<bits/stdc++.h>

using namespace std;






int main(){
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n>>k;

        int a[n];
        for(int i = 0; i<n;i++){
            cin>>a[i];

        }
        for(int i = 0; i< n; i++){
            if(k - a[i] < 0){
                cout<<0;
            }else{
                cout<<1;
                k -= a[i];
            }
        }
        cout<<endl;

    }
}
