#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    int n;
    cin >> n;
    string colors;

    if(n%7 == 0){
        int c = n/7;
        for(int i=1; i <=c; i++){
            colors += "VIBGYOR";
        }
    }else{
        int rem = n%7;
        int c = n/7;
        for(int i=1; i <=c; i++){
            colors += "VIBGYOR";
        }
        int start  = c*7-4;
        for(int j= start; j < start + rem; j++){
            colors += colors[j];
        }
    }

    cout << colors << "\n";

}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
