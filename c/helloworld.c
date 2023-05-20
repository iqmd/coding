#include<stdio.h>

#define IN 1
#define OUT 0

int main1(){
    int c, nc, nw, nl, state;
    state = OUT;
    nl = nw = nc = 0;

    while((c = getchar()) != EOF){
        ++nc;
        if(c == '\n'){
            ++nl;
        }
        if(c==' ' || c == '\t' || c == '\n'){
            state = OUT;
        }else if(state == OUT){
            state = IN;
            nw++;
        }
    }
    printf("%d %d %d", nc ,nw, nl);

}

int main(){
   int f=4;
   if(f=='4'-'1')
   printf("%d",f);
   else
       printf("nope");
}
