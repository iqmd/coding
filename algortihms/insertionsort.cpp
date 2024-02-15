#include<iostream>
#include<vector>

using namespace std;

template<typename T>
void read(vector<T>& v, int n){
    for(int i=0; i< n; i++){
        cin>>v[i];
    }
}
template<typename T>
void print(vector<T>& v){
    for(int i=0; i<v.size(); i++){
        cout<<v[i]<<" ";
    }
    cout<<"\n";
}

int main(){
    int n;
    cin>>n;
    vector<int> v(n);
    read(v,n);

    //Insertion sort
    for(int i = 1; i < n; i++){
        int mov = v[i];
        int j = i-1;
        while(j >=0 && mov < v[j]){
            v[j+1] = v[j];
            j--;
        }
        v[j] = mov;
    }

    print(v);


}
