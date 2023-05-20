#include<stdio.h>

unsigned getbits(unsigned x, int p, int n){
    return (x >> (p+1-n)) & ~(~0 << n);
}

int main(){
    int n = 88;
    printf("%o", n);
    return 0;
}
