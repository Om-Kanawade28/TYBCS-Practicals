#include<stdio.h>
void printArray(int arr[],int n);
void insertionSort(int arr[],int n);
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
 printArray(arr,n);
 printf("\nAfter Inseration sort Your Array:=\n");
 insertionSort(arr,n);
 printArray(arr,n);
return 0;
}
void printArray(int arr[],int n){
 int i;
 for(i=0;i<n;i++){
     printf("arr[%d] := %d\n",i,arr[i]);
     
 }
}
void insertionSort(int arr[],int n){
 int i,j;
 int key;
 for(i=1;i<n;i++){
   key = arr[i];
   j = i -1;
   while(j>=0 && arr[j]>key){
    arr[j+1] = arr[j];
    j--;
   }
   arr[j+1] = key;
 }

}
