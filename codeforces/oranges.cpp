#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n,b,d,e;
    int wc =0, juice = 0;
    cin>>n>>b>>d;
    for(int i=0; i<n;i++){
        cin>>e;
        if(e <= b){
            juice += e;
            if(juice > d){
                wc++;
                juice = 0;

            }
        }
    } 
    cout<<wc;
}
