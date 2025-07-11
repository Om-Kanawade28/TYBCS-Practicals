#include<stdio.h>
void bubble_sort(int arr[],int n);
int main(){
 int n,i;
 printf("Enter Size of Array:=");
 scanf("%d",&n);
 int arr[n];
 printf("\nEnter the Array:=\n");
 for(i = 0;i<n;i++){
     printf("\nEnter the arr[%d] := ",i);
     scanf("%d",&arr[i]);
 }
 printf("\n Your Array:=\n");
 for(i=0;i<n;i++){
     printf("arr[%d] := %d\n",i,arr[i]);
     
 }
 bubble_sort(arr,n);
 printf("\nAfter Bubble sort:=\n");
 for(i=0;i<n;i++){
     printf("arr[%d] := %d\n",i,arr[i]);
 }
 
 return 0;
}
void bubble_sort(int arr[],int n){
 int i,j;
 for(i=0;i<n-1;i++){
    for(j = 0;j<n-i-1;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
    }
 }

}
