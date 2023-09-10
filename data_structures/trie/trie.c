#include <assert.h>
#include <stdio.h>

typedef struct Node Node;

struct Node{
     Node *children[256];
};

#define NODE_POOL_CAP 1024

Node *node_pool[NODE_POOL_CAP] ;

size_t node_pool_count = 0;

Node *alloc_node(void){
    return node_pool[node_pool_count++];
}

void insert_text(Node *root, const char *text){

    if(text == NULL || *text == '\0'){
        return;
    }
    assert(root != NULL);

    size_t index = (size_t) *text;

    if(root->children[*text] == NULL){
        root->children[*text] = alloc_node();
    }

    insert_text(root->children[index], text+1);

}


int main(void){
     Node *root = alloc_node();
    insert_text(root,"hello");
    return 0;
}
