package flowerweeltwo;

public class Cubicweel {

	/**
	 * @param args
	 */
	private int []front = new int[9]
			      ,back = new int[9]
			      ,left= new int[9]
			      ,right= new int[9]
			      ,top= new int[9]
			      ,bottom= new int[9];
	
	

	public void getsituations()
	{
		int i = 0;
		System.out.println("here you need to teel me the order I ought to know:");
        int []front = {3,2,6,3,1,5,3,3,2};    // here we make the rule that the 1 correspond to front
        int []back =  {1,1,3,5,2,2,5,4,4};     // 2 correspond to back
        int []left =  {6,4,4,4,3,1,3,3,1};     // 3 correspond to left
        int []right = {5,1,5,6,5,2,4,2,6};    // 4 correspond to right
        int []top =   {2,6,4,1,6,5,2,6,2};      // 5 correspond to top
        int []bottom ={6,6,5,4,4,3,1,5,1};   // 6 correspond to bottom
		for(i=0;i<9;i++)
		{
			this.front[i]=front[i];
			this.back[i]=back[i];
			this.left[i]=left[i];
			this.right[i]=right[i];
            this.top[i]=top[i];
            this.bottom[i]=bottom[i];
		}
		System.out.println("Thank you, I have got the situations!");
	}
	
	public void rotatefrontside(int j)
	{
		                                                // here we make the rule that the rotate will be single-track,and will be left-handed
		                                                // j correspond to the time you want it to rotate
		int k = 0;                                      
		int i = 0; 
		int w = 0;
		int []map = {3,6,9,2,5,8,1,4,7};
		int []mapsecond = {9,8,7,3,6,9,1,2,3,7,4,1};
		int []linshi = {0,0,0};
		for(k=0;k<j;k++){			
		int []jiaohuan = {0,0,0,0,0,0,0,0,0};	
		for(w=0;w<9;w++)
		{
			jiaohuan[w] = this.front[w];
		}
		for(i=0;i<9;i++)
		{
			this.front[i] = jiaohuan[map[i]-1];
		}
		for(i=0;i<3;i++)
		{
			linshi[i] = this.top[mapsecond[i]-1];
			this.top[mapsecond[i]-1] = this.right[mapsecond[i+9]-1];
			this.right[mapsecond[i+9]-1] = this.bottom[mapsecond[i+6]-1];
			this.bottom[mapsecond[i+6]-1] = this.left[mapsecond[i+3]-1];
			this.left[mapsecond[i+3]-1] = linshi[i];
		
		}
		}
		
	
		System.out.printf("ǰ����ʱ��ת%dȦ\r\n",j);
		printtmp();
	
	}
	public void rotatebackside(int j)
	{
		int k = 0;                                      
		int i = 0; 
		int w = 0;
		int []map = {3,6,9,2,5,8,1,4,7};
		int []mapsecond = {1,2,3,3,6,9,9,8,7,7,4,1};
		int []linshi = {0,0,0};
		for(k=0;k<j;k++){
			int []jiaohuan = {0,0,0,0,0,0,0,0,0};	
			for(w=0;w<9;w++)
			{
				jiaohuan[w] = this.back[w];
			}
			for(i=0;i<9;i++)
			{
				this.back[i] = jiaohuan[map[i]-1];
			}
		for(i=0;i<3;i++)
		{
			linshi[i] = this.top[mapsecond[i]-1];
			this.top[mapsecond[i]-1] = this.left[mapsecond[i+9]-1];
			this.left[mapsecond[i+9]-1] = this.bottom[mapsecond[i+6]-1];
			this.bottom[mapsecond[i+6]-1] = this.right[mapsecond[i+3]-1];
			this.right[mapsecond[i+3]-1] = linshi[i];
		
		}
		}
		
		System.out.printf("������ʱ��ת%dȦ\r\n",j);
		printtmp();
	
	}
	public void rotateleftside(int j)
	{
		int k = 0;                                      
		int i = 0; 
		int w = 0;
		int []map = {3,6,9,2,5,8,1,4,7};
		int []mapsecond = {7,4,1,3,6,9,7,4,1,7,4,1};
		int []linshi = {0,0,0};
		for(k=0;k<j;k++){
			int []jiaohuan = {0,0,0,0,0,0,0,0,0};	
			for(w=0;w<9;w++)
			{
				jiaohuan[w] = this.left[w];
			}
			for(i=0;i<9;i++)
			{
				this.left[i] = jiaohuan[map[i]-1];
			}
		for(i=0;i<3;i++)
		{
			linshi[i] = this.top[mapsecond[i]-1];
			this.top[mapsecond[i]-1] = this.front[mapsecond[i+9]-1];
			this.front[mapsecond[i+9]-1] = this.bottom[mapsecond[i+6]-1];
			this.bottom[mapsecond[i+6]-1] = this.back[mapsecond[i+3]-1];
			this.back[mapsecond[i+3]-1] = linshi[i];
		
		}
		}
		
		System.out.printf("������ʱ��ת%dȦ\r\n",j);
		printtmp();
	}
	public void rotaterightside(int j)
	{
		int k = 0;                                      
		int i = 0; 
		int w = 0;
		int []map = {3,6,9,2,5,8,1,4,7};
		int []mapsecond = {3,6,9,3,6,9,3,6,9,7,4,1};
		int []linshi = {0,0,0};
		for(k=0;k<j;k++){
			int []jiaohuan = {0,0,0,0,0,0,0,0,0};	
			for(w=0;w<9;w++)
			{
				jiaohuan[w] = this.right[w];
			}
			for(i=0;i<9;i++)
			{
				this.right[i] = jiaohuan[map[i]-1];
			}
		for(i=0;i<3;i++)
		{
			linshi[i] = this.top[mapsecond[i]-1];
			this.top[mapsecond[i]-1] = this.back[mapsecond[i+9]-1];
			this.back[mapsecond[i+9]-1] = this.bottom[mapsecond[i+6]-1];
			this.bottom[mapsecond[i+6]-1] = this.front[mapsecond[i+3]-1];
			this.front[mapsecond[i+3]-1] = linshi[i];
		
		}
		}
	
		System.out.printf("������ʱ��ת%dȦ\r\n",j);
		printtmp();
	
	}
	public void rotatetopside(int j)
	{
		int k = 0;                                      
		int i = 0;
		int w = 0;
		int []map = {3,6,9,2,5,8,1,4,7};
		int []mapsecond = {1,2,3,1,2,3,1,2,3,1,2,3};
		int []linshi = {0,0,0};
		for(k=0;k<j;k++){
			int []jiaohuan = {0,0,0,0,0,0,0,0,0};	
			for(w=0;w<9;w++)
			{
				jiaohuan[w] = this.top[w];
			}
			for(i=0;i<9;i++)
			{
				this.top[i] = jiaohuan[map[i]-1];
			}
		for(i=0;i<3;i++)
		{
			linshi[i] = this.back[mapsecond[i]-1];
			this.back[mapsecond[i]-1] = this.right[mapsecond[i+9]-1];
			this.right[mapsecond[i+9]-1] = this.front[mapsecond[i+6]-1];
			this.front[mapsecond[i+6]-1] = this.left[mapsecond[i+3]-1];
			this.left[mapsecond[i+3]-1] = linshi[i];
		
		}
		}
	
		System.out.printf("������ʱ��ת%dȦ\r\n",j);
		printtmp();
	
	}
	public void rotatebottomside(int j)
	{
		int k = 0;                                      
		int i = 0; 
		int w = 0;
		int []map = {3,6,9,2,5,8,1,4,7};
		int []mapsecond = {9,8,7,9,8,7,9,8,7,9,8,7};
		int []linshi = {0,0,0};
		for(k=0;k<j;k++){
			int []jiaohuan = {0,0,0,0,0,0,0,0,0};	
			for(w=0;w<9;w++)
			{
				jiaohuan[w] = this.bottom[w];
			}
			for(i=0;i<9;i++)
			{
				this.bottom[i] = jiaohuan[map[i]-1];
			}
		for(i=0;i<3;i++)
		{
			linshi[i] = this.front[mapsecond[i]-1];
			this.front[mapsecond[i]-1] = this.right[mapsecond[i+9]-1];
			this.right[mapsecond[i+9]-1] = this.back[mapsecond[i+6]-1];
			this.back[mapsecond[i+6]-1] = this.left[mapsecond[i+3]-1];
			this.left[mapsecond[i+3]-1] = linshi[i];
		
		}
		}
	
		System.out.printf("������ʱ��ת%dȦ\r\n",j);
		printtmp();
	
	}
	
	
	public void printtmp()
	{
		int i = 0;
		int j = 0;
		System.out.print("ǰ�棺\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.front[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
	}
	
	public void printresult()
	{
		int i = 0;
		int j = 0;
		System.out.print("ǰ�棺\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.front[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("���棺\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.back[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("���棺��\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.left[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("���棺��\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.right[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("���棺\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.top[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("���棺\r\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(this.bottom[j+i*3]+"   ");
			}
			System.out.print("\n");
		}
	}
	
	
	public int ruler()
	{
		int result = 0;
		int i = 0;
		for(i=0;i<9;i++)
		{
			
			if(this.front[i]==this.front[4])
			{
				result++;
			}
			if(this.back[i]==this.back[4])
			{
				result++;
			}
			if(this.left[i]==this.left[4])
			{
				result++;
			}
			if(this.right[i]==this.right[4])
			{
				result++;
			}
			if(this.top[i]==this.top[4])
			{
				result++;
			}
			if(this.bottom[i]==this.bottom[4])
			{
				result++;
			}
			                             // for extra tests
		
			
			
		}
		return result;
	}
	
	
	public void toolrotateforenginetest(int i,int j)
	{
		if(i==0)
            this.rotatefrontside(j);
    	    if(i==1)
    	    this.rotateleftside(j);
    	    if(i==2)
    	    this.rotatebackside(j);
    	    if(i==3)
    	    this.rotaterightside(j);
	
	}
	
	
	public void enginenewtest()
	{   
		 //  ƴʮ��ģ��
	   while(!(this.bottom[1]==this.bottom[4]&&this.front[7]==this.front[4]&&this.bottom

	[3]==this.bottom[4]&&this.left[7]==this.left[4]&&this.bottom[5]==this.bottom[4]

	&&this.right[7]==this.right[4]&&this.bottom[7]==this.bottom[4]&&this.back[7]

	==this.back[4])){

   
		   int []map_of_bottom = {1,3,7,5};
		   int []map_of_top = {7,3,1,5};
	        // �������Ϊ����ɫλ�ò���
		   int n = 0;
		   int i = 0;
		for(i=0;i<4;i++){
		    int []forthissur = new int[9];
		    int []forthissursecond = new int[9];
		    int []forthissurthird = new int[9];
		    if(i==0)
		    forthissur = this.front;
		    if(i==1)
		    forthissur = this.left;
		    if(i==2)
		    forthissur = this.back;
		    if(i==3)
		    forthissur = this.right;
		    
		    if((i+n)%4==0)
			forthissursecond = this.front;
		    if((i+n)%4==1)
		    forthissursecond = this.left;
		    if((i+n)%4==2)
		    forthissursecond = this.back;
		    if((i+n)%4==3)
		    forthissursecond = this.right;
			    
			 if((i+n+1)%4==0)
	 		 forthissurthird = this.front;
			 if((i+n+1)%4==1)
	   		 forthissurthird = this.left;
	     	 if((i+n+1)%4==2)
		     forthissurthird = this.back;
			 if((i+n+1)%4==3)
		     forthissurthird = this.right;
		    
		      //�������Ϊ����ɫλ�ò���
	        if(this.bottom[map_of_bottom[i]]==this.bottom[4]&&forthissur[7]!=forthissur[4])
	          {
	        	    this.toolrotateforenginetest(i,2);		        	   
	          }
	    
	    
	        
	        // ��������ڶ�������
	        if(this.top[map_of_top[i]]==this.bottom[4])
	        {
	        	n=0;
	        	while(forthissursecond[4]!=forthissursecond[1])
	        	{
	        		this.rotatetopside(3);
	        		n++;
	        		    if((i+n)%4==0)
	        			forthissursecond = this.front;
	        		    if((i+n)%4==1)
	        		    forthissursecond = this.left;
	        		    if((i+n)%4==2)
	        		    forthissursecond = this.back;
	        		    if((i+n)%4==3)
	        		    forthissursecond = this.right;
	        		    
	        		    //System.out.println("I'm here the first!");

	        	}
	        	this.toolrotateforenginetest((i+n)%4,2);	
	        }
	        
	        
	        //���������ǵ���ɫ�����
	        if(forthissur[1]==this.bottom[4])
	        {
	        	n=0;
	        	while(forthissurthird[4]!=this.top[map_of_top[(i+n)%4]])
	        	{
	        		this.rotatetopside(3);
	        		n++;
	        		    if((i+n+1)%4==0)
	        			forthissurthird = this.front;
	        		    if((i+n+1)%4==1)
	        		    forthissurthird = this.left;
	        		    if((i+n+1)%4==2)
	        		    forthissurthird = this.back;
	        		    if((i+n+1)%4==3)
	        		    forthissurthird = this.right;
	        		    
	        		    //System.out.println("I'm here the second!");
    
	        	}
	        	this.toolrotateforenginetest((i+n)%4,1);
	        	this.toolrotateforenginetest((i+n+1)%4,3);
	        	this.toolrotateforenginetest((i+n)%4,3);
	        }
	        
	        //���������ǵ���ɫ�����
	        if(forthissur[3]==this.bottom[4])
	        {
	        	this.toolrotateforenginetest((i+1)%4,1);
	        	this.rotatetopside(3);
	        	this.toolrotateforenginetest((i+1)%4,3);
	        }
	        
	        //���������ǵ���ɫ�����
	        if(forthissur[5]==this.bottom[4])
	        {
	        	this.toolrotateforenginetest((i+3)%4, 3);
	        	this.rotatetopside(3);
	        	this.toolrotateforenginetest((i+3)%4, 1);
	        }
	        
	        //��������ǵ���ɫ�����
	        if(forthissur[7]==this.bottom[4])
	        {
	        	this.toolrotateforenginetest(i, 3);
	        	this.toolrotateforenginetest((i+1)%4, 1);
	        	this.rotatetopside(3);
	        	this.toolrotateforenginetest((i+1)%4, 3);
	        	this.toolrotateforenginetest(i, 1);
	        }

	      }
      
	   	   
	   }
	     

	}
	
	
	
	public void engineforzdy()
	{
		// ƴ���ǹ���ģ��                                         //֪������ȫ����λ
		while(!((this.bottom[0]==this.bottom[4]&&this.front[6]==this.front[4]&&this.left[8]==this.left[4])&&(this.bottom[2]==this.bottom[4]&&this.front[8]==this.front[4]&&this.right[6]==this.right[4])
			&&(this.bottom[6]==this.bottom[4]&&this.left[6]==this.left[4]&&this.back[8]==this.back[4])
			&&(this.bottom[8]==this.bottom[4]&&this.back[6]==this.back[4]&&this.right[8]==this.right[4])))
		{
            int []map_of_top = {6,0,2,8};  			
		    int []map_of_bottom = {0,6,8,2};
		    int n = 0;
		    int i = 0;
		    for(i=0;i<4;i++)
		    {
		    	int []forthissur = new int[9];
			    int []forthissursecond = new int[9];
			    int []forthissurthird = new int[9];
			    int []forthissurfourth = new int[9];
			    int []forthissurfifth = new int[9];
			    if(i==0)
			    forthissur = this.front;
			    if(i==1)
			    forthissur = this.left;
			    if(i==2)
			    forthissur = this.back;
			    if(i==3)
			    forthissur = this.right;
			    
			    if((i+1)%4==0)
			    forthissurfourth = this.front;
			    if((i+1)%4==1)
			    forthissurfourth = this.left;
			    if((i+1)%4==2)
			    forthissurfourth = this.back;
			    if((i+1)%4==3)
			    forthissurfourth = this.right;
			    
			    if((i+n)%4==0)
				forthissursecond = this.front;
			    if((i+n)%4==1)
			    forthissursecond = this.left;
			    if((i+n)%4==2)
			    forthissursecond = this.back;
			    if((i+n)%4==3)
			    forthissursecond = this.right;
				    
				 if((i+n+1)%4==0)
		 		 forthissurthird = this.front;
				 if((i+n+1)%4==1)
		   		 forthissurthird = this.left;
		     	 if((i+n+1)%4==2)
			     forthissurthird = this.back;
				 if((i+n+1)%4==3)
			     forthissurthird = this.right;
				 
				 if((i+n+3)%4==0)
			 	 forthissurfifth = this.front;
			     if((i+n+3)%4==1)
		   	     forthissurfifth = this.left;
			     if((i+n+3)%4==2)
			     forthissurfifth = this.back;
			     if((i+n+3)%4==3)
				 forthissurfifth = this.right;
				 
				 //����ǿ���ɫ��λ����λ�ò���
				 if((this.bottom[map_of_bottom[i]]==this.bottom[4])&&(forthissur[6]!=forthissur[4]|forthissurfourth[8]!=forthissurfourth[4]))
				 {
					 this.toolrotateforenginetest(i,3);
					 this.rotatetopside(3);
					 this.toolrotateforenginetest(i, 1);
				 }
		        
				 //�����е׽�ɫ������
				 if(this.top[map_of_top[i]]==this.bottom[4])
				 {
					 n=0;
					 while(forthissursecond[0]!=forthissurthird[4])
					 {
						 this.rotatetopside(3);
						 n++;
						        if((i+n)%4==0)
								forthissursecond = this.front;
							    if((i+n)%4==1)
							    forthissursecond = this.left;
							    if((i+n)%4==2)
							    forthissursecond = this.back;
							    if((i+n)%4==3)
							    forthissursecond = this.right;
								    
								 if((i+n+1)%4==0)
						 		 forthissurthird = this.front;
								 if((i+n+1)%4==1)
						   		 forthissurthird = this.left;
						     	 if((i+n+1)%4==2)
							     forthissurthird = this.back;
								 if((i+n+1)%4==3)
							     forthissurthird = this.right;
								 
								 //System.out.println("I'm here the last third!");
								 
					 }
					 this.toolrotateforenginetest((i+n)%4, 3);
					 this.rotatetopside(1);
					 this.toolrotateforenginetest((i+n)%4, 1);
					 this.rotatetopside(2);
				 }
				 
				 //�������Ͻ��ǵ���ɫ�����
				 if(forthissur[0]==this.bottom[4])
				 {
					 n=0;
					 while(forthissurthird[4]!=forthissurthird[2])
					 {
						 this.rotatetopside(3);
						 n++;
						     if((i+n+1)%4==0)
					 		 forthissurthird = this.front;
							 if((i+n+1)%4==1)
					   		 forthissurthird = this.left;
					     	 if((i+n+1)%4==2)
						     forthissurthird = this.back;
							 if((i+n+1)%4==3)
						     forthissurthird = this.right;
							 
							 //System.out.println("I'm here the last second!");
							 
					 }
					 this.toolrotateforenginetest((i+n)%4, 3);
					 this.rotatetopside(3);
					 this.toolrotateforenginetest((i+n)%4, 1);
				 }
				 
				 //�������Ͻ��ǵ���ɫ�����
				 if(forthissur[2]==this.bottom[4])
				 {
					 n=0;
					 while(forthissurfifth[4]!=forthissurfifth[0])
					 {
						 this.rotatetopside(3);
						 n++;
						     if((i+n+3)%4==0)
						 	 forthissurfifth = this.front;
						     if((i+n+3)%4==1)
					   	     forthissurfifth = this.left;
						     if((i+n+3)%4==2)
						     forthissurfifth = this.back;
						     if((i+n+3)%4==3)
							 forthissurfifth = this.right;
						     
						 //System.out.println("I'm here the last!");    
						     
					 }
					 this.toolrotateforenginetest((n+i)%4, 1);
					 this.rotatetopside(1);
					 this.toolrotateforenginetest((n+i)%4, 3);
				 }
				 
				 //�������½��ǵ���ɫ�����
				 if(forthissur[6]==this.bottom[4])
				 {
					 this.toolrotateforenginetest(i, 3);
					 this.rotatetopside(3);
					 this.toolrotateforenginetest(i, 1);
				 }
				 
				 //�������½��ǵ���ɫ�����
                 if(forthissur[8]==this.bottom[4])
                 {
                	 this.toolrotateforenginetest(i, 1);
					 this.rotatetopside(1);
					 this.toolrotateforenginetest(i, 3);
                 }
		    }
		}
		
	}
	
	//�����λ
	public void engineforzyp()
	{
		while(!((this.front[3]==this.front[4]&&this.front[5]==this.front[4])&&(this.left[3]==this.left[4]&&this.left[5]==this.left[4])
				&&(this.back[3]==this.back[4]&&this.back[5]==this.back[4])&&(this.right[3]==this.right[4]&&this.right[5]==this.right[4])))
		{

			
			int []map_of_top = {7,3,1,5};
			int n = 0;
			int i = 0;
			for(i=0;i<4;i++)
			{
				int []forthissur = new int[9];
				int []forthissursecond = new int[9];
				int []forthissurthird = new int[9];
				int []forthissurfourth = new int[9];
				int []forthissurfifth = new int[9];
				        if(i==0)
					    forthissur = this.front;
					    if(i==1)
					    forthissur = this.left;
					    if(i==2)
					    forthissur = this.back;
					    if(i==3)
					    forthissur = this.right;
					    if((i+1)%4==0)
			            forthissurfourth = this.front;
					    if((i+1)%4==1)
					    forthissurfourth = this.left;
					    if((i+1)%4==2)
					    forthissurfourth = this.back;
					    if((i+1)%4==3)
					    forthissurfourth = this.right;
					    if((i+n)%4==0)
						forthissursecond = this.front;
					    if((i+n)%4==1)
					    forthissursecond = this.left;
					    if((i+n)%4==2)
					    forthissursecond = this.back;
					    if((i+n)%4==3)
					    forthissursecond = this.right;
					    if((i+n+3)%4==0)
					 	 forthissurfifth = this.front;
					     if((i+n+3)%4==1)
				  	     forthissurfifth = this.left;
					     if((i+n+3)%4==2)
					     forthissurfifth = this.back;
					     if((i+n+3)%4==3)
						 forthissurfifth = this.right;
					     if((i+n+1)%4==0)
						 forthissurthird = this.front;
						 if((i+n+1)%4==1)
				   		 forthissurthird = this.left;
				     	 if((i+n+1)%4==2)
					     forthissurthird = this.back;
						 if((i+n+1)%4==3)
					     forthissurthird = this.right;
			    if(!(forthissur[3]==forthissur[4]&&forthissurfourth[5]==forthissurfourth[4])&&(forthissur[3]!=this.top[4]&&forthissurfourth[5]!=this.top[4]))
			    {
			    	this.toolrotateforenginetest(i, 1);
			    	this.rotatetopside(1);
			    	this.toolrotateforenginetest(i, 1);
			    	this.rotatetopside(1);
			    	this.toolrotateforenginetest(i, 1);
			    	this.rotatetopside(3);
			    	this.toolrotateforenginetest(i, 3);
			    	this.rotatetopside(3);
			    	this.toolrotateforenginetest(i, 3);	
			    	this.rotatetopside(2);
			    }
			    
			    if(forthissur[1]!=this.top[4]&&this.top[map_of_top[i]]!=this.top[4])
			    {
			    	n = 0;
			    	while(forthissursecond[1]!=forthissursecond[4])
			    	{
			    		n++;
			    		this.rotatetopside(3);
			    		if((i+n)%4==0)
							forthissursecond = this.front;
						    if((i+n)%4==1)
						    forthissursecond = this.left;
						    if((i+n)%4==2)
						    forthissursecond = this.back;
						    if((i+n)%4==3)
						    forthissursecond = this.right;
						    
						    //System.out.println("I'm here for ....!\r\n");    
			    	}
			    	if((i+n+3)%4==0)
					 	 forthissurfifth = this.front;
					     if((i+n+3)%4==1)
				  	     forthissurfifth = this.left;
					     if((i+n+3)%4==2)
					     forthissurfifth = this.back;
					     if((i+n+3)%4==3)
						 forthissurfifth = this.right;
					if((i+n+1)%4==0)
						 forthissurthird = this.front;
						 if((i+n+1)%4==1)
				   		 forthissurthird = this.left;
				     	 if((i+n+1)%4==2)
		     		     forthissurthird = this.back;
						 if((i+n+1)%4==3)
					     forthissurthird = this.right;
			    	
			    if(this.top[map_of_top[(i+n)%4]]==forthissurfifth[4])
			    {
			    	this.toolrotateforenginetest((i+n)%4,3);
			    	this.rotatetopside(3);
			    	this.toolrotateforenginetest((i+n)%4,3);
			    	this.rotatetopside(3);
			    	this.toolrotateforenginetest((i+n)%4,3);
			    	this.rotatetopside(1);
			    	this.toolrotateforenginetest((i+n)%4,1);
			    	this.rotatetopside(1);
			    	this.toolrotateforenginetest((i+n)%4,1);
			    }
			
               if(this.top[map_of_top[(i+n)%4]]==forthissurthird[4])
               {
            	   this.toolrotateforenginetest((i+n)%4, 1);
            	   this.rotatetopside(1);
            	   this.toolrotateforenginetest((i+n)%4, 1);
            	   this.rotatetopside(1);
            	   this.toolrotateforenginetest((i+n)%4, 1);
            	   this.rotatetopside(3);
            	   this.toolrotateforenginetest((i+n)%4, 3);
            	   this.rotatetopside(3);
            	   this.toolrotateforenginetest((i+n)%4, 3);
               }
			}
		}
		
	}
		
}
	
	//����ʮ��
	
	public void engineforwyl()
	{

		
		while(!(this.top[1]==this.top[4]&&this.top[3]==this.top[4]
				&&this.top[5]==this.top[4]&&this.top[7]==this.top[4]))
		{

			int []map_of_top = {7,3,1,5};
			
			if(this.top[1]!=this.top[4]&&this.top[3]!=this.top[4]&&this.top[5]!=this.top[4]&&this.top[7]!=this.top[4])
			{
				this.rotatefrontside(3);
				this.rotaterightside(3);
				this.rotatetopside(3);
				this.rotaterightside(1);
				this.rotatetopside(1);
				this.rotatefrontside(1);
			}
			int i = 0;
			for(i=0;i<4;i++)
			{
				if(this.top[map_of_top[(i+1)%4]]==this.top[4]&&this.top[map_of_top[(i+2)%4]]==this.top[4]
						&&this.top[map_of_top[i]]!=this.top[4]&&this.top[map_of_top[(i+3)%4]]!=this.top[4])
				{
					//�γ�һ������L��
					this.toolrotateforenginetest(i, 3);
					this.toolrotateforenginetest((i+3)%4, 3);
					this.rotatetopside(3);
					this.toolrotateforenginetest((i+3)%4, 1);
					this.rotatetopside(1);
					this.toolrotateforenginetest(i, 1);
				}
				
				if(this.top[map_of_top[(i+1)%4]]==this.top[4]&&this.top[map_of_top[(i+3)%4]]==this.top[4]
						&&this.top[map_of_top[i]]!=this.top[4]&&this.top[map_of_top[(i+2)%4]]!=this.top[4])
				{
					// �γ�һ����"һ"
					this.toolrotateforenginetest(i, 3);
					this.toolrotateforenginetest((i+3)%4, 3);
					this.rotatetopside(3);
					this.toolrotateforenginetest((i+3)%4, 1);
					this.rotatetopside(1);
					this.toolrotateforenginetest(i, 1);
				}
					
			}
		}
	}
	
	
	
	public void engineforwyt()
	{
		// ������λ
		while(!(this.top[0]==this.top[4]&&this.top[2]==this.top[4]
				&&this.top[6]==this.top[4]&&this.top[8]==this.top[4]))
		{
			
			int []map_of_top = {6,0,2,8};
			int n = 0;
			int i = 0;
			for(i=0;i<4;i++)
			{
				    int []forthissur = new int[9]; 
				    int []forthissursecond = new int[9]; 
				    if(i==0)
	     		    forthissur = this.front;
				    if(i==1)
				    forthissur = this.left;
				    if(i==2)
				    forthissur = this.back;
				    if(i==3)
				    forthissur = this.right;
				    if((i+n)%4==0)
					forthissursecond = this.front;
				    if((i+n)%4==1)
				    forthissursecond = this.left;
				    if((i+n)%4==2)
				    forthissursecond = this.back;
				    if((i+n)%4==3)
				    forthissursecond = this.right;
				if((this.top[0]!=this.top[4]&&this.top[2]!=this.top[4]
						&&this.top[6]!=this.top[4]&&this.top[8]!=this.top[4])
						&&(forthissur[0]==this.top[4]&&forthissur[2]==this.top[4]))					
				{
					//ʮ���ͣ�ǰ��������ͬɫ��
					n=0;
					while(forthissursecond[1]!=forthissursecond[4])
					{
						this.rotatetopside(3);
						n++;
						    if((i+n)%4==0)
								forthissursecond = this.front;
							    if((i+n)%4==1)
							    forthissursecond = this.left;
							    if((i+n)%4==2)
							    forthissursecond = this.back;
							    if((i+n)%4==3)
							    forthissursecond = this.right;
							    
							    //System.out.println("I'm here for wty!\r\n");	    
					}
					this.toolrotateforenginetest((i+n+3)%4, 1);
					this.rotatetopside(2);
					this.toolrotateforenginetest((i+n+3)%4, 3);
					this.rotatetopside(3);
					this.toolrotateforenginetest((i+n+3)%4, 1);
					this.rotatetopside(3);
					this.toolrotateforenginetest((i+n+3)%4, 3);
				}
				
				if(this.top[map_of_top[(i+3)%4]]==this.top[4]&&this.top[map_of_top[i]]!=this.top[4]
						&&this.top[map_of_top[(i+1)%4]]!=this.top[4]&&this.top[map_of_top[(i+2)%4]]!=this.top[4])
				{
					//��ͷ�����µ���
					if(forthissur[0]!=this.top[4])
					{
						this.toolrotateforenginetest((i+3)%4, 1);
						this.rotatetopside(2);
						this.toolrotateforenginetest((i+3)%4, 3);
						this.rotatetopside(3);
						this.toolrotateforenginetest((i+3)%4, 1);
						this.rotatetopside(3);
						this.toolrotateforenginetest((i+3)%4, 3);
					}
					else
					{
						//ǰ������ͬɫ
						this.rotatetopside(1);
						this.toolrotateforenginetest((i+3)%4, 3);
						this.rotatetopside(2);
						this.toolrotateforenginetest((i+3)%4, 1);
						this.rotatetopside(1);
						this.toolrotateforenginetest((i+3)%4, 3);
						this.rotatetopside(1);
						this.toolrotateforenginetest((i+3)%4, 1);
					}
				}
				
				if(this.top[map_of_top[(i+1)%4]]==this.top[4]&&this.top[map_of_top[i]]!=this.top[4]
						&&this.top[map_of_top[(i+3)%4]]!=this.top[4]&&this.top[map_of_top[(i+2)%4]]==this.top[4])
				{
					//������
					if(forthissur[0]==this.top[4]&&forthissur[2]==this.top[4])
					{
						this.toolrotateforenginetest((i+1)%4, 1);
						this.rotatetopside(2);
						this.toolrotateforenginetest((i+1)%4, 3);
						this.rotatetopside(3);
						this.toolrotateforenginetest((i+1)%4, 1);
						this.rotatetopside(3);
						this.toolrotateforenginetest((i+1)%4, 3);
					}
					else
					{
						this.toolrotateforenginetest((i+2)%4, 1);
						this.rotatetopside(2);
						this.toolrotateforenginetest((i+2)%4, 3);
						this.rotatetopside(3);
						this.toolrotateforenginetest((i+2)%4, 1);
						this.rotatetopside(3);
						this.toolrotateforenginetest((i+2)%4, 3);
					}
				}
				
				if(this.top[map_of_top[(i+3)%4]]==this.top[4]&&this.top[map_of_top[i]]!=this.top[4]
						&&this.top[map_of_top[(i+1)%4]]==this.top[4]&&this.top[map_of_top[(i+2)%4]]!=this.top[4])
				{
					// ˫����
                    this.rotatetopside(1);
					this.toolrotateforenginetest((i+3)%4, 1);
					this.rotatetopside(2);
					this.toolrotateforenginetest((i+3)%4, 3);
					this.rotatetopside(3);
					this.toolrotateforenginetest((i+3)%4, 1);
					this.rotatetopside(3);
					this.toolrotateforenginetest((i+3)%4, 3);
				}
			}
		}
	}
	
	
	public void engineforsy()
	{
		//���ǻ�ԭ
		while(this.front[0]!=this.front[4])
			this.rotatetopside(3);
		while(!((this.front[0]==this.front[4]&&this.front[2]==this.front[4])
				&&(this.left[0]==this.left[4]&&this.left[2]==this.left[4])
				&&(this.back[0]==this.back[4]&&this.back[2]==this.back[4])
				&&(this.right[0]==this.right[4]&&this.right[2]==this.right[4])))
		{
			int n = 0;
			int i = 0;
			for(i=0;i<4;i++)
			{
				n=0;
				 int []forthissur = new int[9]; 
				 int []forthissursecond = new int[9]; 
				    if(i==0)
	     		    forthissur = this.front;
				    if(i==1)
				    forthissur = this.left;
				    if(i==2)
				    forthissur = this.back;
				    if(i==3)
				    forthissur = this.right;	
				    if((i+n)%4==0)
					forthissursecond = this.front;
				    if((i+n)%4==1)
				    forthissursecond = this.left;
				    if((i+n)%4==2)
				    forthissursecond = this.back;
				    if((i+n)%4==3)
				    forthissursecond = this.right;
				if(forthissur[0]==forthissur[2])
				{
					while(forthissursecond[0]!=forthissursecond[4])
					{
						this.rotatetopside(3);
						n++;
						if((i+n)%4==0)
							forthissursecond = this.front;
						    if((i+n)%4==1)
						    forthissursecond = this.left;
						    if((i+n)%4==2)
						    forthissursecond = this.back;
						    if((i+n)%4==3)
						    forthissursecond = this.right;
						    
					 //System.out.println("I'm here for sy!\r\n");
					}
					break;
				}
			}
			
			this.toolrotateforenginetest((i+n+3)%4, 3);
			this.toolrotateforenginetest((i+n+2)%4, 1);
			this.toolrotateforenginetest((i+n+3)%4, 3);
			this.toolrotateforenginetest((i+n)%4, 2);
			this.toolrotateforenginetest((i+n+3)%4, 1);
			this.toolrotateforenginetest((i+n+2)%4, 3);
			this.toolrotateforenginetest((i+n+3)%4, 3);
			this.toolrotateforenginetest((i+n)%4, 2);
			this.toolrotateforenginetest((i+n+3)%4, 2);
		    while(this.front[0]!=this.front[4])
		    	this.rotatetopside(3);
		}
	}
	
	
	public void engineboss()
	{
		// ���㻹ԭ
		while(this.front[0]!=this.front[4])
			this.rotatetopside(3);
		while(!(this.front[1]==this.front[4]&&this.left[1]==this.left[4]
				&&this.back[1]==this.back[4]&&this.right[1]==this.right[4]))
		{
			int n = 0;
			int i = 0;
			for(i=0;i<4;i++)
			{
				n=0;
				int []forthissur = new int[9]; 
				int []forthissursecond = new int[9]; 
				    if(i==0)
	     		    forthissur = this.front;
				    if(i==1)
				    forthissur = this.left;
				    if(i==2)
				    forthissur = this.back;
				    if(i==3)
				    forthissur = this.right;	
				    if((i+n)%4==0)
					forthissursecond = this.front;
				    if((i+n)%4==1)
				    forthissursecond = this.left;
				    if((i+n)%4==2)
				    forthissursecond = this.back;
				    if((i+n)%4==3)
				    forthissursecond = this.right;
				if(forthissur[0]==forthissur[1]&&forthissur[1]==forthissur[2])
				{
                    while(forthissursecond[0]!=forthissursecond[4])
                    {
                    	this.rotatetopside(3);
                    	n++;
                    	 if((i+n)%4==0)
         					forthissursecond = this.front;
         				    if((i+n)%4==1)
         				    forthissursecond = this.left;
         				    if((i+n)%4==2)
         				    forthissursecond = this.back;
         				    if((i+n)%4==3)
         				    forthissursecond = this.right;
         				    
         				   //System.out.println("I'm here the first for boss!\r\n");    
                    }
                    break;
				}
			}
			
			this.toolrotateforenginetest((i+n+1)%4, 3);
			this.rotatetopside(1);
			this.toolrotateforenginetest((i+n+1)%4, 3);
			this.rotatetopside(3);
			this.toolrotateforenginetest((i+n+1)%4, 3);
			this.rotatetopside(3);
			this.toolrotateforenginetest((i+n+1)%4, 3);
			this.rotatetopside(1);
			this.toolrotateforenginetest((i+n+1)%4, 1);
			this.rotatetopside(1);
			this.toolrotateforenginetest((i+n+1)%4, 2);
			while(this.front[0]!=this.front[4])
			{
				this.rotatetopside(3);
				//System.out.println("I'm here the second for boss!\r\n");
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cubicweel forsxr = new Cubicweel();
     
        forsxr.getsituations();
                                               //  rotate family
        
        forsxr.printresult();
        
        forsxr.enginenewtest();
        
        forsxr.printresult();
        
        forsxr.engineforzdy();
        
        forsxr.printresult();
        
        forsxr.engineforzyp();
        
        forsxr.printresult();
        
        forsxr.engineforwyl();
        
        forsxr.printresult();
        
        forsxr.engineforwyt();
        
        forsxr.printresult();
        
        forsxr.engineforsy();
        
        forsxr.printresult();
        
        forsxr.engineboss();
        
        forsxr.printresult();
        }

	

}