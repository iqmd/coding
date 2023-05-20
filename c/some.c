#include<stdio.h>

int main(){
	char c = 5;
    char *ptr = &c;
    *ptr = 18;
    printf("%p\n", ptr);
     /*printf("%p\n", ptr);
    printf("%p\n", ptrp);
    printf("%d\n", *ptr);
    printf("%p\n", ppp);
    printf("%d\n", ****p4);*/

    char  *m = ptr;
    for(int i=1; i < 5; i++){
        *(m+i) = i+5;
    }
    for(int i =0; i < 5; i++){
        printf("%p\n",(m+i));
    }

}
