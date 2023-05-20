#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;


template<typename T>
void read(vector<T>& v, int n,int s=0){
    for(int i=s; i< n; i++){
        cin>>v[i];
    }
}

template<typename T>
void print(vector<T>& v,int s=0){
    for(int i=s; i<v.size(); i++){
        cout<<v[i]<<" ";
    }
    cout<<"\n";
}


int a[1000];

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n;
    cin>>n;
    for(int i=1; i <=n; i++){
        int x;
        cin>>x;
        a[x] = i;

    }
    for(int i=1; i<n+1; i++){
        cout<<a[i];
    }

    
}
