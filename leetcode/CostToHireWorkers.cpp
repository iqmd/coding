class Solution {
public:
    void remove(int i, vector<int>& costs){
        for(; i < costs.size()-1; i++){
            swap(costs[i],costs[i+1]);
        }
        costs.pop_back();
    }
    long long totalCost(vector<int>& costs, int k, int candidates) {

       int i = 0;
       int j = 0;
       int n = costs.size();
       long long sum = 0;
       pair<int,int> indi;
       pair<int,int> indj;

       for(int m = 0; m < k; m++){
           n = costs.size();
            if(n-candidates > 0){
                    i = candidates-1;
                    j = n-candidates;
                    // if(j <= i){
                    //     j = i+1;
                    // }
            }else{
                    i = n-1;
                    j = n;
            }
            indi = {INT_MAX,-1};
            indj = {INT_MAX,-1};


           while(i >= 0){
               if(costs[i] < indi.first){
                   indi.first = costs[i];
                   indi.second = i;

               }
                i--;
           }
           while(j < n){
               if(costs[j] < indj.first){
                   indj.first = costs[j];
                   indj.second = j;
               }
               j++;
           }
           if(indi.first < indj.first){
               sum += indi.first;
               remove(indi.second,costs);
           }else if(indi.first > indj.first){
               sum += indj.first;
               remove(indj.second,costs);
           }else if(indi.first == indj.first){
               if(indi.second < indj.second){
                   sum += indi.first;
                   remove(indi.second,costs);
               }else{
                   sum += indj.first;
                   remove(indj.second,costs);
               }
           }

        }
       return sum;
    }
};
