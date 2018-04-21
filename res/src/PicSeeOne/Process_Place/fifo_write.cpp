
#include <unistd.h>
#include <sys/stat.h>
#include <errno.h>
#include <fcntl.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define FIFO_SERVER "/home/jxcpso/jxc2014/myfifo.txt"

int main()
{
char w_buf[100];
int fd;
int nwrite;

char send[] = "bhjehewj";
fd = open(FIFO_SERVER,O_WRONLY|O_NONBLOCK,0);
if(fd==-1)
{
if(errno == ENXIO)
printf("open error; no reading processes\n");
}

strcpy(w_buf,send);
if((nwrite = write(fd,w_buf,100))==-1)
{
if(errno == EAGAIN)
printf("the FIFO has not been read yet. try later\n");
else
printf("other wrong\n");
perror("write");
}
else
printf("write %s from FIFO\n",w_buf);
}
