#include<iostream>
using namespace std;

int main(){
    for(int i=0; i < 10; i++){
        cout<<i<<endl;
        for(char  j='a'; j < 'z'; j++){
           cout <<j << endl;
                 if(j=='c'){
            break;
        }
}

        cout<<"broken inner loop reaches here"<<endl;
    }
}
