#include<stdio.h>
void dijkstra(int graph[10][10],int n,int source,int dist[10]){
    int visited[10],u;
    for(int i=0;i<n;i++) visited[i]=0;
    visited[source]=1;
    for(int ne=0;ne<n;ne++){
        int min=999;
        for(int i=0;i<n;i++){
            if(visited[i]==0 && dist[i]<min){
                min=dist[i];
                u=i;
            }
        }
        visited[u]=1;
        for(int v=0;v<n;v++){
            if(visited[v]==0 && dist[u]+graph[u][v] < dist[v])
                dist[v] = dist[u] + graph[u][v] ;
        }
    }
}
void main(){
    int dist[10],graph[10][10],n,source =0;
    printf("Enter the number of nodes\n");
    scanf("%d",&n);
    printf("Enter the weighted matrix\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&graph[i][j]);
        }
    }
    for(int i=0;i<n;i++) dist[i] = graph[source][i];
    dijkstra(graph,n,source,dist);
    for(int i=0;i<n;i++)
    printf("connect %d -------> %d = %d\n",source,i,dist[i]);
}