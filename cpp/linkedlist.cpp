#include<iostream>

using namespace std;

struct linkedlist{
	int data;
	struct linkedlist *next;

};
int main(){
	linkedlist head;
	struct linkedist *p;
	p = new linkedlist;
	head.data = 6;
	linkedlist node;
	node.data = 78;
	head.p = &node;
	linkedlist *curr;
	curr = &head;

	while(curr != NULL){
		cout << curr->data;
		curr = curr->p;
		cout << "->";
	}

}
