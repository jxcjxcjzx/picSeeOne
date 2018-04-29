package modes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexmode {

	/**
	 * variables: String fileUrl (the file address to be read in)
	 * functions: String[] getwords() (to get the key words for searchmode)
	 */
   	
	private String fileUrl = "regexmode.txt";
	public String []getres = null;
	public void getregex()
	{
		String []a = null;
		String duchu = null;
		try{
			   int lengthofrecord = 0;
			   BufferedReader store = new BufferedReader(new FileReader(fileUrl)); 
			   while((duchu = store.readLine())!=null)
			   {
				   lengthofrecord ++;
			   }
			   a = new String[lengthofrecord];
			   store.close();
			   store = new BufferedReader(new FileReader(fileUrl)); 
			   for(int i = 0;i<lengthofrecord;i++){
			     a[i] = store.readLine();
			   }
			   this.getres = a;
		}
		catch (IOException e){           
		        e.printStackTrace();    
		}   
	}
	
	public boolean whethermatch(String oneline)
	{
		Pattern p = null;
		Matcher m = null;
	    boolean matchres = false;
	    for(int i=0;i<this.getres.length;i++){
			    p = Pattern.compile(this.getres[i]);
			    m = p.matcher(oneline);
				if(m.find())
				{
		            matchres = true;
				}
	    }
	    return matchres;
	}
	
	
	
}
