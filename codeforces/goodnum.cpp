#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    int n,k;
    cin >> n >> k;
    int t=n;
    int a[n];
    for(int i=0; i < n; i++){
        cin>>a[i];
    }
    for(int i=0; i < n; i++){
        int d[k+1];
        for(int i=0; i<=k; i++) d[i] = 0;
        while(a[i]/10 != 0){
            if(a[i]%10 <=k)
                d[a[i]%10]++;
            a[i] = a[i]/10;

        }
        for(int i=0; i <= k; i++){
            cerr <<d[i]<<endl;
            if(d[i] == 0){
              t--;
              break;
            }
        }
    }
    cout<<t;
}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
