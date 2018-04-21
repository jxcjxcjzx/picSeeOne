#include <sys/stat.h>
#include <time.h>
#include <sys/types.h>
#include <stdio.h>

int main()
{
struct stat sb_buf;
long result = 0;
result = stat("../pic/xueshu/google_pic_handle.jpg",&sb_buf);
if(result != 0){
perror("something wrong with the file");
}
else{
printf("last status change: %s",ctime(&sb_buf.st_mtime));
}

return 0;
}

