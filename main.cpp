#include <algorithm>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

//Contains Element
bool containsElement(vector<int> &arr, int key) {
    if(find(arr.begin(), arr.end(),key) != arr.end()){
        return true;
    }else {
        return false;
    }
}

int getElementIndex(vector<int> &array, int target) {
    for(int i=0; i < array.size(); i++){
        if(array[i] == target){
            return i;
        }
    }
    return -1;

}

int main(int argc, char *argv[]) {
    return 0;
}
