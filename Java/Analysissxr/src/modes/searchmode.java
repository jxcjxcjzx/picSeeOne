package modes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class searchmode {
	/**
	 * variables: String fileUrl (the file address to be read in)
	 * functions: String[] getwords() (to get the key words for searchmode)
	 *            boolean whethermatch(String a),boolean whethermatch(String []a)
	 */
   	
	private String fileUrl = "searchmode.txt";
	public String []interest = null;
	public void getwords()
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
			   this.interest = a;
		}
		catch (IOException e){           
		        e.printStackTrace();    
		}   
	}
	
	public boolean whethermatch(String a)
	{
		boolean matchres = false;
		if(a==null)
			a = "¿ÕµÄÄÚÈÝ";
	    for(int j = 0;j<this.interest.length;j++){
	      if(a.contains(this.interest[j]))
	    	  matchres = true;
	    }
		return matchres;
	}
	
	public boolean whethermatch(String []a)
	{
		boolean matchres = false;
		if(a==null)
			matchres = false;
		for(int i=0;i<a.length;i++){
	       for(int j = 0;j<this.interest.length;j++){
	          if(a[i].contains(this.interest[j]))
	    	    matchres = true;
	      }
		}
		return matchres;
	}

}
