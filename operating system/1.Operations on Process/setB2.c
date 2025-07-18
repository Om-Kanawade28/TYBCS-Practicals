#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main(){
int pid;
pid = fork();
if(pid>0){
 printf("\nParent process Started....\n");
 printf("Parnent process ID:=%d",getpid());
}else if(pid == 0){
 printf("\nChild process Started.....\n");
 printf("\nChild process ID:=%d",getpid());
 printf("\nParnent process ID:=%d",getppid());
 sleep(7);
 printf("\n\nChild process Started.....\n");
 printf("\nChild process ID:=%d",getpid());
 printf("\nParnent process ID:=%d",getppid());
 }else{
 printf("Failed to create child process");
 exit(1);
 }
return 0;
}
