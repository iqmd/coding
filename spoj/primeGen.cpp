#include<bits/stdc++.h>
#include <cmath>


using namespace std;


int main(){

    int t;
    cin >> t;
    unordered_set<long> primes;

    while(t--){
        long start, end;
        cin >> start >> end;
        for(long i = start; i <= end; i++){
            if(primes.find(i) != primes.end()){
                cout << i << "\n";
                start = i;
            }
        }
        //25
        for(long i = start ; i <= end; i++){
            bool isPrime = true;
            for(long j = 2; j <= sqrt(i); j++){
                if(i%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime && i != 1){
                if(primes.find(i) == primes.end()){
                primes.insert(i);
                cout << i << "\n";

                }
            }
        }

        cout << "\n";
    }
}
