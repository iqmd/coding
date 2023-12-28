#include <iostream>
#include <vector>

using namespace std;

int fib(int n){
    if(n <= 1) return n;

    return fib(n-1) + fib(n-2);
}

auto main(int argc, char *argv[]) -> int {
    int n ;
    cin >> n;

    for(int i = 1; i <= n; i++){
        cout << fib(i) << " ";
    }
    return 0;
}
