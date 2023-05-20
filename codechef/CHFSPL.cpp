#include<bits/stdc++.h>

using namespace std;



int main(){
    int t;
    cin>>t;

    while(t--){
        int a,b,c;
        cin>>a>>b>>c;
        int s1 = a+b;
        int s2 = b+c;
        int s3 = a+c;
        int maxc = max(s1,max(s2,s3));
        cout<<maxc<<endl;

        
    }
}
