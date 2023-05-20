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
    for(int i=0; i<n; i++){
        for(int j=i; j >= 0; j--){
            if(v[j-1] > v[j]){
                swap(v[j],v[j-1]);
            }else{
                break;
            }
        }

    }

    print(v);


}
