#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

int main(){
 pid_t pid;
 pid = fork();
 char *args[] = {"/home/bcs/Documents/Om Kanawade/",NULL};
 if(pid ==0){
   execv(args[0],args);
 }
 else{
     printf("I am parent\n");
 }
 return 0;
}

