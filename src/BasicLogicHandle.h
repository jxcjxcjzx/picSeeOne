#ifndef BASICLOGICHANDLE_H
#define BASICLOGICHANDLE_H

#include "PicApp.h"
#include "PicAppManager.h"
#include <QStringList>
#include <QString>
class PicApp;
class BasicLogicHandle:public PicApp
{
public:
BasicLogicHandle();
~BasicLogicHandle();
virtual QStringList Handle(QStringList list, QString wordin);
private:
QStringList ReservedWords;
QString AppName;
// here we should define the actions to be taken by specified class
// and this is achieved by set a number to the class
// and when things happen, let the number decide which one to be called
};


#endif
