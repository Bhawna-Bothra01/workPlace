#include<stdio.h>
int p[10];
int parent(int x){
    while(x!=p[x]){
        x=p[x];
    }
    return x;
}
void kruskal(int graph[10][10],int n){
    int ne=0,sum=0,u,v;
    for(int i=0;i<n;i++) p[i]=i;
    while(ne<n-1){
        int min =999;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]<min){
                    min=graph[i][j];
                    u=i;
                    v=j;
                }
            }
        }
        if(parent(u)!=parent(v)){
            printf("connect %d --------> %d = %d\n",u,v,graph[u][v]);
            sum+=graph[u][v];
            p[v]=u;
            ne++;
        }
        graph[u][v] = 999;
        graph[u][v] = 999;
    }
    printf("Minimum cost: %d\n",sum);
}
void main(){
    int graph[10][10],n;
    printf("Enter the number of nodes\n");
    scanf("%d",&n);
    printf("Enter weighted matrix\n");
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&graph[i][j]);
        }
    }
    printf("********Minimum Spanning Tree********\n");
    kruskal(graph,n);
}