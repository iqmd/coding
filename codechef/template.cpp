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
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> a(n);
        vector<int> b(n);
        vec(a,n);
        vec(b,n);
        map<int, pair<int,int>> likes;
        for (int i=1;i<=n;i++) {
            likes[i] = {a[i], b[i]};
        }
        for(auto v:likes){
            cout<<v.first<<v.second.first<<v.second.second;
        }

    }

}
