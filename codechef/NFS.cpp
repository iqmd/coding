#include<bits/stdc++.h>
#include <cmath>

using namespace std;



int main(){
    int t;
    cin>>t;

    while(t--){
        float u,v,a,s;
        cin>>u>>v>>a>>s;

        float allowed_vel;
        allowed_vel = sqrt(u*u - 2*a*s);
        if(u <= v){

            cout<<"Yes"<<endl;
            continue;
        }
        else if(allowed_vel <= v)
            cout<<"Yes"<<endl;
        else
            cout<<"No"<<endl;


        
    }
}
