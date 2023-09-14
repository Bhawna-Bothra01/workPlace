#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void swap(int *x,int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}
void selectionsort(int arr[], int n){
    for(int i=0;i<=n-2;i++){
        int min =i;
        for(int j=i+1;j<=n-1;j++){
            if(arr[min]>arr[j]){
                min =j;
            }
        }
        swap(&arr[i],&arr[min]);
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
    selectionsort(arr,n);
    end=clock();
    printf("********Sorted List********\n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    fTime = (double)(start-end)/CLOCKS_PER_SEC; //CLOCKS_PER_SEC =1000000
    printf("Time taken = %f\n",fTime);
}