#include<bits/stdc++.h>
#include <cmath>
#include <unordered_map>

using namespace std;

// 1 2
// 2 5 
// 3 6
// 4 3
// 5 5
// 6 6
// 7 3
// 8 7
// 9 6

int main(){
    int t;
    cin>>t;

    while(t--){
        int a,b,sum;
        cin>>a>>b;

        sum = a+b;

        unordered_map<int,int> digits;
        digits[1] = 2;
        digits[2] = 5;
        digits[3] = 5;
        digits[4] = 4;
        digits[5] = 5;
        digits[6] = 6;
        digits[7] = 3;
        digits[8] = 7;
        digits[9] = 6;
        digits[0] = 6;

        int j = sum;
        int ms = 0;

        while(j){
            int d = j%10;
            ms += digits[d];
            j = j/10;

        }

        cout<<ms<<endl;
        
    }
}
