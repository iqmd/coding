#include <bits/stdc++.h>

using namespace std;


long func(int i, long sum, long preSum, vector<int>& A){
    long ans = LONG_MAX;

    for(int j = i+1; j < A.size(); j++){
        long sumB = pow((preSum+A[j]),2);
        long sumC = pow((sum - A[j]),2);
        long diff = abs(sumB - sumC);


        diff = min(diff,func(j,sum - A[j], preSum + A[j], A));
        ans = min(ans, diff);
    }


    return ans;
}

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

#ifndef ONLINE_JUDGE
    // for getting input from input.txt
    freopen("input.txt", "r", stdin);
    // for writing output to output.txt
    freopen("output.txt", "w", stdout);
#endif

    int t, n;
    cin >> t;

    while(t--){
        cin >>n;
        int sum = 0;
        vector<int> A(n);
        for(auto &ele:A ){
            cin >> ele;
            sum += ele;
        }

        long minDiff = LONG_MAX;
        for(int i = 0; i < A.size(); i++){
           long absoluteDiff = func(i,sum - A[i], A[i], A);
           minDiff = min(minDiff, absoluteDiff);
        }

        cout << minDiff << "\n";
    }
}
