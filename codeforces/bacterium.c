#include<stdio.h>
#include <stdlib.h>


int main(){
    int n,count = 0, pw = 1, diff;
    scanf("%d",&n);
    while(pw < n){
        pw <<=1;
    }
    if(n < pw)
    pw >>=1;
    diff = abs(pw - n);

    printf("%d",pw);
    return 0;
}
