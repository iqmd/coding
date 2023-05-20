#include <algorithm>
#include<bits/stdc++.h>

using namespace std;


int main(){
    int t;
    cin>>t;

    while(t--){
       int n;
       int a[1000];
       int fr[1000] = {0};
       
       
        cin>>n;

       for(int i = 0; i < n;i++){
            cin>>a[i];

        }

        map<int,int> freq;
        multimap<int,int> flipfr;
        for(int i = 0; i < n; i++){
            fr[a[i]]++;
        }
        int max = 0;
        int ai;
        for(int i=0; i < n; i++){
            if(fr[i] > max){
                max = fr[i];
                ai = i;
            }
        }

        int c = 0;
        for(int i = 0; i < n; i++){
            if(a[i] != ai){
                c++;
            }

        }

        cout<<c<<endl;




    }
}
