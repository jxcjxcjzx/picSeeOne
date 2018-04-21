#include "PicTime.h"
#include <QString>

typedef struct pictimestruct
{
QString AlterTime; 
int PicSize;
int WordAmount;
int linkage;  // the links number related to this image, used later maybe
// there will be more .......
}PicTimeStruct;


// here we test a new thing, try to create a picture ourself
bool CreateBmp(char* datain,int datalength)
{



}

void FillPicInfo(PicTimeStruct* timestruct)
{
// this function is responsible for fill in the 
// information about the image the user is querying
// and the user can get or handle with the information
// later with the structure he put in here , at ease
if(timestruct==NULL){
	return;
}
else{

}

}
