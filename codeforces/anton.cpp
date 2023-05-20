#include <bits/stdc++.h>
#include <cctype>
#include <algorithm>
using namespace std;
using ll = int64_t;

int a[10000];



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    string str;
    getline(cin,str);
    set<char> s;
    
    for(auto x:str){
        if(isalpha(x)) s.insert(x);

    }
    cout<<s.size();
}
