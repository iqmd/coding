#include <bits/types.h>
#include <stdio.h>

#define MAX_SIZE 101

int A[MAX_SIZE];

int top = -1;

void push(int x){
    if(top == MAX_SIZE -1 ){
        printf("Error: Stack Overflow");
        return;
    }
    A[++top] = x;
}

void pop(){
    if(top == -1){
        printf("Cannot pop from an empty stack !");
        return;
    }
    top--;
}

void print(){
    printf("Stack : ");
    for(int i = 0; i < top+1; i++ ){
        printf("%d ",A[i]);
    }
    printf("\n");
}

int main(){
    char c;
    int n;
    printf("Choose the operation on Stack : \n");
    printf("1. Push ");
    printf("2. Pop ");
    printf("3. Print ");
    do {
      printf("\nChoose any number 1,2,3 ? or press n to quit ");
      scanf("%c", &c);

      switch (c) {
      case '1':
        scanf("%d", &n);
        push(n);
        printf("%d pushed on stack\n", n);
        break;
      case '2':
        pop();
        printf("%d popped\n", n);
        break;
      case '3':
        print();
        break;
      }

    } while (c != 'n');
    return 0;
}
