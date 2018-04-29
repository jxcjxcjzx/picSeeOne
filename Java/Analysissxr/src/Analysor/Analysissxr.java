package Analysor;
import java.io.*;
import java.util.regex.*;
import modes.*;

public class Analysissxr {

/**
 * // introduction： This is the home of our first String-based project codes.
// Thanks and good luck!
// This is written for a girl called sxr, hope she will score high in the 
// Tofel test, Ok,let's begin


// lists in the following are function will be used 
//1.charAt(int index)

 * @param here
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String str = null;	
		// 1.search mode 即使用关键词描述的兴趣模型
		regexmode modetwo = new regexmode();
		modetwo.getregex();
		BufferedReader read = new BufferedReader(new FileReader("material.txt"));		
		while ((str = read.readLine() )!= null) {   
		stringline b = new stringline(str);
		String c = b.replaceblank();
		b.replace(c);
        if(c!=null){
				if(modetwo.whethermatch(c)){
					System.out.println(b.get());
				}
        }
		}
	}
       catch (IOException e) {         
             e.printStackTrace();    
 }    
		
}

	
	
	
}
