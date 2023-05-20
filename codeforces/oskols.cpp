#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int nwire;
    cin>>nwire;
    int wire[nwire+1];
    for(int i = 1; i<= nwire; i++) cin>>wire[i];
    int m;
    cin>>m;
    for(int i = 1; i<=m;i++){
        int x,y;
        cin>>x>>y;
        if(x+1 <= nwire)
            wire[x+1] += wire[x] - y;
        if(x-1 > 0)
            wire[x-1] += y-1;
        wire[x] = 0;

    }
    for(int i =1; i< nwire+1;i++){
        cout<<wire[i]<<endl;
    }
    
}
