#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    int n,sum=0;
    cin>>n;
    vector<int> a(n);
    for(int i=0; i < n; i++){
        cin>>a[i];
        sum += a[i]/2;
    }

    int k = 0;
    while(sum != 0){
        int flag = 1;
        if(sum < 0){
            if(a[k] > 0){
                if(a[k]%2 != 0){
                    a[k] = (a[k]/2)+1;
                    sum++;
                    flag=0;
                }
            }

        }else{
            if(a[k] < 0){
                if(a[k]%2 != 0){
                    a[k] = (a[k]/2)-1;
                    sum--;
                    flag = 0;
                }
            }

        }
        if(flag) a[k] =  a[k]/2;
        k++;
    }
    for(int i = k; i < n; i++) a[i] = a[i]/2;
    for(auto v:a) cout<<v<<endl;



}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
