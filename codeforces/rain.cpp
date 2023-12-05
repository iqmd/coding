#include <bits/stdc++.h>
#include <climits>
#include <string>
using namespace std;
using ll = int64_t;

#define tr(container)container.begin(),container.end()
#define revtr(container)container.rbegin(),container.rend()

#define debug(x) cerr << x <<" "

int findPoss(string str , char c, int i, int n){
    if( n == 3){
        return 1;
    }

    int count = 0;
    for(int j = i+1; j < str.size(); j++){
        if(str[j] != c)
            count += findPoss(str, str[j], j, n+1);
    }

    return count;

}

void run_case(){
    string a,b;
    cin>>a;
    cin>>b;

    int count = 0;
    int maxcount = INT_MIN;
    for(int i=0; i < a.size(); i++){
        count += findPoss(a,a[i],i,1);
    }

    maxcount = count;
    cout <<count<<endl;
    count = 0;

    for(int i=0; i < b.size(); i++){
        count += findPoss(b,b[i],i,1);
    }

    maxcount = max(maxcount,count);

    cout<< maxcount <<endl;



}

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    run_case();

}
