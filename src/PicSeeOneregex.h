#ifndef PICSEEONEREGEX_H
#define PICSEEONEREGEX_H
#include <QStringList> 
class PicSeeOneregex
{
public:
PicSeeOneregex();
void GetNameList(QStringList);
void AddNameList(QStringList);
QStringList ParseList(QString input);
private:
QStringList namelist;
};
#endif
