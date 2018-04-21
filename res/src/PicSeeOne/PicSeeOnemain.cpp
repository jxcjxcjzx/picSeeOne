#include "PicSeeOneregex.h"
#include <QApplication>
#include "PicSeeOne.h"

// testing area
#include "PicSeeOneWithConsole.h"

int main(int argc,char **argv)
{
QApplication app(argc,argv);
//PicSeeOneWithConsole w;
PicSeeOne w;
w.show();
return app.exec();
}
