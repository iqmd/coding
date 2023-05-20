#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n,t,k,d;
    int m1,m2;
    cin>>n>>t>>k>>d;

    m1 = (n/k)*t;
    m2 =  m1-d;
    if(d>=t){
        cout<<"NO";
    }else{
        cout<<"YES";
    }

//    if(m2>=t && m2 > 0){
//        cout<<"YES";
//    }else{
//        cout<<"NO";
//    }


}
