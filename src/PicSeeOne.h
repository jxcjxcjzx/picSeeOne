#ifndef PICSEEONE_H
#define PICSEEONE_H

#include <QtGui>
#include <qpicture.h>
#include <QLineEdit>
#include <QFile>
#include <QString>
#include <QObject>
#include <QLabel>
#include <QLineEdit>
#include <QDir>
#include <QStringList>
#include <QRegExp>
#include <qpixmap.h>
#include <qpainter.h>
#include <QFrame>

class PicSeeOne:public QFrame 
{
public:
void next_pic();
void pre_pic();
PicSeeOne();
~PicSeeOne();
QString sendout();
void PicSwitch(QString picname);
void showpic();
void index_forward();
int index_get();
void index_back();
int ceiling_get();
private:
void paintEvent(QPaintEvent*);
void setFocus();
QPainter *painter;
QPixmap image;
QString pic_dir;
QString query;
QLineEdit *medit;
QLineEdit *BillBoard;
protected:
int current_index_of_pic;
int ceiling_of_pic;
void keyPressEvent(QKeyEvent *event); 
};
#endif
