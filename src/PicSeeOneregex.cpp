#include "PicSeeOneregex.h"
#include <QDir>
   
PicSeeOneregex::PicSeeOneregex()
{
QDir dic("./pic/");
// the following codes are used to judge if a file is a directory
//QFileInfo judge_dir("./pic");
GetNameList(dic.entryList());
}

bool PicSeeOneregex::more_about_name(QString name,SpecialRequest request)
{
return false;
}

int PicSeeOneregex::GetLeftPos(QString string)
{
int forreturn = 0;
forreturn = string.length()-string.indexOf("#")-1;
return forreturn;
}

QString PicSeeOneregex::GetNameDir(QString string) 
{
QString forreturn = "";
QStringList list = string.split("#");
forreturn = list.at(0);
return forreturn;
}

void PicSeeOneregex::GetNameList(QStringList input)
{
QStringList result;
QStringList addresult;
QString tmpdir;
// get the file under each namespace and add them to dir
// and store them in txt file is suggested
// or the user use a "update" command to do an updating
for(int i=0;i<input.size();i++)
{
result = QDir("./pic/"+input.at(i)).entryList();
tmpdir = input.at(i)+"#";
for(int j=0;j<result.size();j++)
{
 addresult.append(tmpdir+(QString)result.at(j));
}
namelist<<addresult;
addresult.clear();
}

}

QStringList PicSeeOneregex::ParseList(QString grammer)
{
QRegExp rx(grammer);
QStringList result=namelist.filter(QRegExp(grammer));
return result;
}

