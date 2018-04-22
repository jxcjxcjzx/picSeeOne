#include "PicSeeOneregex.h"
#include <QDir>
PicSeeOneregex::PicSeeOneregex()
{
QDir dic("./pic/");
GetNameList(dic.entryList());
}
void PicSeeOneregex::GetNameList(QStringList input)
{
namelist<<input;
}
void PicSeeOneregex::AddNameList(QStringList input)
{
namelist<<input;
}
QStringList PicSeeOneregex::ParseList(QString grammer)
{
QRegExp rx(grammer);
QStringList result=namelist.filter(QRegExp(grammer));
return result;
}
