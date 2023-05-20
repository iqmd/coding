#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define all(container)container.begin(),container.end()

template<typename T>
void read( T& v){
    for(auto i=v.begin(); i != v.end(); i++){
        cin>>*i;
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
    int n,count=0;
    cin>>n;
    if(n <= 2) cout<<0<<"\n";
    else{

        vector<int> a(n);
        for(int i=0; i<n; i++){
            cin>>a[i];
        }
        sort(all(a));
        print(a,n);

    }
    

}
