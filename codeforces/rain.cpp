#include <bits/stdc++.h>
#include <climits>
#include <string>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

#define debug(x) cerr << x <<" "


void run_case(){
    int n, m, k;
    cin >> n >> m >> k;

    vector<int> a(n);
    vector<int> b(m);
    vector<int> result(k+1,0);

    int kby2 =  k/2;


    for(auto& e : a){
        cin >> e;
    }

    for(auto& e : b){
        cin >> e;
    }

    if(n < kby2 || m < kby2){
        cout << "NO";
    }

    int i = 0;
    int j = 0;

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    while(i < kby2 || j < kby2){

        if(a[i] < a[j] && i < kby2){
            i++;
        }else if(a[i] > a[j]){
            j++;
        }

    }


}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int t;
    cin >> t;

    while(t--){
        run_case();
        cout << endl;
    }

}
