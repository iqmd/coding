#include<iostream>
using namespace std;

typedef struct list {
    int data;
    list* next;
}list;

void add(list** l,int data){
    list* node = (list*)malloc(sizeof(list));
    node->data = data;
    node->next = NULL;
    if(*l == NULL){
        *l = node;
    }else if((*l)->next == NULL){
        (*l)->next = node;
    }else{
        add(&(*l)->next,data);
    }
}

void print(list* l){
    if(l == NULL){
        cout << "NULL";
        return ;
    }
    cout << l->data << " -> ";
    print(l->next);
}

class Node {
    public:
        int data;
        Node *next;
};

class LinkedList {
    private:
        Node *head = NULL;
    public:
        void add(int data){
            Node *node = new Node;
            node->data = data;
            node->next = nullptr;
            if(head == NULL){
               head = node;
               return;
            }
            Node *curr = head;
            while(curr->next != nullptr){
                curr = curr->next;
            }
            curr->next = node;
        }

        void print(){
            Node *curr = head;

            while(curr != nullptr){
                cout << curr->data << " -> ";
                curr = curr->next;
            }

            cout << " NULL ";
        }
};

int main(){
    LinkedList l;
    l.add(4);
    l.add(3);
    l.add(9);
    l.add(1);
    l.print();
    return 0;

}
