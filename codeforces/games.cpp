#include <bits/stdc++.h>
using namespace std;
using ll = int64_t;



int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n;cin>>n;
    int c=0;
    pair<int,int> u;
    vector<pair<int,int>> teams;
    for(int i = 0; i < n; i++){
        cin>>u.first>>u.second;
        teams.push_back(u);
    }
    for(int i = 0; i< n; i++){
        for(int j = i; j < n; j++){
            if(teams[i].second == teams[j].first)
                c++;
            if(teams[i].first == teams[j].second)
                c++;
        }
    }
    cout<<c<<endl;
}
