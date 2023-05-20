#include<stdio.h>

void sort(int *arr){
   for(int i=0; i < 10; i++){
       int min = arr[i];
       for(int j = i+1; j < 10; j++){
           if(arr[j] < min){
               int temp = min;
               min = arr[j];
               arr[j] = temp;
           }
       }
       arr[i] = min;
   }
}

int main(){
    int arr[] = {3,9,6,1,4,56,32,34,12,77};
    for(int i=0; i < 10; i++){
        printf("%d ", arr[i]);
    }

    printf("\n");
    sort(arr);
    for(int i=0; i < 10 ; i++){
        printf("%d ", arr[i]);
    }
    return 0;
}
