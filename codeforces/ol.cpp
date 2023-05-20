#include <bits/stdc++.h>
#include <cctype>
using namespace std;
using ll = int64_t;





int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n;
    cin>>n;
    vector<int> k(n);
    for(int i=0; i< n; i++){
        cin>>k[i];
    }
    int teams = min(count(k.begin(), k.end(), 1), min(count(k.begin(), k.end(),3),count(k.begin(), k.end(),2)));
    int i = 1;
    int c = 0;
    cout<<teams<<"\n";
    while(c < teams){
        while(i<=3){
            for(int j = 0; j<n; j++){
                if(k[j] == i ) {
                    cout<<j+1<<" ";
                    k[j] = -1;
                    i++;
                    break;

                }
            }

        }
        c++;
        i=1;
        cout<<"\n";

    }
    
}
