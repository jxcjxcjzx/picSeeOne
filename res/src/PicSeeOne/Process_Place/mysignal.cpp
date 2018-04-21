#include <signal.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

void my_func(int sig_no)
{
if(sig_no == SIGINT)
printf("I have get SIGINT\n");
else if(sig_no == SIGQUIT)
printf("I have get SIGQUIT\n");
}

int main()
{

printf("wait for signal sigint or sigquit\n");
signal(SIGINT,my_func);
signal(SIGQUIT,my_func);
pause();
exit(0);
}
