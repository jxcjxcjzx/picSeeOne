#ifndef PICAPP_H
#define PICAPP_H

#include <QString>
#include <QStringList>
#include "PicAppManager.h"
class PicAppManager;
class PicApp
{
public:
PicApp(){};
~PicApp(){};
void IamIn(PicAppManager manager);
void IamOut(PicAppManager manager);
virtual QStringList Handle(QStringList list, QString wordin)=0;// the list is the thing where store all the pic names for filter
private:
QStringList ReservedWords;// this is shared between each othr
QString AppName;
};

class BasicLogicHandle:public PicApp
{
public:
BasicLogicHandle();
~BasicLogicHandle();
virtual QStringList Handle(QStringList list, QString wordin);
private:
QStringList ReservedWords;
QString AppName;
QString OpenOrder;
QString CloseOrder;
// here we should define the actions to be taken by specified class
// and this is achieved by set a number to the class
// and when things happen, let the number decide which one to be called
};

#endif
