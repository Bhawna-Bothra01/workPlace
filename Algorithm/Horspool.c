#include<stdio.h>
#include<string.h>
char text[80]="JIM_SAW_ME_IN_BARBER_SHOP";
char pattern[20]="BARBER";
int stable[128],m,n;
int shiftTable(){
    m=strlen(pattern);
    n=strlen(text);
    for(int i=0;i<=127;i++) stable[i]=m;
    for(int i=0;i<=m-2;i++) stable[pattern[i]]=m-1-i;
    printf("**********SHIFT TABLE********\n");
    for(int i=0;i<=127;i++) printf("%d ",stable[i]);
    printf("\n");
}
int horspool(){
    int i=m-1;
    while(i<=n-1){
        int k=0;
        while(k<=m-1 && pattern[m-1-k]==text[i-k]) k++;
        if(k==m) return i-m+1;
        else i+=stable[text[i]];
    }
    return -1;
}
void main(){
    shiftTable();
    int index=horspool();
    if(index==-1) printf("Pattern not found\n");
    else printf("Pattern is found at index %d",index);
}