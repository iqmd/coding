#include <limits.h>
#include<stdio.h>
#include <stdlib.h>

#define CAPACITY 100

struct ListNode{
    int data;
    struct ListNode* next;
    int size;
};

void push(struct ListNode **stack,int data){
    struct ListNode* temp = malloc(sizeof(struct ListNode));
    temp->data = data;
    temp->next = *stack;
    *stack = temp;
}


int top(struct ListNode* stack){
    return stack->data;
}


void pop(struct ListNode** stack){
    if(stack == NULL){
        printf("Stack is Empty !");
        return;
    }
    struct ListNode* temp = *stack;
    *stack = (*stack)->next;
}


int main(){
    struct ListNode *stack = NULL;
    push(&stack,5);
    push(&stack,4);
    push(&stack,12);

    printf("%d\n",top(stack));
    pop(stack);
    printf("%d\n",top(stack));

    /* for(int i = 0; i < stack->top; i++){ */
    /*     printf("%d\n",stack->buffer[i]); */
    /* } */
    return 0;
}
