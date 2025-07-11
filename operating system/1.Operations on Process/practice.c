#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main(){
pid_t pid;
int retnice;
pid = fork();
{
if(pid == 0){
retnice = nice(-5);
printf("The Child gets Higher CPU priority:=%d\n",retnice);
sleep(1);
}else{
retnice = nice(5);
printf("The Parent gets Lower CPU priority:=%d\n",retnice);
sleep(1);
}
}
return 0;
}
