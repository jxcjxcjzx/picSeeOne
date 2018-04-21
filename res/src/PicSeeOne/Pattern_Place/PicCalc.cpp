#include <stdio.h>
#include <iostream>
#include <stdlib.h>
#include <stack>
#include <ctype.h>
using namespace std;

bool isoperator(const char& c)
{
if(c=="+"||c=="-"||c=="*"||c=="/")
return true;
else
return false;
}

bool isleftblanket(const char& c)
{
if(c=="(")
return true;
else
return false;
}

bool isrightblanket(const char& c)
{
if(c==")")
return true;
else
return false;
}

int Calc(char* p,int len)
{
stack<int> num;
stack<int> ope;

for(int i=0;i<len;i++)
{
if(isdigit(p[i]))
{
cout<<"ok!"<<endl;

}
}

}

int main()
{
char a[] = "12632167";
Calc(a,8);

}
