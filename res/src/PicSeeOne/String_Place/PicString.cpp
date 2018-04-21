#include "PicString.h"
#include <string.h>

static const char* Pic_Strstr(const char* string,const char* strCharset)  // return the first occurence of one type of sub-stirng in source-string
{
for(int i=0;string[i]!='\0';i++)
{
int j=0;
int temp = i;
if(string[i]==strCharset[j])
{
while(string[i++]==strCharset[j++])
{
if(strCharset[j]=='\0')
return &string[i-j];
}
i = temp;
}
}
return NULL;
}

static void Pic_Stringcpy(char* to,const char* from)
{
assert(to!=NULL&&from!=NULL);
while(*from!='\0')
{
*to++=*from++;
}
*to = '\0';
}

static char* Pic_Strcpy(char* strDest,const char* strSrc)
{
assert((strDest!=NULL)&&(strSrc!=NULL));
char* address = strDest;
while((*strDest++=*strSrc++)!='\0');
return address;
}

PicString::~PicString(void)
{
delete [] m_data; // you can also write as deleet m_data as it is an inner data type
}

PicString::PicString(const char* str)
{
if(str==NULL)
{
m_data = new char[1];
*m_data = '\0';
}
else
{
int length = strlen(str);
m_data = new char[length-1];  // added up an NULL value checking will be better
strcpy(m_data,str);
}
}

PicString::PicString(const String &another)
{
int length = strlen(another.m_data);
m_data = new char[length+1]; // better added up an NULL value checking
strcpy(m_data,another.m_date);
}

PicString& PicString::operator = (const PicString& another)
{
if(this == &another)
{
return *this;
}
delete []m_data;
int length = strlen(another.m_data);
m_data = new char[length+1];
strcpy(m_data,another.m_data);
return *this;
}

int main()
{
return 0;
}
