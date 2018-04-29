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
	    		
				   boolean kaishi = false;    //标记左括号的出现
				   boolean jieshu = false;    //标记右括号的出现
				   String pipei = "</p><p>(.*)";
				   Pattern p = Pattern.compile("<.+?>");     //去除标签杂物等
				   Pattern p2 = Pattern.compile(pipei);   //开始括号（包围内容）

			             
				   
				   URL url = new URL(strUrl);                              
				   InputStreamReader isr = new InputStreamReader(url.openStream(),"utf-8");    //打开链接
		
			       BufferedReader br = new BufferedReader(isr); 
			       String str = null;      //str用来读取具体的内容
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

