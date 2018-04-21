
#ifndef PICSEEONEWITHCONSOLE_H
#define PICSEEONEWITHCONSOLE_H

#include <QProcess>
#include <QFrame>
#include <QLineEdit>
#include <QTextEdit>
#include <QMainWindow>
#include <QDockWidget>

class PicSeeOneWithConsole:public QMainWindow 
{

Q_OBJECT

public:
// here is a list of operations for remote control
PicSeeOneWithConsole();
~PicSeeOneWithConsole();
private:
QLineEdit *editme;
QTextEdit *showme;
QProcess *myshell;

public slots:
void execute();
void showOutput();

// for test

};
#endif
