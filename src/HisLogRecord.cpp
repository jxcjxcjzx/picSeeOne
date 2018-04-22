#include "HisLogRecord.h"
/*
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
*/
void HisLogRecord::AddOne(QString record)
{
this->loglist.append(record);
}

void HisLogRecord::WriteToFile()
{

}

QStringList HisLogRecord::GetCurrentList(int limits)
{
if(limits==0)
{
// then we just return the whole record to the caller
return this->loglist;
}
else
{
if(limits<this->loglist.size())
{
QStringList forreturn;
for(int i=0;i<limits;i++)
{
forreturn.append(this->loglist.at(i));
}
return forreturn;
}
}
}
