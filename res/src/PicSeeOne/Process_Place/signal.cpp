#include <sys/types.h>
#include <unistd.h>
#include <signal.h>

/*
int kill(pid_t pid,int signo);
int raise(int signo);
*/

#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>

int main()
{
pid_t pid;
int ret;
if((pid=fork())<0)
{
perror("fork");
exit(1);
}
if(pid==0)
{
raise(SIGSTOP);
exit(0);
}
else
{
printf("pid=%d\n",pid);
if((waitpid(pid,NULL,WNOHANG))==0)
{
if((ret=kill(pid,SIGKILL))==0)
{
printf("kill %d\n",pid);
}
else
{
perror("kill");
}
}
}

}
