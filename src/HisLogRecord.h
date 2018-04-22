#ifndef HISLOGRECORD_H
#define HISLOGRECORD_H

#include <QStringList>
#include <QString>
class HisLogRecord
{
public:
HisLogRecord();
~HisLogRecord();
QStringList GetCurrentList(int limits);// here the limits variable mark the number of records to be returned, and check the length first to make sure no mistake happens 
void WriteToFile();// this function writes the history log on record to a file in case will be used someday in the future
private:
QStringList loglist;
};

#endif
