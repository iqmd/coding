#include <bits/stdc++.h>
#include <climits>
#include <string>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

#define debug(x) cerr << x <<" "


void run_case(){
    int n,k;
    cin >> n >> k;

    int goodNums = n;

    while(n--){
       int num;
       cin >> num;

       while(num/10){
           cout << num << endl;
           if(num%10 >= k){
              goodNums--;
           }
           num = num/10;
       }
    }

    cout << goodNums << "\n";
}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
