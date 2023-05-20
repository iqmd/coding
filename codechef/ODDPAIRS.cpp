#include<bits/stdc++.h>

using namespace std;




int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;

        int even=n/2;
        int odd;
        int pairs;

        if(n%2==0){
            pairs = even*even*2;
        }else{
            odd = n - even;
            pairs = odd*even*2;
        }
        cout<<pairs<<endl;


    }
}
