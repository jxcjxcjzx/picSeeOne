package maininterface;
import java.awt.*; 
import java.awt.event.*; 
import java.applet.Applet; 
import java.awt.Color; 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import trees.*;
import ramsystem.*;


public class Wuzi extends Applet implements MouseListener, 
MouseMotionListener{ 
int color = 0;// ���ӵ���ɫ��ʶ 0:���� 1:���� 

Listandnodefarm farm = new Listandnodefarm();
readfile readme = new readfile();
TreeNodes parent = new TreeNodes();
TreeNodes parent2 = new TreeNodes();

TreeNodes teacher = new TreeNodes();
TreeNodes teacher2 = new TreeNodes();
int teachx = 0;
int teachy = 0;
int randompoint = 0;
int pointchoose = 0;
int jishu = 0;
int biaozhun = 0;
boolean occupied = false;
boolean youfirst = true;
boolean findtrick = true;
String []teachsplit = new String[2];
//here we have our database for playing getting their values

int bodyArray[][] = new int[25][25]; // ������������״̬ 0 ���� -1 ���� 1 ���� 


int count = 0;
boolean gameover = false;

public void init() { 
setLayout(null); 
addMouseListener(this); 
gameInit(); 
this.resize(new Dimension(500,490)); 

// first loadin the String array

  getfirsttree(); 
  getsecondtree();

// up to mow we have a state tree for us
} 


public void getfirsttree()
{
	int i=2;  
	String []a = readme.loadStrings("D:/Program Files/Smith/Wuzichip/youfirst.txt");    
	String []b = a[0].split(",");
	TreeNodes front = new TreeNodes();
	TreeNodes front2 = new TreeNodes();
	parent.setData("12 13");
	teacher = parent;
	front = front2 = parent;
	boolean limbcreatestart = false;
	int limbcount = 0;
	String currenttreeword = "";

	while(i<b.length){
	    front.setfather(front2);
	    front.setChildren(farm.createlist(farm.createnode(b[i]+" "+b[i+1])));
	  // ping - pong strategy
	    front2 = front;
	    front = front.getChildren().get(0);
	  i+=2;
	}
	                
	for(int count = 1;count<a.length;count++){
	          String []c = a[count].split(",");
	          i=2;
	          front = front2 = parent;
	          limbcount = 0;
	          currenttreeword ="";
	          limbcreatestart = false;
	          while(i<c.length){
	              if(limbcreatestart){
	                     front.setChildren(farm.createlist(farm.createnode(c[i]+" "+c[i+1])));
	                     front2 = front.getChildren().get(0);
	                     front2.setfather(front);
	                     front = front2;
	              }
	              else{
	                
	                    for(limbcount=0;limbcount<front.getChildren().size();limbcount++){      
	                      currenttreeword = front.getChildren().get(limbcount).getData();
	                           if(currenttreeword.equals(c[i]+" "+c[i+1])){     
	                                front = front.getChildren().get(limbcount);
	                                break;
	                           }
	                                   else if(limbcount == front.getChildren().size()-1){
	                                     front.getChildren().add(farm.createnode(c[i]+" "+c[i+1]));
	                                     front.getChildren().get(front.getChildren().size()-1).setfather(front);
	                                     front = front.getChildren().get(front.getChildren().size()-1);
	                                     limbcreatestart = true;
	                                     break;
	                                   }
	                    }
	              }
	            i+=2;
	          }
	} 	
}


public void getsecondtree()
{
	int i=2;  
	String []a = readme.loadStrings("D:/Program Files/Smith/Wuzichip/mefirst.txt");    
	String []b = a[0].split(",");
	TreeNodes front = new TreeNodes();
	TreeNodes front2 = new TreeNodes();
	parent2.setData("12 13");
	teacher2 = parent2;
	front = front2 = parent2;
	boolean limbcreatestart = false;
	int limbcount = 0;
	String currenttreeword = "";

	while(i<b.length){
	    front.setfather(front2);
	    front.setChildren(farm.createlist(farm.createnode(b[i]+" "+b[i+1])));
	  // ping - pong strategy
	    front2 = front;
	    front = front.getChildren().get(0);
	  i+=2;
	}
	                
	for(int count = 1;count<a.length;count++){
	          String []c = a[count].split(",");
	          i=2;
	          front = front2 = parent2;
	          limbcount = 0;
	          currenttreeword ="";
	          limbcreatestart = false;
	          while(i<c.length){
	              if(limbcreatestart){
	                     front.setChildren(farm.createlist(farm.createnode(c[i]+" "+c[i+1])));
	                     front2 = front.getChildren().get(0);
	                     front2.setfather(front);
	                     front = front2;
	              }
	              else{
	                
	                    for(limbcount=0;limbcount<front.getChildren().size();limbcount++){      
	                      currenttreeword = front.getChildren().get(limbcount).getData();
	                           if(currenttreeword.equals(c[i]+" "+c[i+1])){     
	                                front = front.getChildren().get(limbcount);
	                                break;
	                           }
	                                   else if(limbcount == front.getChildren().size()-1){
	                                     front.getChildren().add(farm.createnode(c[i]+" "+c[i+1]));
	                                     front.getChildren().get(front.getChildren().size()-1).setfather(front);
	                                     front = front.getChildren().get(front.getChildren().size()-1);
	                                     limbcreatestart = true;
	                                     break;
	                                   }
	                    }
	              }
	            i+=2;
	          }
	} 	
}


public void danao9(int x,int y)
{
	
	
	//����������JAVA�˻���ս�������Ҫ���֣��������������ɵ�ʵ��������Ҫ���˹����ܵĴ��룬�������
	//���еĿ��ܣ������Ǹ������������danao9��Ҳ��ϣ�������������ܲ����ܹ���������������̵�ӡ��
	//����������������ƽ̨�İ����£�����Ժܺõ�����˹����ܵı�̣�ף����ˣ�
	//������Ҳ��һЩע�������Ҫ��������Ҫע�����������Ĵ�С����Ϊ����Ĵ�С�Ǹ����ģ����������ע�⵽������һ��
	//���˶�������Ĵ�С��ע�⣬�㻹��Ҫʹ�����ṩ�ı�׼�ļ�¼���飬����������У�����������Ҫ������ʵʱ��Ϣ
	//������Щ��Ϣ������Ժܺõ������Ӧ�Ĺ��ܣ���������һ��������ϣ����������������������
	int luozix=0;
	int luoziy=0;
	int jishu1=0;
	int jishu2=0;
	int heizifenshu=4;
	int baizifenshu=1;
	int counter1=0;
	int counter2=0;
	int xunhuanx=0;
	int xunhuany=0;
	int chuanrux=0;
	int chuanruy=0;
	int locationx=0;
	int locationy=0;
	int weizix=0;
	int weiziy=0;
	chuanrux=x/20;
	chuanruy=y/20;
	int jifen[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int dingweix[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int dingweiy[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int dingwei[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	for(xunhuanx=chuanrux-2;xunhuanx<chuanrux+3;xunhuanx++)
	   for(xunhuany=chuanruy-2;xunhuany<chuanruy+3;xunhuany++)
	   {
		   if(xunhuanx==chuanrux&&xunhuany==chuanruy)
		   {
			   dingwei[jishu1]=1000;
		   }
		   else
		   {
			   if(xunhuanx<0||xunhuanx>24||xunhuany<0||xunhuany>24)
			   {
				   dingwei[jishu1]=1000;
			   }
			   else
			   {
				   dingweix[jishu1]=xunhuanx;
				   dingweiy[jishu1]=xunhuany;
			   }
			   
		   }
		   jishu1++;
	   }
	for(jishu2=0;jishu2<25;jishu2++)
	{
		weizix=dingweix[jishu2];
		weiziy=dingweiy[jishu2];
		if(dingwei[jishu2]==1000)
		{
			continue;
		}
		else
		{ 
			if((bodyArray[weizix][weiziy]==1)||(bodyArray[weizix][weiziy]==-1))
	    	  {
	    		  jifen[jishu2]+=-100;
	    	  }
			else
			{
				
				
			}
		}
	}
	
	
	for(jishu2=0;jishu2<25;jishu2++)
	{
		weizix=dingweix[jishu2];
		weiziy=dingweiy[jishu2];
		if(jishu2!=13)
		{
			if(chuanrux==weizix||chuanruy==weiziy)
			{
				jifen[jishu2]+=heizifenshu;
			}
			else
			{
				if((chuanrux-weizix)==(chuanruy-weiziy))
				{
					jifen[jishu2]+=heizifenshu;
				}
				else
				{
					
				}
			}
		}
		if(dingwei[jishu2]==1000)
		{
			continue;
		}
		else
		{ 
			for(counter1=0;counter1<25;counter1++)
			{
				locationx=dingweix[counter1];
				locationy=dingweiy[counter1];
				if(locationx==weizix&&locationy==weiziy)
				{
					continue;
				}
				else
				{
					if(locationx==weizix||locationy==weiziy)
					{
						if(bodyArray[locationx][locationy]==1)
						{
							jifen[jishu2]+=heizifenshu;
						}
						else
						{
							if(bodyArray[locationx][locationy]==-1)
							{
								jifen[jishu2]+=baizifenshu;
							}
							else
							{
								
							}
						}	
					}
					else
					{
						if((locationx-weizix)==(locationy-weiziy))
						{
							if(bodyArray[locationx][locationy]==1)
								jifen[jishu2]+=heizifenshu;
							else
							{
								if(bodyArray[locationx][locationy]==-1)
								{
									jifen[jishu2]+=baizifenshu;
								}
								else
								{
									
								}
							}	
						}
						else
						{
							
						}
					}
				}
			}
		}
	}
	int zuida=0;
	for(counter2=0;counter2<25;counter2++)
	{
		if(jifen[counter2]>zuida)
		{
			zuida=jifen[counter2];
		}
		else
		{
			continue;
		}
	}
	
	for(counter2=0;counter2<25;counter2++)
	{
		if(jifen[counter2]==zuida)
		{
			luozix=dingweix[counter2]*20;
			luoziy=dingweiy[counter2]*20;
		}
		else
		{
			
		}
	}	
    //�������������е�һ���ǳ���Ҫ�Ĳ��֣���������ɶԶԷ��ľ��Ƶ�һ�������жϣ�����л�������������ʱδ����������ô����������صķ������˴��������������
	//������Ҫ�ж��Լ��ľ��ƣ�����Լ����ʺϵ������ľ��ƣ���ô������������,��ʱ������һ�����Ժ�����Ľ�
	for(counter1=0;counter1<25;counter1++)
	{
		dingwei[counter1]=0;
	}
	jishu1=0;
	for(xunhuanx=chuanrux-2;xunhuanx<chuanrux+3;xunhuanx++)
		   for(xunhuany=chuanruy-2;xunhuany<chuanruy+3;xunhuany++)
		   {
				   if(xunhuanx<0||xunhuanx>24||xunhuany<0||xunhuany>24)
				   {
					   dingwei[jishu1]=1000;
				   }
				   else
				   {
					   dingweix[jishu1]=xunhuanx;
					   dingweiy[jishu1]=xunhuany;
				   }
				   
			   
			   jishu1++;
		   }


	//The main process which the situation will be judged
				if(dingwei[8]==0&&dingwei[12]==0&&dingwei[16]==0)
				{
					
					int panduan1=bodyArray[dingweix[8]][dingweiy[8]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[16]][dingweiy[16]];
					if(panduan1==3)
					{
						if(dingwei[4]==0&&dingwei[20]==0)
						{
							if(bodyArray[dingweix[4]][dingweiy[4]]==0&&bodyArray[dingwei[20]][dingweiy[20]]==0)
							{
								luozix=dingweix[4]*20;
								luoziy=dingweiy[4]*20;
							}
				
						}	
					}
				}
				if(dingwei[18]==0&&dingwei[12]==0&&dingwei[6]==0)
				{
					
					int panduan1=bodyArray[dingweix[18]][dingweiy[18]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[6]][dingweiy[6]];
					if(panduan1==3)
					{
						if(dingwei[0]==0&&dingwei[24]==0)
						{
							if(bodyArray[dingweix[0]][dingweiy[0]]==0&&bodyArray[dingwei[24]][dingweiy[24]]==0)
							{
								luozix=dingweix[24]*20;
								luoziy=dingweiy[24]*20;
							}
				
						}	
					}
				}
				if(dingwei[7]==0&&dingwei[12]==0&&dingwei[17]==0)
				{
					
					int panduan1=bodyArray[dingweix[7]][dingweiy[7]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[17]][dingweiy[17]];
					if(panduan1==3)
					{
						if(dingwei[2]==0&&dingwei[22]==0)
						{
							if(bodyArray[dingweix[2]][dingweiy[2]]==0&&bodyArray[dingwei[22]][dingweiy[22]]==0)
							{
								luozix=dingweix[2]*20;
								luoziy=dingweiy[2]*20;
							}
				
						}	
					}
				}
				if(dingwei[11]==0&&dingwei[12]==0&&dingwei[13]==0)
				{
					
					int panduan1=bodyArray[dingweix[11]][dingweiy[11]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[13]][dingweiy[13]];
					if(panduan1==3)
					{
						if(dingwei[10]==0&&dingwei[14]==0)
						{
							if(bodyArray[dingweix[10]][dingweiy[10]]==0&&bodyArray[dingwei[14]][dingweiy[14]]==0)
							{
								luozix=dingweix[14]*20;
								luoziy=dingweiy[14]*20;
							}
							
				
						}	
					}
				}				
				if(dingwei[2]==0&&dingwei[12]==0&&dingwei[7]==0)
				{
					int panduan1=bodyArray[dingweix[2]][dingweiy[2]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[7]][dingweiy[7]];
					if(panduan1==3)
					{
						if(chuanrux-3>-1&&dingwei[17]==0)
						{
							if(bodyArray[dingweix[17]][dingweiy[17]]==0&&bodyArray[dingweix[2]-1][dingweiy[2]]==0)
							{
								luozix=dingweix[17]*20;
								luoziy=dingweiy[17]*20;
							}
							else
							{
								if(bodyArray[dingweix[2]-1][dingweiy[2]]==1&&bodyArray[dingweix[17]][dingweiy[17]]==0)
								{
									luozix=dingweix[17]*20;
									luoziy=dingweiy[17]*20;
								}
							}
						}
					}
				}		
				if(dingwei[22]==0&&dingwei[12]==0&&dingwei[17]==0)
				{
					int panduan1=bodyArray[dingweix[22]][dingweiy[22]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[17]][dingweiy[17]];
					if(panduan1==3)
					{
						if(chuanrux+3>-1&&dingwei[7]==0)
						{
							if(bodyArray[dingweix[7]][dingweiy[7]]==0&&bodyArray[dingweix[22]+1][dingweiy[22]]==0)
							{
								luozix=dingweix[7]*20;
								luoziy=dingweiy[7]*20;
							}
							else
							{
								if(bodyArray[dingweix[22]+1][dingweiy[22]]==1&&bodyArray[dingweix[7]][dingweiy[7]]==0)
								{
									luozix=dingweix[7]*20;
									luoziy=dingweiy[7]*20;
								}
							}
						}
					}
				}		
				if(dingwei[12]==0&&dingwei[13]==0&&dingwei[14]==0)
				{
					int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[13]][dingweiy[13]]+bodyArray[dingweix[14]][dingweiy[14]];
					if(panduan1==3)
					{
						if(chuanruy+3<25&&dingwei[11]==0)
						{
							if(bodyArray[dingweix[11]][dingweiy[11]]==0&&bodyArray[dingweix[14]][dingweiy[14]]+1==0)
							{
								luozix=dingweix[11]*20;
								luoziy=dingweiy[11]*20;
							}
							else
							{
								if(bodyArray[dingweix[14]][dingweiy[14]+1]==1&&bodyArray[dingweix[11]][dingweiy[11]]==0)
								{
									luozix=dingweix[11]*20;
									luoziy=dingweiy[11]*20;
								}
							}
						}
					}
				}	
				if(dingwei[10]==0&&dingwei[12]==0&&dingwei[11]==0)
				{
					int panduan1=bodyArray[dingweix[10]][dingweiy[10]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[11]][dingweiy[11]];
					if(panduan1==3)
					{
						if(chuanruy-3>-1&&dingwei[13]==0)
						{
							if(bodyArray[dingweix[13]][dingweiy[13]]==0&&bodyArray[dingweix[10]][dingweiy[10]-1]==0)
							{
								luozix=dingweix[13]*20;
								luoziy=dingweiy[13]*20;
							}
							else
							{
								if(bodyArray[dingweix[10]][dingweiy[10]-1]==1&&bodyArray[dingweix[13]][dingweiy[13]]==0)
								{
									luozix=dingweix[13]*20;
									luoziy=dingweiy[13]*20;
								}
							}
						}
					}
				}	
				if(dingwei[4]==0&&dingwei[8]==0&&dingwei[12]==0)
				{
					int panduan1=bodyArray[dingweix[4]][dingweiy[4]]+bodyArray[dingweix[8]][dingweiy[8]]+bodyArray[dingweix[12]][dingweiy[12]];
					if(panduan1==3)
					{
						if(chuanruy+3<25&&chuanrux-3>-1&&dingwei[16]==0)
						{
							if(bodyArray[dingweix[16]][dingweiy[16]]==0&&bodyArray[dingweix[4]-1][dingweiy[4]+1]==0)
							{
								luozix=dingweix[16]*20;
								luoziy=dingweiy[16]*20;
							}
							else
							{
								if(bodyArray[dingweix[4]-1][dingweiy[4]+1]==1&&bodyArray[dingweix[16]][dingweiy[16]]==0)
								{
									luozix=dingweix[16]*20;
									luoziy=dingweiy[16]*20;
								}
							}
						}
					}
				}		
				if(dingwei[16]==0&&dingwei[12]==0&&dingwei[20]==0)
				{
					int panduan1=bodyArray[dingweix[16]][dingweiy[16]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[20]][dingweiy[20]];
					if(panduan1==3)
					{
						if(chuanrux+3<25&&chuanruy-3>-1&&dingwei[8]==0)
						{
							if(bodyArray[dingweix[8]][dingweiy[8]]==0&&bodyArray[dingweix[20]+1][dingweiy[20]-1]==0)
							{
								luozix=dingweix[8]*20;
								luoziy=dingweiy[8]*20;
							}
							else
							{
								if(bodyArray[dingweix[20]+1][dingweiy[20]-1]==1&&bodyArray[dingweix[8]][dingweiy[8]]==0)
								{
									luozix=dingweix[8]*20;
									luoziy=dingweiy[8]*20;
								}
							}
						}
					}
				}		
				if(dingwei[18]==0&&dingwei[12]==0&&dingwei[24]==0)
				{
					int panduan1=bodyArray[dingweix[18]][dingweiy[18]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[24]][dingweiy[24]];
					if(panduan1==3)
					{
						if(chuanrux+3<25&&chuanruy+3<25&&dingwei[6]==0)
						{
							if(bodyArray[dingweix[6]][dingweiy[6]]==0&&bodyArray[dingweix[24]+1][dingweiy[24]+1]==0)
							{
								luozix=dingweix[6]*20;
								luoziy=dingweiy[6]*20;
							}
							else
							{
								if(bodyArray[dingweix[24]+1][dingweiy[24]+1]==1&&bodyArray[dingweix[6]][dingweiy[6]]==0)
								{
									luozix=dingweix[6]*20;
									luoziy=dingweiy[6]*20;
								}
							}
						}
					}
				}		
				if(dingwei[0]==0&&dingwei[12]==0&&dingwei[6]==0)
				{
					int panduan1=bodyArray[dingweix[0]][dingweiy[0]]+bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[6]][dingweiy[6]];
					if(panduan1==3)
					{
						if(chuanrux-3>-1&&chuanruy-3>-1&&dingwei[18]==0)
						{
							if(bodyArray[dingweix[18]][dingweiy[18]]==0&&bodyArray[dingweix[0]-1][dingweiy[0]-1]==0)
							{
								luozix=dingweix[18]*20;
								luoziy=dingweiy[18]*20;
							}
							else
							{
								if(bodyArray[dingweix[0]-1][dingweiy[0]-1]==1&&bodyArray[dingweix[18]][dingweiy[18]]==0)
								{
									luozix=dingweix[18]*20;
									luoziy=dingweiy[18]*20;
								}
							}
						}
					}
				}		
			
				
				
				// special guards,��������������ķ��أ�����Ժ������һ����չ��Ȼ����Ҫ���Ƕ��ڸ��յ�������з���
				if(dingwei[10]==0&&dingwei[12]==0&&dingwei[13]==0&&dingwei[11]==0)
				{
					if(chuanruy-4>-1)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[10]][dingweiy[10]]+bodyArray[dingweix[10]][dingweiy[10]-1];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[11]][dingweiy[11]]==0&&bodyArray[dingweix[13]][dingweiy[13]]==0&&bodyArray[dingweix[10]][dingweiy[10]-2]==0)
							{
							    luozix=dingweix[11]*20;
							    luoziy=dingweiy[11]*20;
							}
						}
						
					}
					
				}		
				
				
				if(dingwei[14]==0&&dingwei[12]==0&&dingwei[13]==0&&dingwei[11]==0)
				{
					if(chuanruy+4<25)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[14]][dingweiy[14]]+bodyArray[dingweix[14]][dingweiy[14]+1];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[13]][dingweiy[13]]==0&&bodyArray[dingweix[11]][dingweiy[11]]==0&&bodyArray[dingweix[14]][dingweiy[14]+2]==0)
							{
							    luozix=dingweix[13]*20;
							    luoziy=dingweiy[13]*20;
							}
						}
						
					}
					
				}	
				
				if(dingwei[7]==0&&dingwei[12]==0&&dingwei[17]==0&&dingwei[22]==0)
				{
					if(chuanrux+4<25)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[22]][dingweiy[22]]+bodyArray[dingweix[22]+1][dingweiy[22]];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[7]][dingweiy[7]]==0&&bodyArray[dingweix[17]][dingweiy[17]]==0&&bodyArray[dingweix[22]+2][dingweiy[22]]==0)
							{
							    luozix=dingweix[17]*20;
							    luoziy=dingweiy[17]*20;
							}
						}
						
					}
					
				}	
				
				if(dingwei[7]==0&&dingwei[12]==0&&dingwei[17]==0&&dingwei[2]==0)
				{
					if(chuanrux-4>-1)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[2]][dingweiy[2]]+bodyArray[dingweix[2]-1][dingweiy[2]];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[7]][dingweiy[7]]==0&&bodyArray[dingweix[17]][dingweiy[17]]==0&&bodyArray[dingweix[2]-2][dingweiy[2]]==0)
							{
							    luozix=dingweix[7]*20;
							    luoziy=dingweiy[7]*20;
							}
						}
						
					}
					
				}	
				
				if(dingwei[8]==0&&dingwei[12]==0&&dingwei[16]==0&&dingwei[20]==0)
				{
					if(chuanrux+4<25&&chuanruy-4>-1)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[20]][dingweiy[20]]+bodyArray[dingweix[20]+1][dingweiy[20]-1];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[16]][dingweiy[16]]==0&&bodyArray[dingweix[8]][dingweiy[8]]==0&&bodyArray[dingweix[20]+2][dingweiy[20]-2]==0)
							{
							    luozix=dingweix[16]*20;
							    luoziy=dingweiy[16]*20;
							}
						}
						
					}
					
				}	
				
				if(dingwei[4]==0&&dingwei[12]==0&&dingwei[8]==0&&dingwei[16]==0)
				{
					if(chuanrux-4>-1&&chuanruy+4<25)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[4]][dingweiy[4]]+bodyArray[dingweix[4]-1][dingweiy[4]+1];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[8]][dingweiy[8]]==0&&bodyArray[dingweix[16]][dingweiy[16]]==0&&bodyArray[dingweix[4]-2][dingweiy[4]+2]==0)
							{
							    luozix=dingweix[8]*20;
							    luoziy=dingweiy[8]*20;
							}
						}
						
					}
					
				}	
			
				if(dingwei[6]==0&&dingwei[12]==0&&dingwei[18]==0&&dingwei[24]==0)
				{
					if(chuanrux+4<25&&chuanruy+4<25)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[24]][dingweiy[24]]+bodyArray[dingweix[24]+1][dingweiy[24]+1];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[18]][dingweiy[18]]==0&&bodyArray[dingweix[6]][dingweiy[6]]==0&&bodyArray[dingweix[24]+2][dingweiy[24]+2]==0)
							{
							    luozix=dingweix[18]*20;
							    luoziy=dingweiy[18]*20;
							}
						}
						
					}
					
				}	
				
				if(dingwei[6]==0&&dingwei[12]==0&&dingwei[18]==0&&dingwei[0]==0)
				{
					if(chuanrux-4>-1&&chuanruy-4>-1)
					{
						int panduan1=bodyArray[dingweix[12]][dingweiy[12]]+bodyArray[dingweix[0]][dingweiy[0]]+bodyArray[dingweix[0]-1][dingweiy[0]-1];
						if(panduan1==3)
						{
							if(bodyArray[dingweix[18]][dingweiy[18]]==0&&bodyArray[dingweix[6]][dingweiy[6]]==0&&bodyArray[dingweix[0]-2][dingweiy[0]-2]==0)
							{
							    luozix=dingweix[6]*20;
							    luoziy=dingweiy[6]*20;
							}
						}
						
					}
					
				}
				

				
  setDown2(luozix,luoziy);
}




public void mousePressed(MouseEvent e) { 
} 

public void mouseClicked(MouseEvent e) { 
int x1, y1; 
x1 = e.getX(); 
y1 = e.getY(); 
if (e.getX() < 20 || e.getX() > 480 || e.getY() < 20 || e.getY() > 480) { 
return; 
} 

if (x1 % 20 > 10) { 
x1 += 20; 
} 

if (y1 % 20 > 10) { 
y1 += 20; 
} 

x1 = x1 / 20 * 20; 
y1 = y1 / 20 * 20; 


//BufferedWriter   out=new   BufferedWriter( new   FileWriter(file,true));
//���ӵ���ɫ���ж�
occupied = false;
//ϵͳ�ػ�
	if(x1/20==1&&y1/20==1){
		this.gameover = true;
		Graphics g = getGraphics(); 
        this.paint(g);
        this.gameInit();
        if(youfirst){
        new writepos().writeloc(true);
        }
        if(!youfirst){
        new writepos().writeloc(false);	
        }
        youfirst = true;
        findtrick = true;
        this.teacher = parent;
        this.teacher2 = parent2;
	}
	
	if(x1/20==24&&y1/20==1){
		youfirst = false;
		this.setDown2(12*20, 13*20);
	}

	if(x1/20!=1&&y1/20!=1&&x1/20!=24&&y1/20!=1){
	//begin to set down	
    // here we have two different modes, called the mefirst mode and the youfirst mode
	//������ģʽ
		if(youfirst){
			this.setDown(x1, y1);
			
			if(findtrick){
				if(this.teacher == parent){
					this.teachsplit = this.teacher.getData().split(" ");
			    	this.teachx = Integer.parseInt(teachsplit[0]);
			    	this.teachy = Integer.parseInt(teachsplit[1]);
			        this.randompoint = new Random().nextInt(this.teacher.getChildren().size()-1);
			    	this.teachsplit = this.teacher.getChildren().get(randompoint).getData().split(" ");	
			    	this.setDown2(Integer.parseInt(teachsplit[0])*20+20,Integer.parseInt(teachsplit[1])*20+20);	
			    	this.teacher = this.teacher.getChildren().get(randompoint);
				}
				else{
			        biaozhun = this.teacher.getChildren().size();
				    for(jishu = 0;jishu<this.teacher.getChildren().size();jishu++){
				    	this.teachsplit = this.teacher.getChildren().get(jishu).getData().split(" ");
				    	this.teachx = Integer.parseInt(teachsplit[0]);
				    	this.teachy = Integer.parseInt(teachsplit[1]);
				    	if(this.teachx==x1/20&&this.teachy==y1/20){	
				    	if(this.teacher.getChildren().get(jishu).getChildren().size()<=1){
				    		continue;
				    	}
				        this.randompoint = new Random().nextInt(this.teacher.getChildren().get(jishu).getChildren().size()-1);
				    	this.teachsplit = this.teacher.getChildren().get(jishu).getChildren().get(randompoint).getData().split(" ");	
				    	this.setDown2(Integer.parseInt(teachsplit[0])*20,Integer.parseInt(teachsplit[1])*20);	
				    	occupied = true;
				    	this.teacher = this.teacher.getChildren().get(jishu).getChildren().get(randompoint);
				    	}
				    }
				    if(jishu==biaozhun){
				    	findtrick = false;
				    }
				}
			}
			if(!findtrick&&!occupied){
				System.out.println("������������");
				    this.danao9(x1,y1);
			}
		
	}
	//��������ģʽ 
		if(!youfirst){
		    
           this.setDown(x1, y1);
			
			if(findtrick){

			        biaozhun = this.teacher2.getChildren().size();
				    for(jishu = 0;jishu<this.teacher2.getChildren().size();jishu++){
				    	this.teachsplit = this.teacher2.getChildren().get(jishu).getData().split(" ");
				    	this.teachx = Integer.parseInt(teachsplit[0]);
				    	this.teachy = Integer.parseInt(teachsplit[1]);
				    	if(this.teachx==x1/20&&this.teachy==y1/20){	
				    	if(this.teacher2.getChildren().get(jishu).getChildren().size()<=1){
					    		continue;
					    }
				        this.randompoint = new Random().nextInt(this.teacher2.getChildren().get(jishu).getChildren().size()-1);
				    	this.teachsplit = this.teacher2.getChildren().get(jishu).getChildren().get(randompoint).getData().split(" ");	
				    	this.setDown2(Integer.parseInt(teachsplit[0])*20,Integer.parseInt(teachsplit[1])*20);
				    	occupied = true;
				    	this.teacher2 = this.teacher2.getChildren().get(jishu).getChildren().get(randompoint);
					    }
				    }
				    if(jishu==biaozhun){
				    	findtrick = false;
				    }
			}
			if(!findtrick&&!occupied){
				System.out.println("������������");
			    this.danao9(x1,y1);
			}
		
	}
		
	}

	
} 



public void mouseEntered(MouseEvent e) { 
} 

public void mouseExited(MouseEvent e) { 
} 

public void mouseReleased(MouseEvent e) { 
	
} 

public void mouseDragged(MouseEvent e) { 
} 

public void mouseMoved(MouseEvent e) { 
} 


public void paint(Graphics g) { 
g.setColor(Color.lightGray); 
g.fill3DRect(10, 10, 480, 480, true); 
g.setColor(Color.black); 
for (int i = 1; i < 25; i++) { 
g.drawLine(20, 20 * i, 480, 20 * i); 
g.drawLine(20 * i, 20, 20 * i, 480); 
} 

// the point to set for position correct
g = getGraphics(); 
g.setColor(Color.BLUE); 
g.fillOval(240 - 10, 260 - 10, 20, 20); 


g.setColor(Color.RED); 
g.fillOval(20- 10, 20 - 10, 20, 20); 

g.setColor(Color.YELLOW); 
g.fillOval(20*24- 10, 20 - 10, 20, 20); 
} 

public void setDown(int x, int y) // ���� ,����
{ 
if (bodyArray[x / 20][y / 20] != 0) { 
return; 
} 
Graphics g = getGraphics(); 
g.setColor(Color.black); 
g.fillOval(x - 10, y - 10, 20, 20); 

bodyArray[x / 20][y / 20] =1; 
// write in the file
if(youfirst){
new writepos().writeloc(x/20, y/20,true);
}
if(!youfirst){
new writepos().writeloc(x/20, y/20,false);	
}

} 

public void setDown2(int x2, int y2) // ���� ������
{ 
if (bodyArray[x2 / 20][y2 / 20] != 0) { 
return; 
} 
Graphics g = getGraphics(); 
g.setColor(Color.white); 
g.fillOval(x2 - 10, y2 - 10, 20, 20); 

bodyArray[x2 / 20][y2 / 20] =-1; 
// write in the file
if(youfirst){
new writepos().writeloc(x2/20, y2/20,true);
}
if(!youfirst){
new writepos().writeloc(x2/20, y2/20,false);	
}

} 
public void gameInit() // ��Ϸ��ʼ��ʼ�� 
{ 
	
for (int i = 0; i < 25; i++) { 
for (int j = 0; j < 25; j++) { 
bodyArray[i][j] = 0; 
} 
} 





} 

}



class writepos
{
	// д�����ӵ�����
   File file;
   BufferedWriter out; 
   boolean openedfile = false;

	public void writeloc(boolean youorme)
	{
		try{
	   if(youorme)
	  	 this.file=new   File("D:/Program Files/Smith/Wuzichip/mefirst.txt");
	   else
		 this.file = new   File("D:/Program Files/Smith/Wuzichip/youfirst.txt");  
	   
	     this.out=new   BufferedWriter( new   FileWriter(file,true)); 
	     this.openedfile = true;
	        out.newLine();
		    out.close(); 
           out=null; 
           file=null; 
		}catch (IOException e) { 
			System.out.print("file write failure, sorry!");
		} 
	}   
   
	public void writeloc(int x,int y,boolean youorme)
	{
		try{
			   if(youorme)
				  	 this.file=new   File("D:/Program Files/Smith/Wuzichip/mefirst.txt");
				   else
					 this.file = new   File("D:/Program Files/Smith/Wuzichip/youfirst.txt");  
			   
	     this.out=new   BufferedWriter( new   FileWriter(file,true)); 
	     this.openedfile = true;
	        out.append(x+","+y+",");
		    out.close(); 
            out=null; 
            file=null; 
		}catch (IOException e) { 
			System.out.print("file write failure, sorry!");
		} 
	}
}