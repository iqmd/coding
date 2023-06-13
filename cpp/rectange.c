#include<stdio.h>
struct Rectangel{
    int length;
    int breadth;
};

int main(){

    struct Rectangel r = {10,5};
    r.length= 15;
    printf("Area of rectangle is %d",r.length*r.breadth);
}

//the memory is created in stack
