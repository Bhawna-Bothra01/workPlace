#include<stdio.h>
void swap(int *x, int *y){
    int temp =*x;
    *x=*y;
    *y=temp;
}
void heapify(int h[],int n,int i){
    int largestIndex =i;
    int leftIndex = 2*i + 1;
    int rightIndex = 2*i +2;
    if( leftIndex<n && h[leftIndex]>h[largestIndex]){
        largestIndex = leftIndex;
    }
    if( rightIndex<n && h[rightIndex]>h[largestIndex]){
        largestIndex = rightIndex;
    }
    if(largestIndex!=i){
        swap(&h[i],&h[largestIndex]);
        heapify(h,n,largestIndex);
    }
}
void maxHeap(int h[], int n){
    for(int i=(n/2)-1;i>=0;i--){
        heapify(h,n,i);
    }
    for(int i=0;i<n;i++){
        printf("%d ",h[i]);
    }
    printf("\n");
}
void heapSort(int h[],int n){
    for(int i=n-1;i>=0;i--){
        swap(&h[0],&h[i]);
        heapify(h,i,0);
    }
}
void main(){
    int n;
    printf("Enter the number of elements in the array\n");
    scanf("%d",&n);
    int h[n];
    printf("Enter the elements in the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&h[i]);
    }
    printf("*********Unordered List********\n");
    for(int i=0;i<n;i++){
        printf("%d ",h[i]);
    }
    printf("\n");
    printf("********maxHeap*********\n");
    maxHeap(h,n);
    printf("********Sorted List********\n");
    heapSort(h,n);
    for(int i=0;i<n;i++){
        printf("%d ",h[i]);
    }
    printf("\n");
}