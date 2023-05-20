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


void truncate(){
    int n;
    cin>>n;
    cout<<"You pressed :"<<n;

}

int main() {


    cin.tie(nullptr)->sync_with_stdio(false);
    int t;
    cin>>t;
    while(t--){
        int a[4];
        cin>>a[0]>>a[1]>>a[2]>>a[3];
        int alice=0, bob=0;
        int jokes = 0;
        alice += a[0];
        bob += a[0];
        jokes += a[0];
        while(a[1]&&a[2]){

            if(bob-a[1]< 0){
                alice += bob;
                jokes += bob;
                a[1] -= bob;
                bob = 0;
            }else{
                alice += a[1];
                bob -= a[1];
                jokes += a[1];
                a[1] = 0;
            }
            if(alice-a[2]<0){
                bob += alice;
                jokes += alice;
                a[2] -= alice;
                alice = 0;
            }else{
                bob += a[2];
                alice -= a[2];
                jokes += a[2];
                a[2] =0;
            }

        }

        if(alice-a[3] >= 0 && bob-a[3] >=0) cout<<jokes+ a[3]<<"\n";
        if(alice-a[3] < 0 || bob-a[3] < 0){
            if(alice <= bob) cout<<jokes+alice+1<<"\n";
            else cout<<jokes+bob+1<<"\n";
        }
    }


}
