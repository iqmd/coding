#include <bits/stdc++.h>
#include <cctype>
using namespace std;
using ll = int64_t;




int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    string s;
    vector<int> num;
    cin>>s;
    for(auto c:s){
        if(isalnum(c)) num.push_back((int)c);
    }
    sort(num.begin(), num.end());
    for(auto n:num){
        cout<<n<<"+";
    }
}
