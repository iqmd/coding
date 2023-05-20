#include<bits/stdc++.h>

using namespace std;


bool solve(string s,string t){
    sort(s.begin(), s.end());
    sort(t.begin(), s.end());

    return s == t;


}


int main(){
    string s = "anagram";
    string t = "nagaram";
    cout<<solve(s,t);
}
