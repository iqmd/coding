#include<bits/stdc++.h>
#include <cmath>
#include <unordered_map>

using namespace std;

#define tt    \
    int t;    \
    cin >> t; \
    while (t--)


int main(){
    tt{
        int x,y,k;
        cin>>x>>y>>k;

        int diff = abs(y - x);
        if(diff%k == 0) {
            cout<<diff/k<<endl;
    }else{
        cout<<diff/k+1<<endl;
    }
    }

}
