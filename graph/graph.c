#include <stdio.h>
#include <stdlib.h>
#include "queue.h"
#include <stdbool.h>


struct Graph {
    int v;
    int e;
    int** adj;
};

void addEdges(int s, int d, struct Graph *g);
struct Graph* adjMatrix() {
    int u, v;
    struct Graph* G = malloc(sizeof(struct Graph));
    printf("Number of vertices in the graph :");
    scanf("%d", &(G->v));
    printf("Number of edges in the graph :");
    scanf("%d", &(G->e));
    G->adj = malloc(G->v * sizeof(int*));
    for (u = 0; u < G->v; u++) {
        G->adj[u] = malloc(G->v * sizeof(int));
        for (v = 0; v < G->v; v++) {
            G->adj[u][v] = 0;
        }
    }
    for(int i = 0; i < G->e ; i++){
        int s,d;
        printf("\nSource :");
        scanf("%d",&s);
        printf("\nDestination:");
        scanf("%d",&d);
        addEdges(s,d,G);
    }
    return G;
}

void addEdges(int s, int d, struct Graph *g){
    g->adj[s][d] = 1;
    g->adj[d][s] = 1;
    printf("\nEdges established between  %d ->  %d \n",s,d);
}

void printGraph(struct Graph* g){

    printf("\t");
    for(int k=0; k < g->v; k++){
        printf("%d\t",k);
    }
    for(int i =0; i < g->v; i++){
        printf("\n%d\t",i);
        for(int j = 0; j < g->v; j++){
            printf("%d\t",g->adj[i][j]);
        }
    }
}
void bfs(struct Graph *g, int s){
    struct Queue *waiting = createq();
    push(s,waiting);
    int *processed = malloc(sizeof(int)*g->v);
    for(int i = 0; i < g->v; i++){
        processed[i] = 0;
    }

    while(isEmpty(waiting) == 0){
       int ready = popfront(waiting);
       printf("%d\n",ready);
       processed[ready] = 1;
       for(int i = 0; i < g->v; i++){
           if(g->adj[ready][i] == 1 && processed[i] != 1){
               push(i,waiting);
           }
       }
    }
}


int main() {
    struct Graph* graph;
    graph = adjMatrix();

    /* printGraph(graph); */
    bfs(graph,1);
    return 0;
}
