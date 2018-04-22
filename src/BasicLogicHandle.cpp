#include "BasicLogicHandle.h"
//#include "PicApp.h"
//#include "PicAppManager.h"

BasicLogicHandle::BasicLogicHandle()
{
ReservedWords.append("&");
ReservedWords.append("||");
OpenOrder = "set basic on";
CloseOrder = "set basic off";
}

QStringList BasicLogicHandle::Handle(QStringList list, QString wordin)
{
QStringList forreturn;
// handle for the "&" case
if(wordin.contains("&"))// here we limit the number of words parallel to 2 only
{
QStringList splitlist = wordin.split("&");
if(splitlist.size()==2)
{
forreturn = list.filter(QRegExp(splitlist[0]));
forreturn = forreturn.filter(QRegExp(splitlist[1]));
}
else
{}
}

if(wordin.contains("||"))// here this time the query is no limited 
{
QString onestring;
QStringList splitlist = wordin.split("||");
if(splitlist.size()>=2)
{
foreach(onestring,splitlist)
{
forreturn<<list.filter(QRegExp(onestring));
}
}
else
{}
}
return forreturn;
}

BasicLogicHandle::~BasicLogicHandle()
{
}
