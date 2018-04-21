#include <stdio.h>

// this function is for input
// charsequence filter .
// for example, we have pic named like the following:
// "mysql_create-sample" , actualy, we mistyped
// in the '-' char, and we need to change it to 
// the char '_', so we can do an filtering.like below:
/*
static inline char dash2underscore(char c)
{
	if(c=='-')
	  return '_';
	return c;
}
**/
// the above idea comes from the linux
// source code, in kernel/params.c source file.
// hope you can use it.

