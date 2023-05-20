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
    ll n,t,digits=0;
    cin>>n>>t;
    if(n==1 && t==10) cout<<-1;
    else{

        for(ll i=pow(10,n-1); i< pow(10, n+1); i++){
            if(i%t==0){
                cout<<i<<"\n";
                break;
            }
        }
    }

}
