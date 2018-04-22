#include "PicSeeOneregex.h"
#include <QApplication>
#include "PicSeeOne.h"


int main(int argc,char **argv)
{
QApplication app(argc,argv);
PicSeeOne w;
w.show();
return app.exec();
}
