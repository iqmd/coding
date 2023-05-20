#include <bits/stdc++.h>
#include <cctype>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

template<typename T>
void vec(vector<T>& v, int n,int s=0){
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
    int l;
    int p,q;
    cin>>l;
    cin>>p;
    int ap;
    int maxs=INT_MIN;
    for(int i=0; i<p; i++){
        cin>>ap;
        maxs = max(maxs,ap);
    }
    cin>>q;
    int aq;
    for(int i=0; i<q; i++){
        cin>>aq;
        maxs=max(maxs,aq);
    }
    if(maxs >= l) cout<<"I become the guy.";
    else cout<<"Oh, my keyboard!";

}
