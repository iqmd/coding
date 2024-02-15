#include <cstdlib>
#include <iostream>

using namespace std;

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

void buildTree(struct Node** root, int data){
    if(*root == nullptr){
        struct Node* new_node = new Node;
        new_node->data = data;
        new_node->left = NULL;
        new_node->right = NULL;
        *root = new_node;
        return;
    }

    if(data < (*root)->data){
        buildTree(&((*root)->left),data);
    }else{
        buildTree(&((*root)->right),data);
    }
}

void inorder(struct Node** root){
    if(*root == nullptr){
        return;
    }

    cout << (*root)->data << ", ";
    inorder(&((*root)->left));
    inorder(&((*root)->right));
}

int main(){
    struct Node* root = nullptr;
    buildTree(&root,4);
    buildTree(&root,5);
    buildTree(&root,9);
    buildTree(&root,2);
    inorder(&root);
    return 0;
}
