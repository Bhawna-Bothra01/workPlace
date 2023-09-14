#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void merge(int arr[], int low, int mid, int high){
    int i=low, j=mid+1,k=low;
    int temp[10000];
    while(i<=mid && j<= high){
        if(arr[i]<=arr[j]) temp[k++] = arr[i++];
        else temp[k++] = arr[j++];
    }
    while(i<=mid){
        temp[k++] = arr[i++];
    }
    while(j<= high){
        temp[k++] = arr[j++];
    }
    for(k=low;k<=high;k++){
        arr[k]=temp[k];
    }
}
void divide(int arr[],int low,int high){
    if(low<high){
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);
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
    divide(arr,0,n-1);
    end=clock();
    printf("********Sorted List********\n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    fTime = (double)(start-end)/CLOCKS_PER_SEC; //CLOCKS_PER_SEC =1000000
    printf("Time taken = %f\n",fTime);
}