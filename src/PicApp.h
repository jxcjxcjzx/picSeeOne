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


#endif
