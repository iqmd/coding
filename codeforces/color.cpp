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
bool run_case(){
    int n,m;
    cin>>n>>m;
    char colors[m];
    bool flag = true;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
           cin>>colors[j];
           if(colors[j] == 'C' || colors[j] == 'M' || colors[j] == 'Y'){
               flag = false;
           }
        }
    }
    return flag;
}
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    bool flag;
    flag=run_case();
    if(flag) cout<<"#Black&White\n";
    else cout<<"#Color\n";
    cout<<>


}
