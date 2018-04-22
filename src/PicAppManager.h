#ifndef PICAPPMANAGER_H
#define PICAPPMANAGER_H

#include <QStringList>
#include <QString>
#include "PicApp.h"

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
};


#endif
