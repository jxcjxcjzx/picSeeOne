#include "PicSeeOneregex.h"
#include <QApplication>
#include "PicSeeOne.h"


int main(int argc,char **argv)
{
QApplication app(argc,argv);
QTextCodec *codec = QTextCodec::codecForName("GB2312");
QTextCodec::setCodecForLocale(codec);
PicSeeOne w;
w.show();
return app.exec();
}
