#include<bits/stdc++.h>

using namespace std;



int main(){
    int t;
    cin>>t;

    while(t--){
        int w1,w2,x1,x2,m;
        cin>>w1>>w2>>x1>>x2>>m;

        int mx1 = m*x1;
        int mx2 = m*x2;

        int incw = w2 -w1;

        if(incw >= mx1 && incw <= mx2){
            cout<<1<<endl;
        }else{
            cout<<0<<endl;
        }
        
    }
}
