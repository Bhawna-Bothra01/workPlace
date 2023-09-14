#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void swap(int *x,int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}
void bubblesort(int arr[], int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                swap(&arr[j],&arr[j+1]);
            }
        }
    }
}
void main(){
    int n;
    clock_t start ,end;
    double fTime;
    printf("Enter the number of elements in the array\n");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        arr[i]= rand()%n;
    }
    printf("*********Unordered List********\n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    start=clock();
    bubblesort(arr,n);
    end=clock();
    printf("********Sorted List********\n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    fTime = (double)(start-end)/CLOCKS_PER_SEC; //CLOCKS_PER_SEC =1000000
    printf("Time taken = %f\n",fTime);
}