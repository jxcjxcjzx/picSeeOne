#ifndef SUGGESTPROVIDER_H
#define SUGGESTPROVIDER_H

#include <QStringList>
#include <QString>
class SuggestProvider
{
public:
SuggestProvider();
~SuggestProvider();
QStringList ProvideSuggest(QString wordsin);
private:
QStringList suggests;
};


#endif
