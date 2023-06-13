#include<stdio.h>
#include<stdlib.h>


int main(){

    int *p;
    p = (int *)malloc(5*sizeof(int));
    p[0]=3;
    p[1]=8;
    p[2]=4;
    p[3]=2;
    p[4]=6;

    for(int i = 0; i < 5; i++){
        printf("%d\n",*(p+i));
    }
    free(p);

}

