#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    string s;
    int r = 0;
    char ptr = 'a';
    cin>>s;

    for(auto c:s){

        r += min(abs(ptr-c), abs(abs(ptr-c)-26));
        ptr = c;
        cerr<<r<<":"<<ptr<<endl;


    }
    cout<<r<<endl;

    

}
