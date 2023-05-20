#include<iostream>

using namespace std;


int main(){
    int a[10]= {8,3,5,1,4,2,9,7,7,6};
    
    for(int i=0; i< 10; i++){

        for(int j=i+1; j<10; j++){
            if(a[j] < a[i]){
                swap(a[i],a[j]);
            }

        }
    }

    for(int n=0; n<10;n++){
        cout<<a[n];
    }
}
