#include <ctype.h>
#include <stdio.h>
#include <string.h>

long atox(char *s)
{
long sum;

/* escape the space */
while(isspace(*s))
++s;

/* do the translation */
for(sum=0L;isxdigit(*s);++s)
{
int digit;
if(isdigit(*s))
	digit = *s - '0';
else
	digit = toupper(*s)-'A'+10;
sum = sum*16L + digit;

}
return sum;
}

long atox_simplified(char *s)
{
char xdigs[] = "0123456789ABCDEF";
long sum;

/* escape the space */
while(isspace(*s))
++s;

for(sum=0L;isxdigit(*s);++s)
{
int digit = strchr(xdigs,toupper(*s))-xdigs;
sum = sum*16L + digit;
}

return sum;

}

long atox_more_simplified(char *s)
{
long n = 0L;
sscanf(s,"%lx",&n);
return n;
}
