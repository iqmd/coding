#include<bits/stdc++.h>

using namespace std;

template<typename T>
void print(T& var){
    for(auto i: var){
        cout<<i<<",";
    }
}

template<class T>
 vector<vector<string>> solve(T& strs){

    map<string, vector<string>> gr;
    vector<vector<string>> ans;

    for(int i = 0; i < strs.size(); i++){
        string s = strs[i];
        sort(strs[i].begin(), strs[i].end());
        gr[strs[i]].push_back(s);
    }
    
    for(auto i:gr){
        ans.push_back(i.second);
    }
    return ans;

}


int main(){

    vector<string> strs{"eat","tea","tan","ate","nat","bat"};
    cout<<solve(strs);
}
