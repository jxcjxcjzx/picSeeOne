#ifndef PICSTRING_H  
#define PICSTRING_H  

#include <stdio.h>

static char* Pic_Strcpy(char* strDest,const char* strSrc);


class PicString
{
public :
PicString(const char *str = NULL);
PicString(const PicString &another);
~PicString(void);
PicString* operator = (const PicString &another);
private:
char *m_data; // used for storing the char array
};
#endif
