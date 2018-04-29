#include <stdio.h> 
#include <iostream.h> 
int match_star(int c,char *regexp,char*text);
int match_here(char *regexp,char*text){
    if(regexp[0] == '\0')return 1;
    if(regexp[1] == '*') return match_star(regexp[0],regexp+2,text);
    if(regexp[0] == '$') return text[0] == '\0';
    if(regexp[0] == '.' && text[0] != '\0')  return match_here(regexp+1,text+1);
    if(regexp[0] == text[0] && text[0] != '\0')  return match_here(regexp+1,text+1);
    return 0;

}

int match_star(int c,char *regexp,char*text){
    do{
        if(match_here(regexp,text) == 1) return 1;        
    }
    while((*text) != '\0' &&(*text++ == c || c == '.'));
    return 0;
}
int main() 
{ 
  char *a = "a*$";
  char *b = "aab";
  printf("%d",match_here(a,b));
  int printf = printf();
  cout << printf;
  getchar();
  return 0; 
} 
