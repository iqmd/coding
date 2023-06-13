#include<iostream>

using namespace std;

int fun(){
    static int x {7};
    return ++x;
}
int main(){

    cout << fun();
    cout << fun();
    cout << fun();

    return 0;
}
