#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

bool run_case(){
    int n,m;
    cin>>n>>m;
    for(int i=1; i <=m-n ; i++){
        n++;
        for(int j=2; j <= n; j++){
            if(n%j == 0 && n != j){
                break;
            }else{
               if(n==m) return true;
               else return false;
            }

        }
    }
}

int main(){
    cin.tie(nullptr)->sync_with_stdio(false);
    bool flag;
    flag=run_case();
    if(flag) cout <<"YES";
    else cout <<"NO";
}
