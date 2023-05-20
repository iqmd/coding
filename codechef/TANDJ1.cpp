#include<bits/stdc++.h>
#include <cmath>

using namespace std;


//pseudocode
// .. 11 12 ..
// .. 21 22
// .. 11 12 13 ..
// .. 21 22 23 ..
// ..11 12 ..  21 31 41 51 52 53 54 55 56  11 56 5-1 = 4
//             12 12 14 15 16 26 36 46 56        6-1 = 5 antything <9 won't work
// anything odd but more than 9 would work
// ..
// ....
// ....  56
// 11 12 13
// 21 22 23
int main(){
    int t;
    cin>>t;

    while(t--){
        int a,b,c,d,K;
        cin>>a>>b>>c>>d>>K;

        int dist;
        dist = abs(c-a) + abs(d-b);

        if(K >= dist){

            if(dist%2 == 0){
                if(K%2 == 0){
                    cout<<"YES\n";
                }else{
                    cout<<"NO\n";
                }
            }else{
                if(K%2 == 0){
                    cout<<"NO\n";
                }else{
                    cout<<"YES\n";
                }

            }
        }else{
            cout<<"NO\n";
        }




        
    }
}
