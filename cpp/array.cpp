#include<iostream>

using namespace std;

int main(){
    int a[] {1,2,3,45};
    for(const int &i : a){
        cout << i;
    }

}
