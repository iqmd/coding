#include<bits/stdc++.h>
using namespace std;
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n = intervals.size();
        if(n==1) return intervals;
        vector<vector<int>> ans;
        vector<int> rslt;
        rslt.push_back(intervals[0][0]);
        rslt.push_back(*(intervals[0].end()-1));
        int m=0;

        for(int i=1; i< intervals.size(); i++){
               if(intervals[i][0] <= rslt[1]){
                   rslt[1] = *(intervals[i].end()-1);
               }else{
                  ans.push_back(rslt);
            rslt.push_back(intervals[i][0]);
            rslt.push_back(*(intervals[i].end()-1));
               } 
            
        }
        ans.push_back(rslt);
        return ans;
}

int main(){
    vector<vector<int>> a= {{1,3},{2,6},{8,10},{15,18}};
    vector<vector<int>> b = {{1,4},{4,5}};
    auto res = merge(a);
    for(int i=0; i< res.size(); i++){
        cout<<res[i][0]<<res[i][1]<<endl;
    }
}
    
