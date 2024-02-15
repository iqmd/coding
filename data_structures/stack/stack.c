#include <limits.h>
#include<stdio.h>
#include <stdlib.h>

#define CAPACITY 100

typedef struct {
    int *buffer;
    size_t size;
} Array;

typedef struct {
    Array *buffer;
    int top;
} Stack;


Array* create_dynamic_array(Array* arr){
    Array *new_arr = malloc(sizeof(Array));
    if(arr){
        size_t resize = arr->size*2;
        new_arr->buffer = malloc(sizeof(int)*resize);
        for(int i =0; i < arr->size; i++){
            new_arr->buffer[i] = arr->buffer[i];
        }

    }else{
        new_arr->buffer = malloc(sizeof(int)*10);
        new_arr->size = 10;
    }
    return new_arr;
}

Stack* createStack(){
    Stack *stack = malloc(sizeof(Stack));
    stack->buffer = create_dynamic_array(stack->buffer);
    stack->top = -1;
    return stack;
}

void push(Stack *stack,int data){
    if(stack->top == CAPACITY - 1){
        stack->buffer = create_dynamic_array(stack->buffer);
    }
   stack->top++;
   stack->buffer->buffer[stack->top] = data;
}

int top(Stack* stack){
    return stack->buffer->buffer[stack->top];
}

int pop(Stack* stack){
    if(stack->top == -1){
        printf("Stack empty !");
        return INT_MIN;
    }
    return stack->buffer->buffer[stack->top--];
}

void deletStack(Stack* stack){
    if(stack){
        if(stack->buffer){
            free(stack->buffer);
        }
        free(stack);
    }
}

int main(){
    Stack *stack = createStack();
    push(stack,5);
    push(stack,4);
    push(stack,12);

    printf("%d\n",top(stack));
    pop(stack);
    printf("%d\n",top(stack));

    /* for(int i = 0; i < stack->top; i++){ */
    /*     printf("%d\n",stack->buffer[i]); */
    /* } */
    return 0;
}
