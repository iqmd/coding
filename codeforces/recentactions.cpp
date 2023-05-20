#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    int n, m, a,k=0;
    unordered_set<int> p;
    cin>>n>>m;
    vector<int> t(n,-1);
    for(int i=1; i <=m; i++){
        cin >> a;
        if(p.count(a) == 0 && k < n){
            p.insert(a);
            t[k++] = i;
        }
   }
   for(auto i = t.rbegin(); i != t.rend(); i++) cout<<*i<<" ";
}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int T;
    cin>>T;
    while(T--){
       run_case();
       cout<<endl;
    }

}
