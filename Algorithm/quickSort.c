#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void swap(int* x,int* y){
    int temp = *x;
    *x = *y;
    *y = temp;
}
int partition(int arr[],int low,int high){
    int pivot=low,i=low+1,j=high;
    while(i<=j){
        while(arr[pivot]>=arr[i]) i++;
        while(arr[pivot]<arr[j]) j--;
        if(i<j){
            swap(&arr[i],&arr[j]);
        }
    }
    swap(&arr[pivot],&arr[j]);
    return j;
}
void quickSort(int arr[],int low ,int high){
    if(low<high){
        int j=partition(arr,low,high);
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
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
    quickSort(arr,0,n-1);
    end=clock();
    printf("********Sorted List********\n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    fTime = (double)(start-end)/CLOCKS_PER_SEC; //CLOCKS_PER_SEC =1000000
    printf("Time taken = %f\n",fTime);
}