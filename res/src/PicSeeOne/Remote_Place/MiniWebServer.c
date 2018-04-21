#include <sys/types.h>
#include <signal.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <string.h>
#include <arpa/inet.h>
#include <stdio.h>
#include <stdlib.h>


typedef struct sockaddr SA;

#define MYPORT 8000
#define MYIP "127.0.0.1"

// this module handles with the
// http request, both parse and deal with
#define MAXLINE 150

void handle_req(int fd)
{
char buf[MAXLINE],method[MAXLINE],uri[MAXLINE],version[MAXLINE];

FILE *f = fdopen(fd,"r");
if(!f)
{
close(fd);
return; 
}

setbuf(f,0);

if(!fgets(buf,MAXLINE,f))
{
fclose(f);
return;
}

sscanf(buf,"%s %s %s",method,uri,version);
#ifdef DEBUG
printf("method: %s, uri: %s, version: %s \n ",method,uri,version);
#endif

}


int main(int argc,char **argv)
{

signal(SIGCHLD,SIG_IGN);
signal(SIGPIPE,SIG_IGN);

int port = atoi(argv[0]);

int listen_fd;
struct sockaddr_in client_addr;
struct sockaddr_in server_addr;

if((listen_fd=socket(AF_INET,SOCK_STREAM,IPPROTO_TCP))<0)
{
exit(1);
}

int optval = 1;
if((setsockopt(listen_fd,SOL_SOCKET,SO_REUSEADDR,(void*)&optval,sizeof(int)))<0)
{
exit(1);
}

server_addr.sin_family = AF_INET;
server_addr.sin_port = htons(MYPORT);
server_addr.sin_addr.s_addr = htonl(INADDR_ANY);

if(bind(listen_fd,(SA *)&server_addr,sizeof(server_addr))<0)
{
exit(1);
}

if(listen(listen_fd,1024)<0)
{
exit(1);
}

#ifdef DEBUG
// print something
#endif

int conn_fd,len;
while(1)
{
len = sizeof(client_addr);
if((conn_fd - accept(listen_fd,(SA *)&client_addr,&len))<0)
{
exit(1);
close(listen_fd);
}

// you can print something here
#ifdef DEBUG
printf("connected .fd = %d \n",conn_fd);
#endif

handle_req(conn_fd);
close(conn_fd);

}

}
