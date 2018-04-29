package hualun;

import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flower_weel {

	/**
	 * @param args
	 */
	String headfilename = null;
	String ruleonename = null;
	String rulesecondname = null;
	String readwayname = null;
	String tailfilename = null;
	String []addressforhacker = new String[99];
	String []headrule = new String[99];
	String []tailrule = new String[99];
	String []readwriteway = new String[99];
public void set(String inputname,String outputname,String guizeonename,String guizesecondname,String wayforyou)
{
   	this.headfilename = inputname;
    this.tailfilename = outputname;
    this.ruleonename = guizeonename;
    this.rulesecondname = guizesecondname;
    this.readwayname = wayforyou;
}
	
public void get() throws IOException
{
	int i = 0;
	int j = 0;
	int k = 0;
	int w = 0;
	BufferedReader read = new BufferedReader(new FileReader(this.headfilename));
	String str = null;
	while ((str=read.readLine() )!= null) {
		this.addressforhacker[i++] = str;
	}
	read = new BufferedReader(new FileReader(this.ruleonename));
	while ((str=read.readLine() )!= null) {
		this.headrule[j++] = str;
	}
	read = new BufferedReader(new FileReader(this.rulesecondname));
	while ((str=read.readLine() )!= null) {
		this.tailrule[w++] = str;
	}
	read = new BufferedReader(new FileReader(this.readwayname));
	while ((str=read.readLine() )!= null) {
		this.readwriteway[k++] = str;
	}
}

public void choosestart(int changdu)throws IOException
{
     int i = 0;
     BufferedReader br = null; 
     InputStreamReader isr = null;
	 try { 
		   FileWriter fw = new FileWriter(this.tailfilename); 
		   boolean kaishi = false;  
		   boolean jieshu = false;  
		   String string = null;
		   String zuo = null;
		   String you = null;
		   Matcher m2 = null;
		   Matcher m3 = null;
		   Matcher m1 = null;
		   String rule = null;
		   Pattern bracket1 = null;
		   Pattern bracket2 = null;
		   Pattern p = Pattern.compile("<.+?>");                   
	       String str = null;
	  for(i=0;i<changdu;i++)
      {   
		  System.out.println(i);
		  // the seperate of urls which are not useful
		//  if(i<3) continue;
		/*  
		  // for individual test
		  i = 24;
		  */
               kaishi = false;  
			   jieshu = false;  
               URL url = new URL(this.addressforhacker[i]);
			   zuo = this.headrule[i];
			   you = this.tailrule[i];
			   rule = this.readwriteway[i];
			   bracket1 = Pattern.compile(zuo);   
			   bracket2 = Pattern.compile(you); 
			   if(rule.equals("gbk")){
				    isr = new InputStreamReader(url.openStream(),"gbk");
		       }
			   else{
			    if(rule.equals("utf-8")){
			    	isr = new InputStreamReader(url.openStream(),"utf-8");
			    }
			    else{
			    	isr = new InputStreamReader(url.openStream());
			    }
			    }
			   br = new BufferedReader(isr); 
   	        while ((str = br.readLine() )!= null) {   
/*
   	        	// for individual test
   	        	System.out.println(str);
 */
   	        	m2 = bracket1.matcher(str);
	    	    
				if(m2.find())
				{

					kaishi = true;
					
				}
				if(kaishi)
				{
         			m1 = p.matcher(str);
					if(m1.find())
					{
					string = m1.replaceAll("");
					}
					else
					{
						System.out.println(str);
					}
					 if(string.isEmpty()){
	           		 }
					 else{
					
							 System.out.println(string);
							 this.makeitforread(string,fw);
					 } 
				}
				m3 = bracket2.matcher(str);
				if(m3.find())
				{

					jieshu = true;
				}
				if(jieshu)
				{
					break;
				}
				
		
				
				
	     }
      
				br.close();
      }
	  fw.close();
	  
      }
				 catch (IOException e) 
    {            
      e.printStackTrace();    
    }    

}
	
public void makeitforread(String string,FileWriter fw)throws IOException
{
	fw.write(string);	
}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Flower_weel forjxc = new Flower_weel();
		forjxc.set("input.txt", "output.txt", "guizeone.txt", "guizesecond.txt", "theway.txt");
		forjxc.get();
     	forjxc.choosestart(7);
		System.out.println("work done!");
		
	}

}