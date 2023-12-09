#include <bits/stdc++.h>
#include <climits>
#include <cstring>

using namespace std;

vector<int> wt(105);
vector<int> val(100005);
long dp[101][100001];

long knapSack(int i, int w){
   if(w == 0) return 0;
   if(i < 0) return 0;
   if(dp[i][w] != -1) return dp[i][w];

   long maxVal = knapSack(i-1,w);


   if(w - wt[i] >= 0)
       maxVal = max(maxVal,knapSack(i-1,w - wt[i])+val[i]);

   return dp[i][w] = maxVal;


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

    int N , W;
    memset(dp, -1, sizeof(dp));

    cin >> N >> W;



    for(int i = 0; i < N ; i++){
        cin >> wt[i] >> val[i];
    }

    cout << knapSack(N-1,W);


}
