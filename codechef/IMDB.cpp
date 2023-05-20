#include<bits/stdc++.h>
#include <climits>

using namespace std;

//x gb space 
//n movies
//s - space 
//r - rating
//


int main(){
    int t;
    cin>>t;
    int n,x,s,r;
    int maxr = INT_MIN;
    while(t--){
        cin>>n>>x;
        while(n--){
            cin>>s>>r;
            if(s <=x){
                maxr = max(maxr,r);
            }
        }
        cout<<maxr<<endl;
        maxr = INT_MIN;
        

    }
}
