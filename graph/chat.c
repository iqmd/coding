#include <stdio.h>
#include <stdlib.h>

struct Graph {
    int v;
    int e;
    int** adj;
};

struct Graph* adjMatrix() {
    int i, u, v;
    struct Graph* G = malloc(sizeof(struct Graph));
    scanf("%d", &(G->v));
    scanf("%d", &(G->e));
    G->adj = malloc(G->v * sizeof(int*));
    for (u = 0; u < G->v; u++) {
        G->adj[u] = malloc(G->v * sizeof(int));
        for (v = 0; v < G->v; v++) {
            G->adj[u][v] = 0;
        }
    }
    for (i = 0; i < G->e; i++) {
        scanf("%d %d", &u, &v);
        printf("Edges at %d %d", u, v);
        G->adj[u][v] = 1;
        G->adj[v][u] = 1;
    }
    return G;
}

int main() {
    struct Graph* graph;
    graph = adjMatrix();
    return 0;
}
