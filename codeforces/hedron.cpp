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
    int n;
    cin>>n;
    int sum_face=0;
    char c[5]={'I','C','D','T','O'};
    while(n--){
        string s;
        cin>>s;
        if(c[0]==c[0]) sum_face += 20;
        if(s[0]==c[1]) sum_face += 6;
        if(s[0]==c[2]) sum_face += 12;
        if(s[0]==c[3]) sum_face += 4;
        if(s[0]==c[4]) sum_face += 8;
    }
    cout<<sum_face<<"\n";
}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();
}
