#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int e; 
    set<int> d;
    for(int i =0; i< 4 ; i++){
        cin>>e;
        d.insert(e);
    }
    cout<<4-d.size();
}
