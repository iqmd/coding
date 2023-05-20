#include<bits/stdc++.h>

using namespace std;



int main(){
    int t;
    cin>>t;

    while(t--){
        float s,a,b,c;
        float res;
        cin>>s>>a>>b>>c;

        res = s + (s*c)/100;

        if(res >= a && res <= b)
            cout<<"Yes\n";
        else
            cout<<"No\n";

        

        
    }
}
