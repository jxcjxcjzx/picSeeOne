import java.io.*; 
import java.net.*; 
import java.util.regex.*;


public class Bookgrap2 { 

	/** 
	 * @param args 
	 */ 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		   String strUrl = null;
	   try { 
		   BufferedReader store = new BufferedReader(new FileReader("ku.txt ")); 
	    	while((strUrl=store.readLine())!=null)
	    	{ 		
	    		
				   boolean kaishi = false;    //��������ŵĳ���
				   boolean jieshu = false;    //��������ŵĳ���
				   String pipei = "</p><p>(.*)";
				   Pattern p = Pattern.compile("<.+?>");     //ȥ����ǩ�����
				   Pattern p2 = Pattern.compile(pipei);   //��ʼ���ţ���Χ���ݣ�

			             
				   
				   URL url = new URL(strUrl);                              
				   InputStreamReader isr = new InputStreamReader(url.openStream(),"utf-8");    //������
		
			       BufferedReader br = new BufferedReader(isr); 
			       String str = null;      //str������ȡ���������
			       String string = null;
			     while ((str = br.readLine() )!= null) {   
			    	 
			    	 Matcher m1 = p2.matcher(str);
						if(m1.find())
						{
							System.out.println(m1.group(1));
						}
					}
				            
	             br.close();        
	    	}
	 } catch (IOException e) 
	 {            
	        e.printStackTrace();    
	      }    
	  } 
		 
	} 

