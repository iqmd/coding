#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int a1,a2,a3,a4,cal=0;
    cin>>a1>>a2>>a3>>a4;
    string s;
    cin>>s;
    for(auto c:s){
        if(c == '1') cal += a1; 
        if(c == '2') cal += a2; 
        if(c == '3') cal += a3; 
        if(c == '4') cal += a4; 

    }
    cout<<cal;
}
