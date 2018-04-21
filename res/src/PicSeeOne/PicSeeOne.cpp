#include "PicSeeOne.h"
#include <QIcon>
#include <QLabel>
#include <QtGui>
#include <qpicture.h>
#include <QLineEdit>
#include <QFile>
#include <QObject>
#include <QString>
#include <QLineEdit>
#include <QDir>
#include <QFrame> 
#include <QStringList>
#include <QRegExp>
#include <qpixmap.h>
#include <qpainter.h>
// test area 
#include <QListView>
#include <QListWidget>
#include "SuggestProvider.h"
#include "HisLogRecord.h"
#include "PicSeeOneregex.h"

// here the function is for the data read from the udp channel
void PicSeeOne::readPendingDatagrams()
{
while(receiver->hasPendingDatagrams())
{
QByteArray datagram;
datagram.resize(receiver->pendingDatagramSize());
receiver->readDatagram(datagram.data(),datagram.size());
if(QString(datagram.data())=="enter")
{
enterentered();
break;
}
if(QString(datagram.data())=="right")
{
PicSeeOne::next_pic();
break;
}
if(QString(datagram.data())=="left")
{
PicSeeOne::pre_pic();
break;
}

medit->insert(QString(datagram.data()));
medit->setFocus();
medit->show();
break;
}

}

PicSeeOne::PicSeeOne()
{
//only a test , one line

setWindowTitle("PicSeeOne");
setWindowIcon(QIcon("PicSeeOne.jpg"));


current_index_of_pic=0;
query="qt";
pic_dir="./pic/";
ceiling_of_pic=1;
resize(1000,600);
painter=new QPainter();
image.load("error404.jpg");
medit = new QLineEdit(this);
BillBoard = new QLineEdit(this);
medit->setGeometry(10,30,360,30);
BillBoard->setGeometry(700,570,300,22);

// test area
listWidget = new QListWidget(this);
// add for the radio listening function
receiver = new QUdpSocket(this);
QHostAddress udpaddr;
udpaddr.setAddress("192.168.43.133"); // the address should be changable
receiver->bind(udpaddr,6665);// the bind socket port to 6665 by default
// following are the ways to add items to listwidget
//new QListWidgetItem(tr("hello"),listWidget);
listWidget->setGeometry(10,60,160,90) ;
PicApp* app = new BasicLogicHandle();

QString mystring;
medit->insert("qt");
connect(medit,SIGNAL(returnPressed()),this,SLOT(repaint()));
connect(medit,SIGNAL(returnPressed()),this,SLOT(setFocus()));
connect(medit,SIGNAL(returnPressed()),medit,SLOT(clear()));
connect(medit,SIGNAL(returnPressed()),medit,SLOT(hide()));
connect(receiver,SIGNAL(readyRead()),this,SLOT(readPendingDatagrams()));
}

PicSeeOne::~PicSeeOne()
{
delete medit;
delete listWidget;
delete BillBoard;
}

int PicSeeOne::index_get()
{
return current_index_of_pic;
}

void PicSeeOne::index_forward()
{
current_index_of_pic++;
}

void PicSeeOne::index_back()
{
current_index_of_pic--;
}

int PicSeeOne::ceiling_get()
{
return ceiling_of_pic;
}

void PicSeeOne::keyPressEvent(QKeyEvent *event)
{
switch(event->key())
{
case Qt::Key_Right:
{
PicSeeOne::next_pic();
break;
}
case Qt::Key_Left:
{
PicSeeOne::pre_pic();
break;
}
// we set many keys to no input effect
case Qt::Key_Shift:{break;}
case Qt::Key_Control:{break;}
case Qt::Key_Alt:{break;}
case Qt::Key_Down:{break;}
case Qt::Key_Up:{break;}
case Qt::Key_CapsLock:{break;}
case Qt::Key_NumLock:{break;}

case Qt::Key_Return:
{
listWidget->hide();
break;
}
default:
{
medit->insert(QChar(event->key()).toLower());
medit->setFocus();
medit->show();
//here is where the suggester take effect and codes will be added later
listWidget->show();
}
}
}
void PicSeeOne::paintEvent(QPaintEvent*)
{
QString tmp =sendout();
BillBoard->setText("The pic opened is: "+tmp);
image.load(tmp);
painter->begin(this);
painter->drawPixmap((this->width()-image.width())/2,(this->height()-image.height())/2,image);
painter->end();
}

QString PicSeeOne::sendout()
{
PicSeeOneregex jiexi;
if(medit->text().isEmpty())
{
}
else
{
query=medit->text();
current_index_of_pic=0;
}
QStringList resultofjiexi = jiexi.ParseList(query);
if(resultofjiexi.size()>0) 
{
ceiling_of_pic = resultofjiexi.size();
return pic_dir+PicSeeOneregex::GetNameDir(resultofjiexi.at(index_get()))+"/"+resultofjiexi.at(index_get()).right(PicSeeOneregex::GetLeftPos(resultofjiexi.at(index_get()))); 
}
else
{
ceiling_of_pic = 1;
return "error404.jpg";
}
}
void PicSeeOne::next_pic()
{
if(index_get()<ceiling_get()-1)
index_forward();
if(index_get()<ceiling_get())
{
this->repaint();
}
}

void PicSeeOne::enterentered()
{
repaint();
setFocus();
medit->clear();
medit->hide();
listWidget->hide();
}

void PicSeeOne::pre_pic()
{
if(index_get()>0)
index_back();
if(index_get()<ceiling_get()&&index_get()>-1)
{
this->repaint();
}

}

