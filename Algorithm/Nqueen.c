#include<stdio.h>
#include<stdlib.h>
int b[10],count =0;
int place(int row,int col){
    for(int i=1;i< row;i++){
        if(b[i] == col || abs(b[i]-col) == abs(row-i))
        return 0;
    }
    return 1;
}
void displayQ(int n){
    printf("Solution Number%d:\n", ++count);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(b[i]==j) printf("Q%d ",i);
            else printf("* ");
        }
        printf("\n");
    }
}
void nqueen(int row,int n){
    for(int col=1;col<=n;col++){
        if(place(row,col)){
            b[row] = col;
            if(row==n) displayQ(n);
            else nqueen(row+1,n);
        }
    }
}
void main(){
    int n;
    printf("Enter the number of Queen\n");
    scanf("%d",&n);
    if( n==2 || n==3 ) printf("Solution not possible\n");
    else nqueen(1,n);
    printf("Total number of solution is %d",count);
}