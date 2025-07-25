#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
#include<wait.h>

void printArray(int arr[],int n);
void ChildProcess(int arrC[],int n);
void ascending(int arrC[],int n);
void ParentProcess(int arrP[],int n);
void descending(int arrP[],int n);
int main(){
int n,i;
printf("Enter the size of Array:=");
scanf("%d",&n);
int arr[n],arrC[n],arrP[n];
for(i=0;i<n;i++){
 printf("Enter A[%d]:=",i);
 scanf("%d",&arr[i]);
 arrC[i] = arr[i];
 arrP[i] = arr[i];
 }
printf("\nYour Array:=");
printArray(arr,n);

int pid;
pid = fork();
if(pid == 0){
 ChildProcess(arrC,n);
 
}else if(pid >0){
  ParentProcess(arrP,n);
 
}else{
  printf("did not created the child process try again");
  exit(-1);
}

return 0;
}
void printArray(int arr[],int n){
 int i;
 for(i=0;i<n;i++){
  printf("\na[%d] := %d\n",i,arr[i]);
 }
}
void ChildProcess(int arrC[],int n){
 printf("\nchild process");
 descending(arrC,n);
 printf("\nAfter descending sort the element in child processs :=");
 printArray(arrC,n);
 exit(0);
 
}
void ascending(int arrC[],int n){
 int i,j;
 for(i=1;i<n;i++){
  int key= arrC[i];
  int j = i-1;
  while(j>=0 && arrC[j]>key){
    arrC[j+1] = arrC[j];
    j--;
  }
  arrC[j+1] = key;
 }

}
void ParentProcess(int arrP[],int n){
 int status;
 wait(NULL);
 
 printf("\nparent process");
 if(WIFEXITED(status)){
   printf("\nChild Process Exit");
  }
 ascending(arrP,n);
 printf("\nAfter ascending sort the element in parent  processs :=");
 printArray(arrP,n);
 exit(0);
}
void descending(int arrP[],int n){
 int i,j;
 for(i=0;i<n;i++){
  for(j=0;j<n-i-1;j++){
   if(arrP[j] < arrP[j+1]){
     int temp = arrP[j];
     arrP[j] = arrP[j+1];
     arrP[j+1] = temp;
    }
   }
  }
 

}




