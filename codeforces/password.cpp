#include <bits/stdc++.h>
#include <cctype>
using namespace std;
using ll = int64_t;




int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n,k;
    cin>>n>>k;
    char c;
    for(int i = 0; i<n;i++){
        c=97+(i%k);
        cout<<c;
    }


    
}
