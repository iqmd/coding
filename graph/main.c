#include<stdio.h>
#include<stdlib.h>
struct Graph{
    int v;
    int e;
    int **adj;
};

struct Graph *adjMatrix(){
    int i,u,v;
    struct Graph *G = malloc(sizeof(struct Graph));
    G->adj = malloc(sizeof(int)*5*5);
    for(u =0; u < 5; u++){
        for(v=0; v < 5; v++){
            G->adj[u][v] = 0 ;
        }
        for (i = 0; i < G->e; i++) {
            scanf("edge: %d %d",&u,&v);
            G->adj[u][v]=1;
            G->adj[v][u]=1;
        }
    }
    return G;
}
int main(){
    return 0;
    struct Graph *graph;
    graph = adjMatrix();
}
