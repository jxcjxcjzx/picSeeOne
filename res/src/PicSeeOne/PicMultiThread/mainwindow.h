#ifdef MAINWINDOW_H
#define MAINWINDOW_H

#include <QtGui/QMainWindow>
#include <QPushButton>
#include <QLabel>
#include <QHBoxLayout>

class MainWindow: public QMainWindow
{
Q_OBJECT
private:
QOushButton *calbutton;
QOushButton *hibutton;
QLabel *mLabel;

public:
MainWindow(QWidget *parent=0);
~MainWindow();

private slots:
void slotGetPi();
void slotSayHi();


};


# endif
