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

void run_case(){
    ll n,m,a,k,t;
    cin>>n>>m>>a;
    if(n%a==0) k=n/a;
    else k=(n/a)+1;

    if(m%a==0) t=m/a;
    else t=(m/a)+1;
    cout<<k*t;



}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();


}
