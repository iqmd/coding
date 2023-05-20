#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

#define debug(x) cerr << x <<" "

void run_case(){
    int n, ans;
    cin >> n;
    vector<int> a(n+2);
    a[0] = INT_MAX;
    a[n+1] = INT_MAX;

    for (int i = 1; i <=n; i++) {
       cin >> a[i];
    }
    int maxwater = 0;
    for(int j=1; j <=n; j++){
        int l, r;
        l = r = j;
        int water = 1;
        while(a[l-1] <= a[l]){
            l--;
            water++;
        }
        while(a[r+1] <= a[r]){
            r++;
            water++;
        }
        maxwater = max(maxwater, water);
    }
    cout << ans <<"\n";

}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
