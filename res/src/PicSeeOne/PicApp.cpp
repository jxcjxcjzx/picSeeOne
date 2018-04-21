#include "PicApp.h"
#include "PicAppManager.h"
/*
PicApp::PicApp()
{

}
PicApp::~PicApp()
{

}
*/
void PicApp::IamIn(PicAppManager manager)
{
manager.AddAppName(AppName);
manager.RegisterWords(ReservedWords);
}

void PicApp::IamOut(PicAppManager manager)
{
manager.DeleteAppName(AppName);
manager.DeRegisterWords(ReservedWords);
}






