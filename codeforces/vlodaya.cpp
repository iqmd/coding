#include <bits/stdc++.h>
#include <cstdint>
using namespace std;
using ll = intmax_t;


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
    ll n,k,e;
    cin>>n>>k;
    if(n%2==0) e= n/2; 
    else e=(n/2)+1;
    
    if(k>e){
        cout<<(k-e)*2<<endl;
    }else{
        cout<<k*2-1<<endl;
    }

   

}
