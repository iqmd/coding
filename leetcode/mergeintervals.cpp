#include<bits/stdc++.h>
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> merged;
        vector<int> last = intervals[0];

        for(int i = 1; i < intervals.size(); i++){

            if(last[1] >= intervals[i][0]){
                last = merge(last,intervals[i]);
            }else{
                merged.push_back(last);
                last =  intervals[i];
            }
        }
        merged.push_back(last);

        return merged;
    }

    vector<int> merge(vector<int> first, vector<int> second){
            if(first[1] >= second[1]){
                return first;
            }else{
                return {first[0], second[1]};
            }
    }
};
