import java.io.*;
import java.util.regex.*;
import java.net.*;

public class zhengze {
	public static void main(String[] args){
		String duqu = null;
		try	{
	
		
			BufferedReader store = new BufferedReader(new FileReader("D:/Program Files/Smith/zhengze/ku2.txt")); 
			duqu=store.readLine();
	    	while((duqu=store.readLine())!=null)
	    	{	
			 String strUrl = duqu;         
			 
			 URL url = new URL(strUrl);                              
			InputStreamReader isr = new InputStreamReader(url.openStream(),"utf-8"); 

            
			Pattern p = Pattern.compile("<.+?>");
			Pattern p4 = Pattern.compile("\\s*<title>\\s*");
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			String str2 = null;
			while ((str=br.readLine() )!= null) {
				
				Matcher m = p4.matcher(str);
					while (m.find()) {
										/*
					Matcher m2 = p3.matcher(string);
					if (m2.find()) {
						 System.out.println(m2.group(1));
					}
					*/
					
					 str2=br.readLine();
					 System.out.println(str2);
					 break;
					}
				
					
				/*
					Matcher m2 = p2.matcher(string);
				
					if(m2.matches())
					{
					   System.out.println(m2.group(1));
					}
				*/
			}	
			
			}

		} 
		catch (IOException e) {
			System.out.println(duqu);
			e.printStackTrace();
		}
	}
} 