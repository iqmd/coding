#include<bits/stdc++.h>
#include<iostream>

int main(){
    int n,m,count=0;
    std::cin >> n >> m;
    if(n>m)
      std::swap(n, m);

    fo(int i=1; i <= m; i++){
        if(abs(i%5-5) <= n) count++;
    }
    std::cout << count : << "\n";
}
