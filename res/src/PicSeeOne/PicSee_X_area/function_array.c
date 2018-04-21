#include <stdio.h>
#include "function_array.h"

int add(int opd0,int opd1);
int sub(int opd0,int opd1);
int mul(int opd0,int opd1);
int div(int opd0,int opd1);

int main()
{
int (*p[4])(int opd0,int opd1) = {add,sub,mul,div};

printf("the result from the function array, the add function: %d\n",p[0](1,2));


return 0;
}
