#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void ChildProcess(int arr[],int n);
void ParentProcess(int arr[],int n);
void printArray(int arr[],int n);
void bubble_sort(int arr[],int n);
void insertion_sort(int arr[],int n);
int main(){

int n,i;
printf("\nEnter the size of Array:=");
scanf("%d",&n);
int arr[n],arrc[n],arrp[n];
for(i=0;i<n;i++){
 printf("a[%d]:=",i);
 scanf("%d",&arr[i]);
 arrc[i] = arr[i];
 arrp[i] = arr[i];
 
}
printf("\nYour array:=\n");
printArray(arr,n);
int pid;
pid = fork();
if(pid == 0){
ChildProcess(arrc,n);
}else if(pid>0){
ParentProcess(arrp,n);
}else{
 printf("failed");
 exit(-1);
}
return  0;
}
void ChildProcess(int arr[],int n){
  insertion_sort(arr,n);
  printf("\nChild Process id :=%d",getpid());
  printf("\nIn Child process After the insertion sort Array:=\n");
  printArray(arr,n);
}
void ParentProcess(int arr[],int n){
 bubble_sort(arr,n);
 printf("\nParent Process id :=%d\n",getpid());
 printf("\n I am Parent Process\n");
 printf("\nIn Parent process After the bubble sort Array:=\n");
 printArray(arr,n);
}
void printArray(int arr[],int n){
int i;
for(i=0;i<n;i++){
 printf("\na[%d]:=%d\n",i,arr[i]);

}
}
void bubble_sort(int arr[],int n){
 int i,j;
 for(i=0;i<n-1;i++){
    for(j=0;j<n-i-1;j++){
      if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
    }
 }
}
void insertion_sort(int arr[],int n){
 int i,j;
 for(i=1;i<n;i++){
  int key = arr[i];
  j=i-1;
  while(j>=0 && arr[j]>key){
   arr[j+1] = arr[j];
   j--;
  }
  arr[j+1] = key;
 }
 
}
