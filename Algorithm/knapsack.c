#include<stdio.h>
int max(int x,int y){
    if(x>y) return x;
    else return y;
}
void knapsack(int w[],int p[] ,int n,int m){
    int v[10][10];
    for(int i=0;i<=n;i++){
        for(int j=0;j<=m;j++){
            if(i == 0 || j == 0) v[i][j] = 0;
            else if(j<w[i]) v[i][j] = v[i-1][j];
            else v[i][j] = max(v[i-1][j],p[i]+v[i-1][j-w[i]]);
        }
    }
    printf("Maximum profit = %d\n",v[n][m]);
    int profit=v[n][m];
    printf("List of items in the bag are:-\n");
    for(int i=n;i>0,profit>0;i--){
        if(v[i][m]==v[i-1][m]) continue;
        printf("Weight = %d kg and Profit = $%d\n",w[i],p[i]);
        profit = profit - p[i];
        m = m - w[i];
    }
}
void main(){
    int n , m ;
    printf("Enter the number of items\n");
    scanf("%d",&n);
    printf("Enter the maximum capacity of the bag\n");
    scanf("%d",&m);
    int w[n],p[n];
    printf("Enter the weight of each item\n");
    w[0]=0; 
    for(int i=1;i<=n;i++)
    scanf("%d",&w[i]);
    p[0]=0;
    printf("Enter the profit of each item\n");
    for(int i=1;i<=n;i++)
    scanf("%d",&p[i]);
    knapsack(w,p,n,m);

}
