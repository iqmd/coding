#include <bits/stdc++.h>
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
    int n,a;
    cin>>n>>a;
    int t[n];
    for(int i=0; i<n; i++){
        cin>>t[i];
    }



}
