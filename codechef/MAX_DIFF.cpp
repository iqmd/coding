#include<bits/stdc++.h>

using namespace std;


//3 4 -> {1,3},{2,2},{3,1}
//10 9 -> {0,9} {4,0}
//3 -> 5 -> {2,3} 5-3 = 2 <3
//6 -> 12 6,6 12-6 = 6
//N >= S then answer is  s
//N < S then anser is S-N
//2 3 
//4 6 
int main(){

    int t;
    cin>>t;
    while(t--){
        int N,S;
        cin>>N>>S;
        if(N >= S){
            cout<<S<<endl;
        }else{
            cout<<N-(S-N)<<endl;
        }

    }
    return 0;
}
