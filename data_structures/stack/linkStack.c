#include<stdio.h>
#include <stdlib.h>

struct StackNode{
    int data;
    struct StackNode* next;
};

void push(struct StackNode** top, int data){
    struct StackNode* node = malloc(sizeof(struct StackNode));
    node->data = data;
    if(*top == NULL){
        *top = node;
    }
    node->next = *top;
    *top = node;
}

void pop(struct StackNode** top){
   struct StackNode* nxt = (*top)->next;
   *top = nxt;
}

int top(struct StackNode *top){
    return top->data;
}

int main(){
    struct StackNode *stack = NULL;

    push(&stack, 4);
    push(&stack, 12);
    push(&stack, 9);
    push(&stack, 32);
    printf("%d\n",top(stack));
    pop(&stack);
    printf("%d\n",top(stack));
    pop(&stack);
    printf("%d\n",top(stack));
    push(&stack, 7);
    printf("%d\n",top(stack));
    return 0;
}

/*
** top->st->node1->node
*/
