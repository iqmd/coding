#include<stdio.h>
#include<stdlib.h>

struct rec {
    int length;
    int breadth;
};

int main(){
    struct rec r = {10,5};
    struct rec *p = (struct rec *)malloc(sizeof(struct rec));
    p->length=90;
    p->breadth=10;
    printf("%d\n",p->length);
    
}
