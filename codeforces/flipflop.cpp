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

int run_case(){
    int n,e,sum=0,prev=0;
    cin>>n;
    if(n == 2){
        int e1,e2;
        cin>>e1>>e2;
        return -e1-e2;
    }
    for (int i = 0; i < n; i++) {
       cin>>e;
       if(e < 0 && prev < 0){
           sum += 3;
           prev= 0;

       }else{
           sum += e;
           prev = e;
       }
    }
    return sum;
}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int t;
    cin>>t;
    while(t--){
        cout<<run_case()<<"\n";
    }


}
