#include "PicAppManager.h"
void PicAppManager::AddAppName(QString name)
{
PicApp* app = new BasicLogicHandle();

if(!AppNames.contains(name))
AppNames.append(name);
}

void PicAppManager::DeleteAppName(const QString name)
{
if(AppNames.contains(name))
AppNames.removeOne(name);
}

void PicAppManager::RegisterWords(QStringList list)
{
QString word;
foreach(word,list)
{
if(!SharedReservedWords.contains(word))
{
SharedReservedWords.append(word);
}
}
}

void PicAppManager::DeRegisterWords(QStringList list)
{
QString word;
foreach(word,list)
{
if(SharedReservedWords.contains(word))
{
SharedReservedWords.removeOne(word);
}
}
}







