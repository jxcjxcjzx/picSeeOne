#ifndef PICSEEONEREGEX_H
#define PICSEEONEREGEX_H
#include <QStringList> 
#include "PicApp.h"
#include "BasicLogicHandle.h"   

enum RequestType{
NoOptions,
FilterDir,
FilterFile,
FilterNum
};

typedef struct SpecialRequest
{
QString content;
RequestType type;
};

class PicSeeOneregex
{
public:
PicSeeOneregex();
void GetNameList(QStringList);
QStringList ParseList(QString input);
static QString GetNameDir(QString string);
static int GetLeftPos(QString string);
bool more_about_name(QString name,SpecialRequest request);
private:
QStringList namelist;
};


#endif
