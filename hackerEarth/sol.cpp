#include <bits/stdc++.h>

using namespace std;



long long recur(int i, int sumB, int sumC, int n, vector<int> &a)

{
    // Check if all 'N' elements have been distributed.
    if (i == n)
    {
        // Return the absolute difference between the scores of 'B' and 'C'.
        return abs(1LL * sumB * sumB - 1LL * sumC * sumC);
    }
    // Initialize a variable 'res' to store the current answer.
    long long res = INT64_MAX;
    res = min(res, recur(i + 1, sumB + a[i], sumC, n, a));

    res = min(res, recur(i + 1, sumB, sumC + a[i], n, a));

    // Return the current answer.

    return res;
}
long long nearbySquares(int n, vector<int> &a)
{

    return recur(0, 0, 0, n, a);

}
int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
#ifndef ONLINE_JUDGE

    // for getting input from input.txt

    freopen("input.txt", "r", stdin);

    // for writing output to output.txt

    freopen("output.txt", "w", stdout);

#endif

    int t;

    cin >> t;

    while (t--)

    {

        int n;

        cin >> n;

        vector<int> a(n);

        for (auto &ele : a)

            cin >> ele;

        cout << nearbySquares(n, a) << "\n";

    }

    return 0;

}
