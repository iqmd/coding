#include <cstdlib>
#include <iostream>


using namespace std;

struct Heap {
    int * array;
    int count;
    int capacity;

};

Heap* createHeap(int capacity){
    Heap *heap = (Heap*)malloc(sizeof(Heap));
    heap->capacity = capacity;
    heap->array = (int*)malloc(heap->capacity*sizeof(int));
    heap->count = 0;
    return heap;
}

int parentNode(Heap *h, int i){
    if(i <= 0 || i >= h->count){
        return -1;
    }
    return i-1/2;
}

int leftChild(Heap *h , int i){
    int left = 2*i +1;
    if(left >= h->count){
        return -1;
    }

    return left;
}

int rightChild(Heap *h , int i){
    int right = 2*i + 2;
    if(right >= h->count){
        return -1;
    }
    return right;
}

int getMax(Heap *h){
    if(h->count == 0) return -1;
    return h->array[0];
}

void percolateDown(Heap *h,int i){
    int l,r,max;
    l = leftChild(h,i);
    r = rightChild(h,i);

    if(l != -1 && h->array[i] < h->array[l]){
        max = l;
    }else{
        max = i;
    }

    if(r != -1 && h->array[max] < h->array[r]){
        max = r;
    }
    if(max != i){
        swap(h->array[i], h->array[max]);
        percolateDown(h, max);
    }
}


int deleteMax(Heap *h){
    int data = h->array[0];
    swap(h->array[0],h->array[h->count - 1]);
    h->count--;
    percolateDown( h, 0);
    return data;
}

void resizeHeap(Heap *h){
    h->array = (int*)realloc(h->array,h->capacity*2);
}

void insert(Heap *h, int data){
    int i;
    if(h->count == h->capacity){
        resizeHeap(h);
    }
    h->count++;
    i = h->count - 1;


    while(i > 0 && data > h->array[(i-1)/2]){
        h->array[i] = h->array[(i-1)/2];
        i = (i-1)/2;
    }

    h->array[i] = data;

}






int main(){
    Heap *h;
    h = createHeap(5);
    insert(h,6);
    insert(h,3);
    insert(h,2);
    insert(h,8);


    cout << deleteMax(h);
    cout << endl;
    cout << deleteMax(h);
    cout << endl;
    cout << deleteMax(h);
    cout << endl;
    cout << deleteMax(h);



    // for(int i = 0 ; i < h->count; i++){
    //     cout << h->array[i] << " " << endl;
    // }
    return 0;
}
