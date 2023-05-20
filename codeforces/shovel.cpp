#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

//117 3 
//k = 117
//r = 3
//k*ns/10 +r= min
//117*2/10 +r = min
//53 = 10*5 + 3
//117*1/10 = 7
//117*2/10

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int k,r;
    cin>>k>>r;
    int i = 0, rem = 0;
    while(rem != r){
        i++;
        if(k*i%10==0){
            break;
        }else{
            rem = k*i%10;
        } 
    }
    cout<<i;


}
