#include "PicSeeOneWithConsole.h"

PicSeeOneWithConsole::PicSeeOneWithConsole()
{
showme = new QTextEdit();
showme->setReadOnly(true);
setCentralWidget(showme);
editme = new QLineEdit();
QDockWidget* qdw = new QDockWidget("Type commands here:");
qdw->setWidget(editme);
addDockWidget(Qt::BottomDockWidgetArea,qdw);
connect(editme,SIGNAL(returnPressed()),this,SLOT(execute()));
myshell = new QProcess(this);
myshell->start("bash -i");
myshell->setReadChannelMode(QProcess::MergedChannels);
connect(myshell,SIGNAL(readyReadStandardOutput()),this,SLOT(showOutput()));
}

void PicSeeOneWithConsole::showOutput()
{
QByteArray bytes = myshell->readAllStandardOutput();
QStringList lines = QString(bytes).split("\n");
foreach(QString line,lines)
{
showme->append(line);
}
}

void PicSeeOneWithConsole::execute()
{
QString cmdStr = editme->text()+"\n";
editme->setText("");
showme->append(cmdStr);
QByteArray bytes = cmdStr.toUtf8();
myshell->write(bytes);
}

PicSeeOneWithConsole::~PicSeeOneWithConsole()
{
delete editme;
delete showme;
delete myshell;
}


