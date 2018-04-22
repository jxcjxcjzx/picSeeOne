#ifndef PICAPPMANAGER_H
#define PICAPPMANAGER_H

#include <QStringList>
#include <QString>
#include <QListWidget>
#include "PicApp.h"
#include "BasicLogicHandle.h"
// testing area
class PicApp;
class BasicLogicHandle;
#define MAXAPP_NUM 99
class PicAppManager
{
public:
void AddAppName(const QString name);
void DeleteAppName(const QString name);
void RegisterWords(QStringList list);
void DeRegisterWords(QStringList list);

private:
QStringList SharedReservedWords; // this is shared between each other
QStringList AppNames;
int CurrentAppNum;
//PicApp* AppStore[MAXAPP_NUM];
};


#endif
