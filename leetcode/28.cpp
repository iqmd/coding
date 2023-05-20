#include<iostream>


using namespace std;


int strStr(string haystack, string needle) {
    if(haystack == needle) return 0;
    if(haystack.size() == 0 || needle.size() == 0 || needle.size() > haystack.size()) return -1;


    string temp;
    int n = needle.size();

    for(int j =0; j < haystack.size(); j++){
        for(int i=0; i < n; i++){
            temp.push_back(haystack[i+j]);
        }
        if(needle == temp) return j;
    }

    return 0;





}


int main(){
   return 0;
}
