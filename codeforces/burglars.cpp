#include <bits/stdc++.h>
#include <utility>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

void run_case(){
    int n, m, a, b;
    cin >> n >> m;

    map <int, int> matches;

    for(int i = 0; i < m; i++){
      cin >> a >> b;
      matches[b] = a ;
    }

    int boxes = 0;
    auto j = matches.rbegin();
// if matches are same in all containers than you have to go for the least matche boxes.
    while( n > 0){
        if(n - j->second < 0){
            boxes += n * j->first;
            n -= j->second;
        }else{
            n -= j->second;
            boxes += j->second * j->first;
            j++;
        }
    }

    cout << boxes;
}


int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
