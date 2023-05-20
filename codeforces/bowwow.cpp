#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    string n;
    cin >> n;
    if(n.size()%2 == 0)
    cout << (n.size()/2);
    else {
        cout << (n.size()/2)+1;

    }

}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
