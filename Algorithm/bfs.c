#include<stdio.h>
void bfs(int graph[10][10],int n,int start_node){
    int visited[n],q[n],r=-1,f=0,u,v;
    for(int i=0;i<n;i++){
        visited[i]=0;
    }
    visited[start_node]=1;
    q[++r]=start_node;
    while(r>=f){
        u=q[f++];
        printf("%d ",u);
        for(v=0;v<n;v++){
            if(graph[u][v] == 1 && visited[v] == 0){
                q[++r] = v;
                visited[v] = 1;
            }
        }
    }
    printf("\n");
}
void main(){
    int n,start_node=0;
    printf("Enter the number of node\n");
    scanf("%d",&n);
    int graph[n][n];
    printf("Enter the matrix\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&graph[i][j]);
        }
    }
    printf("*********** BFS Traversal ********\n");
    bfs(graph,n,start_node);
}