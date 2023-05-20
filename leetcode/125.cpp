//Valid Palindromej
#include<bits/stdc++.h>
#include <cctype>


using namespace std;

template<typename T>
void print(T& var){
    for(auto i: var){
        cout<<i<<",";
    }
}

//psudedocode
//two pointers
bool solve(string s){
    string comps;
    for(auto c:s){
        if(isalnum(c)){
            comps.push_back(tolower(c));
        }

    }
    int i = 0;
    int j = comps.size()-1;
    while(i <= j){

        if (comps[i] != comps[j] ){
            return false;
        }

            i++;
            j--;
    }
    return true;
}

int main(){

    vector<string> strs;
    cout<<solve("race a car");
}
