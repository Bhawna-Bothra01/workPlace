#include<stdio.h>
void warshall(int graph[10][10], int n){
    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j] = graph[i][j] || (graph[i][k] && graph[k][j]);
            }
        }
    }
}
void main(){
    int n;
    printf("Enter the number of nodes\n");
    scanf("%d",&n);
    int graph[10][10];
    printf("Enter Adjacency Matrix\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&graph[i][j]);
        }
    }
    printf("*********Transitive Closure********\n");
    warshall(graph,n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("%d ",graph[i][j]);
        }
        printf("\n");
    }
}