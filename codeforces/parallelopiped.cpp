#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;


template<typename T>
void read(vector<T>& v, int n,int s){
    for(int i=s; i< n; i++){
        cin>>v[i];
    }
}

template<typename T>
void print(T& v,int n,int s=0){
    for(int i=s; i<n; i++){
        cout<<v[i]<<" ";
    }
    cout<<"\n";
}



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int t;
    cin>>t;
    while(t--){
        int w,d,h;
        cin>>w>>d>>h;
        int a,b,f,g;
        cin>>a>>b>>f>>g;
        int x = min(a+f, abs(w-a+w-f));
        int y = min(b+g, abs(d-b+d-g));
        int x1= abs(a-f);
        int y1= abs(b-g);
        int ans =  1e9;
        ans = min(ans,x+h+y1);
        ans = min(ans,y+h+x1);
        cout<<ans<<"\n";
    } 

}
