#include<bits/stdc++.h>

using namespace std;

#define tt    \
    int t;    \
    cin >> t; \
    while (t--)

//0011 1011
//0011
//have different bit towards the left
//if you have to have same bits put at right
//1010 1000
//0000 -> one= 1 
//0100 -> one = 0 
//
int main(){
    tt{
        string a,b;
        cin>>a>>b;
        cout<<a<<" "<<b;
        for(auto i = 0; i < a.size(); i++){
            if(a[i] == b[i]){
                if(a[i] == 1){
                    b[i] = 0 ;
            }else{
                b[i] = 1;
            }
        }
    }

    }

}
