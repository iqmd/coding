#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    int n;
    cin >> n;
    vector<char> encoded(n+1);
    for(int i=1; i <= n; i++){
       cin >> encoded[i];
    }
    vector<int> code(n+1);
    vector<char> ans(n+1);
    for(int i=1; i <= n; i++){
       code[i] = i;
    }
    int mid = 0;
    for(int i=1; i <=n; i++){
        mid = (n-i+1)/2;
        if((n-i+1)%2!=0)
            mid++;
        ans[code[mid]] = encoded[i];
        for(int j=mid; j <= n-i+1; j++){
            code[j] = code[j+1];
        }
    }
    for(int i=1; i <=n; i++) cout << ans[i];

}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();
    cout << "\n";

}
