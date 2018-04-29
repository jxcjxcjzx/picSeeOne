import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.io.*;


public class matlab2 {

	/**
	 * @param args
	 */
 
	
	
	public static void main(String[] args) throws IOException{

		   int resultforcom[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd1[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd2[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd3[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd4[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd5[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd6[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd7[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd8[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd9[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd10[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd11[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		    int resultadd12[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
	    int bidui1[][] ={
        		{1,1,1,1,1,1,1,0,0,1,1,1,1,1,1}, 
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,0,0,0,0,0,1,0,0,0,0,0,1,1},  
        		{1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},  
        		{1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},  
        		{0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},  
        		{0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},  
        		{1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},  
        		{1,0,0,0,0,0,0,1,0,0,0,0,0,1,1},  
        		{1,1,0,0,0,0,0,1,0,0,0,0,0,1,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,1,1,1,1}  };
        int bidui2[][]={
        		{1,1,1,1,1,1,1,0,0,1,1,1,1,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,1,1,1,1,1},  
        		{1,1,1,0,1,1,1,1,1,1,1,0,1,1,1},  
        		{1,1,0,1,1,0,0,0,0,0,1,1,0,1,1},  
        		{1,0,1,1,0,0,0,1,0,0,0,1,1,0,1},  
        		{0,0,1,1,0,0,1,1,1,0,0,1,1,0,0},  
        		{0,0,1,1,1,1,1,1,0,0,0,1,1,0,0},  
        		{0,1,1,1,1,1,0,0,0,0,1,1,1,0,0},  
        		{0,0,1,1,1,0,0,0,1,1,1,1,1,0,1},  
        		{1,0,1,1,0,0,1,1,1,1,1,1,1,0,1},  
        		{1,0,0,1,0,0,0,0,0,0,0,1,0,1,1},  
        		{1,1,0,0,1,1,1,1,1,1,1,0,1,1,1},  
        		{1,1,1,1,0,0,0,1,0,0,0,1,1,1,1}  }; 
        int bidui3[][]={
        		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,0,0,1,1},  
        		{1,1,1,0,0,0,1,1,1,1,0,0,0,0,1},  
        		{1,1,0,0,0,1,0,0,0,0,1,0,0,0,1},  
        		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},  
        		{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},  
        		{1,0,0,0,0,0,0,0,0,0,1,0,0,0,0},  
        		{1,0,0,0,0,1,0,0,0,0,1,0,0,0,0},  
        		{1,1,0,0,0,1,0,0,0,0,1,0,0,0,1},  
        		{1,1,1,0,0,0,1,0,1,1,0,0,0,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,1,1,1,1,0,0,0,0,1,1,1,1,1}  };	
        int bidui4[][]={
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1},  
        		{1,1,1,0,0,0,1,1,1,0,0,0,1,1,1},  
        		{1,1,0,0,1,1,1,1,0,0,1,1,0,1,1},  
        		{1,0,1,1,1,1,1,0,0,0,1,1,1,0,1},  
        		{1,0,1,1,1,1,1,0,0,0,1,1,1,0,1},  
        		{1,0,1,1,1,0,0,1,0,0,1,1,1,1,0},  
        		{0,1,1,1,1,0,0,1,0,0,1,1,1,1,0},  
        		{1,0,1,1,0,0,0,1,0,0,1,1,1,1,0},  
        		{1,0,1,1,0,0,0,0,0,0,0,1,1,0,1},  
        		{1,0,1,1,1,1,1,1,0,0,1,1,1,0,1},  
        		{1,1,0,0,1,1,1,1,0,0,1,1,0,1,1},  
        		{1,1,1,0,0,0,1,1,1,0,0,0,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1}  };
        int bidui5[][]={
        		{1,1,1,1,1,1,1,1,0,1,1,1,1,1,1},  
        		{1,1,1,1,1,1,0,0,0,0,0,1,1,1,1},
        		{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,1,0,0,0,1,0,1,1,0,0,0,0,1},  
        		{1,1,0,0,0,0,1,0,0,0,0,0,0,0,1},  
        		{1,0,0,0,0,1,0,0,0,0,0,0,0,0,0},  
        		{1,0,0,0,0,1,1,0,0,1,1,0,0,0,0},  
        		{0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},  
        		{1,0,0,0,0,0,0,0,0,0,1,0,0,0,0},  
        		{1,1,0,0,0,0,0,0,0,1,1,0,0,0,0},  
        		{1,1,0,0,0,1,1,1,1,1,0,0,0,0,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1}  };
        int bidui6[][]={
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1},  
        		{1,1,1,1,0,0,1,1,1,0,0,0,1,1,1},  
        		{1,1,1,0,1,1,1,0,0,1,1,1,0,1,1},  
        		{1,0,0,1,1,0,0,0,0,0,0,1,1,0,1},  
        		{1,0,1,1,1,0,0,1,1,1,1,1,1,0,0},  
        		{0,0,1,1,0,0,0,0,0,0,1,1,1,0,0},  
        		{0,0,1,1,0,0,1,1,1,0,0,1,1,1,0},  
        		{0,0,1,1,0,0,1,1,1,1,0,1,1,1,0},  
        		{1,0,1,1,0,0,1,1,1,1,0,1,1,0,0},  
        		{1,0,0,1,1,0,0,0,0,0,0,1,1,0,1},  
        		{1,1,0,0,1,1,0,0,0,0,1,1,0,0,1},  
        		{1,1,1,0,0,1,1,1,1,1,0,0,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1}  };
        int bidui7[][]={
        		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1},  
        		{1,1,1,0,0,1,1,1,1,1,1,0,0,0,1},  
        		{1,1,0,0,0,0,0,0,0,0,1,0,0,0,1},  
        		{1,1,0,0,0,0,0,0,0,1,0,0,0,0,0},  
        		{1,0,0,0,0,0,0,0,1,0,0,0,0,0,0},  
        		{0,0,0,0,0,0,0,1,1,0,0,0,0,0,0},  
        		{1,1,0,0,0,0,0,1,0,0,0,0,0,0,0},  
        		{1,1,0,0,0,0,0,1,0,0,0,0,0,0,1},  
        		{1,1,1,0,0,0,1,0,0,0,0,0,0,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,0,0,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1} };
        int bidui8[][]={
        		{1,1,1,1,1,1,1,1,0,1,1,1,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1},  
        		{1,1,1,0,0,1,1,1,1,1,1,0,1,1,1},  
        		{1,1,0,1,1,0,0,0,0,0,1,1,0,1,1},  
        		{1,0,0,1,1,0,0,1,0,0,0,1,1,0,1},  
        		{1,0,1,1,0,0,0,1,1,0,0,1,1,0,0},  
        		{0,0,1,1,1,0,0,0,0,0,1,1,1,0,0},  
        		{0,0,1,1,0,0,0,0,0,0,0,1,1,0,0},  
        		{0,0,1,1,0,0,1,1,1,0,0,1,1,0,0},  
        		{1,0,1,1,0,0,1,1,1,0,0,1,1,0,0},  
        		{1,1,0,1,1,0,0,0,0,0,1,1,0,0,1}, 
        		{1,1,1,0,1,1,1,1,1,1,1,0,0,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,1,1,1,1}  };
        int bidui9[][]={
        		{1,1,1,1,1,1,1,0,0,1,1,1,1,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,1,1,1,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,0,0,0,1,1,0,0,1,0,0,0,1,1},  
        		{1,0,0,0,0,1,0,0,0,0,1,0,0,0,1},  
        		{1,0,0,0,0,1,0,0,0,0,1,0,0,0,0},  
        		{1,0,0,0,0,1,0,0,0,1,1,0,0,0,0},  
        		{1,0,0,0,0,1,1,1,1,0,1,0,0,0,0},  
        		{1,0,0,0,0,0,0,0,0,0,1,0,0,0,0},  
        		{1,0,0,0,0,1,0,0,0,1,0,0,0,0,1},  
        		{1,1,0,0,0,1,1,0,1,0,0,0,0,1,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1} };
        int bidui10[][]={
        		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  
        		{1,1,1,1,0,0,0,0,0,0,0,1,1,1,1},  
        		{1,1,1,0,1,1,1,1,1,1,1,0,0,1,1},  
        		{1,1,0,1,1,0,0,1,1,0,0,0,0,0,1},  
        		{1,0,1,0,0,0,0,1,0,0,0,0,0,0,0},  
        		{0,0,1,0,0,0,0,1,0,0,1,1,0,0,0},  
        		{0,0,1,1,1,0,0,1,0,0,1,1,0,0,0},  
        		{0,0,1,1,1,0,0,1,0,0,1,1,0,0,0},  
        		{1,0,1,1,1,0,0,1,0,0,1,1,0,0,0},  
        		{1,1,0,1,1,0,0,1,1,0,0,0,0,0,1},  
        		{1,1,0,1,1,0,0,1,1,1,0,1,0,0,1},  
        		{1,1,1,0,0,1,1,1,1,1,1,0,0,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1}  };
        int bidui11[][]={
        		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1}, 
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},
        		{1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},  
        		{1,0,0,0,0,1,0,0,0,0,0,1,0,0,1},  
        		{1,0,0,0,0,1,0,0,0,0,1,1,0,0,1},  
        		{1,0,0,0,0,1,0,0,0,0,0,1,0,0,1}, 
        		{0,0,0,0,0,1,0,0,0,0,0,1,0,0,0},  
        		{1,0,0,0,0,1,0,0,0,0,0,1,0,0,0},  
        		{1,0,0,0,0,1,0,0,0,0,0,1,0,0,1}, 
        		{1,1,0,0,0,1,0,0,0,0,0,1,0,0,1},  
        		{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},
        		{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1}  };
        int bidui12[][]={
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1},  
        		{1,1,1,1,0,0,1,1,1,1,0,0,1,1,1},  
        		{1,1,1,0,1,1,1,1,1,1,1,1,0,1,1},  
        		{1,1,0,1,1,0,0,1,1,0,0,0,0,0,1},  
        		{1,0,1,0,0,0,0,1,0,0,1,0,0,0,0},  
        		{0,0,1,1,1,0,0,1,0,0,1,0,0,0,0},  
        		{0,0,1,1,1,0,0,1,1,1,0,0,0,1,0},  
        		{0,0,1,1,1,0,0,1,1,0,0,0,1,1,0},  
        		{1,0,1,1,1,0,0,1,0,0,1,1,1,0,0},  
        		{1,1,0,1,1,0,0,1,0,0,0,0,0,0,1},  
        		{1,1,0,1,1,1,1,1,1,1,1,1,0,1,1},  
        		{1,1,1,0,0,1,1,1,1,1,1,0,1,1,1},  
        		{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1}  };
		int bidui13[][]={
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},  
				{1,1,1,0,0,0,0,0,0,0,0,1,1,1,1},  
				{1,1,0,0,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,0,0,0,1,0,0,0,1,1,1,0,1,1},  
				{1,0,0,0,1,1,0,0,0,0,0,0,1,0,1},  
				{1,0,0,0,0,1,0,0,0,0,0,0,1,0,0},  
				{1,0,0,0,0,1,0,0,0,0,1,1,0,0,0},  
				{1,0,0,0,0,1,0,0,0,0,0,0,1,0,0},  
				{1,0,0,0,0,1,0,0,0,0,0,0,1,0,1},  
				{1,0,0,0,0,1,0,0,0,1,1,1,1,1,1},  
				{1,1,0,0,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
				{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1}  };
		int bidui14[][]={
				{1,1,1,1,0,0,0,0,0,0,0,1,1,1,1},  
				{1,1,1,0,1,1,1,1,1,1,1,0,1,1,1},  
				{1,1,1,1,1,0,1,1,1,1,1,1,0,1,1},  
				{1,0,1,1,0,0,1,1,1,1,0,0,0,0,1},  
				{0,1,0,0,0,0,1,1,1,1,0,0,1,0,1},  
				{0,1,1,1,0,0,1,1,1,0,0,0,1,1,0},  
				{0,1,1,1,0,0,1,1,0,0,1,0,0,1,0},  
				{0,1,1,1,0,0,1,0,0,0,0,0,0,1,0},  
				{0,1,1,1,0,0,1,1,0,0,0,0,0,0,1},  
				{1,0,1,1,0,0,1,1,1,1,1,0,1,0,1},  
				{1,0,0,1,1,0,1,1,1,1,1,0,0,1,1},  
				{1,1,0,0,0,1,1,1,1,1,0,0,1,1,1},  
				{1,1,1,1,1,0,0,0,0,1,1,1,1,1,1} };
		int bidui15[][]={
				{1,1,1,1,1,1,0,0,0,0,1,1,1,1,1},  
				{1,1,1,1,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1},  
				{1,0,0,0,0,1,0,0,0,0,0,0,0,0,1},  
				{1,0,0,0,0,1,0,0,0,0,0,0,0,0,0},  
				{1,0,0,0,0,1,0,0,0,1,1,1,1,0,0},  
				{1,0,0,0,0,1,0,0,0,0,0,0,0,0,0},  
				{1,0,0,0,0,1,0,0,0,0,0,0,0,0,0},  
				{1,0,0,0,0,1,0,0,0,1,0,0,1,0,1},  
				{1,1,0,0,0,0,0,0,0,1,1,1,0,0,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1},  
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1} };
		int bidui16[][]={
				{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1},  
				{1,1,1,0,0,1,1,1,1,1,0,0,1,1,1},  
				{1,1,0,1,1,1,1,1,1,1,1,1,0,1,1},  
				{1,0,1,1,1,0,0,1,1,0,0,0,0,0,1},  
				{0,0,1,0,0,0,0,1,0,0,1,0,0,0,1},  
				{0,0,1,1,1,0,0,1,0,0,0,0,1,1,0},  
				{0,0,1,1,1,0,0,1,0,0,0,0,0,1,0},  
				{0,0,1,1,1,0,0,1,0,1,1,1,0,0,0},  
				{0,0,1,1,1,0,0,1,0,0,1,0,0,0,0},  
				{1,0,1,1,1,0,0,1,0,0,0,0,0,0,1},  
				{1,1,0,1,1,0,1,1,1,0,0,0,0,0,1},  
				{1,1,1,0,0,1,1,1,1,1,0,0,1,1,1},  
				{1,1,1,1,1,0,0,0,0,0,1,1,1,1,1}  };
		int bidui17[][]={
				{1,1,1,1,1,1,0,0,0,0,0,1,1,1,1},  
				{1,1,1,1,0,0,0,0,0,0,0,0,1,1,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,0,0,0,1,1,0,0,1,1,1,1,0,1},  
				{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},  
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},  
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},  
				{1,1,0,0,0,0,0,0,0,0,1,0,0,0,0},  
				{1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,0,0,1},  
				{1,1,1,1,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1},  
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}  };
		int bidui18[][]={
				{1,1,1,1,1,1,0,0,0,0,0,1,1,1,1}, 
				{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1},  
				{1,1,1,0,0,1,1,1,1,1,1,0,0,1,1},  
				{1,1,0,1,1,1,1,1,1,1,0,0,0,0,1},  
				{1,0,0,1,1,0,0,1,0,0,0,0,0,0,1},  
				{1,0,1,0,0,0,0,1,0,0,1,1,0,0,0},  
				{1,0,1,1,1,0,0,1,0,0,0,0,0,1,0},  
				{0,0,1,1,1,0,0,1,0,0,0,0,0,0,0},  
				{1,0,1,1,1,0,0,1,0,0,1,1,0,0,0},  
				{1,0,1,1,1,0,0,1,0,0,1,1,0,0,0},  
				{1,1,0,1,1,0,0,1,1,0,0,0,0,0,1},  
				{1,1,1,0,1,1,1,1,1,1,1,1,0,1,1},  
				{1,1,1,1,0,0,0,1,1,0,0,1,1,1,1}  };
		int bidui19[][]={
				{1,1,1,1,1,1,1,1,0,0,1,1,1,1,1},  
				{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,1,1,1},  
				{1,1,0,0,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,0,0,0,1,1,0,0,1,1,0,1,0,0},  
				{1,0,0,0,0,1,1,0,0,0,0,0,0,1,0},  
				{0,0,0,0,0,1,1,0,0,1,0,0,1,1,0},  
				{0,0,0,0,0,1,1,0,0,1,1,1,1,1,0},  
				{1,0,0,0,0,1,1,0,0,0,0,0,0,0,0},  
				{1,1,0,0,0,1,0,0,0,1,0,0,1,0,0},  
				{1,1,0,0,0,1,0,0,0,0,1,1,0,0,1},  
				{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1},  
				{1,1,1,1,1,0,0,0,0,0,0,1,1,1,1}  };
		int bidui20[][]={
				{1,1,1,1,1,1,0,0,0,0,1,1,1,1,1},  
				{1,1,1,0,0,0,1,1,1,1,0,0,1,1,1},  
				{1,1,0,0,0,0,1,1,1,1,0,0,0,1,1},  
				{1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},  
				{1,0,0,0,1,1,0,1,0,0,1,1,0,0,1},  
				{0,1,1,1,1,1,0,1,0,0,1,1,0,1,0},  
				{0,1,1,1,0,0,0,1,0,0,1,1,0,1,0},  
				{1,1,1,0,0,1,1,1,0,0,1,1,0,1,1},  
				{1,0,0,0,1,1,1,1,0,0,1,0,0,0,1},  
				{1,0,0,0,0,0,0,1,1,0,0,0,1,0,1},  
				{1,1,0,0,1,1,1,1,1,1,1,1,0,1,1},  
				{1,1,1,0,0,1,1,1,1,1,0,0,1,1,1},  
				{1,1,1,1,1,1,0,0,0,0,1,1,1,1,1}  };
		
		 OutputStream output = null;  
	        try {  
	          
	            

	        	 // read bmp  
	        		            BufferedImage img = ImageIO.read(new File("F:/Pictures/databasefordigit/shiyan1.jpg"));  
	        		            int imageType = img.getType();  
	        		            int w = img.getWidth();  
	        		            int h = img.getHeight();  
	        		            int startX = 0;  
	        		            int startY = 0;  
	        		            int offset = 0;  
	        		            int changshuy=37;
	        		            int biduijieguo=100;
	        		            int changshux=43;
	        		            int scansize = w;  
	        		            int gao=h/8;
	        		            int kuan=w/8;
	        		            
	        		        
	        		           
	        		            
	        		        
	        		            // rgb的数组  
	        		            int[] rgbArray = new int[offset + (h - startY) * scansize  
	        		                    + (w - startX)];  
	        		            img.getRGB(startX, startY, w, h, rgbArray, offset, scansize);  
	        		  
	        		            int x0 = 0;  
	        		            int y0 = 0;  
	        		            int rgb = 0;
	        		            int i=0;
	        		            int j=0;
	        		            int xunhuan=0;
	        		            int ii=0;
	        		            int shibiex=0;
	        		            int shibiey=0;
	        		       
	        		            int jiancey=-gao/2+gao*3;     // jiancedian de zuobiao
	        		            int jiancex=-kuan/2+kuan*3;
	        		         	        		            		                  
		                  //此处开始正式的识别
	           for(shibiey=1;shibiey<8;shibiey++)
	        	   for(shibiex=1;shibiex<8;shibiex++)
	        	   {  
	        		   biduijieguo=100;
	        		   jiancey=-gao/2+gao*shibiey;    
	        		   jiancex=-kuan/2+kuan*shibiex;
		                   
   		              /*
   		                       jiancey=98;     // jiancedian de zuobiao
	        		           jiancex=198;
   		               */
	        		/*
	        		   jiancey=-gao/2+gao*3;    
	        		   jiancex=-kuan/2+kuan*5;
   		              */
	        		   /*
   		                  System.out.println(jiancey +","+jiancex);
   		              */
	        		   
	        		   
	        		   for(xunhuan=0;xunhuan<21;xunhuan++)
	        		   {
			        		 resultforcom[xunhuan]=0;
			       		     resultadd1[xunhuan]=0;
			       		     resultadd2[xunhuan]=0;
			       		     resultadd3[xunhuan]=0;
			       		     resultadd4[xunhuan]=0;
			       		     resultadd5[xunhuan]=0;
			       		     resultadd6[xunhuan]=0;
			       		     resultadd7[xunhuan]=0;
			       		     resultadd8[xunhuan]=0;
			       		     resultadd9[xunhuan]=0;
			       		     resultadd10[xunhuan]=0;
			       		     resultadd11[xunhuan]=0;
			       		     resultadd12[xunhuan]=0;
			       		     
	        		   }
	        		            
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultforcom[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultforcom[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultforcom[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            }

	            
	            else
	            {
	            	
	            }
	            
	            
	            
	            
	            /*
	              System.out.print(get +",");  
	            if(x0>=jiancex+changshux-3)
	            	System.out.println("  "); 
	            
	            	*/
	            	
	            	}
	            
	            
	            
	            
	            
	            // 有几个数字（测试结果，为如2，5，8），此处对所有数字进行误差校准
    
	            jiancey--;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd1[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd1[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd1[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}
	            jiancey++;
	            
	            
	            jiancey++;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd2[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd2[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd2[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}
	            jiancey--;
	            
	            
	           
	            jiancex++;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd3[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd3[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd3[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancex--;
	            
	            
	           
	            jiancex--;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd4[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd4[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd4[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	 
	            }
	            
	            	}  
	            jiancex++;
	            
	            
	            jiancex+=2;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd5[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd5[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd5[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancex-=2;
	            
	            
	            
	            jiancex-=2;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd6[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd6[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd6[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancex+=2;
	            
	            
	            
	            jiancey+=2;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd7[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd7[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd7[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey-=2;
	            
	            
	            jiancey-=2;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd8[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd8[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd8[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey+=2;
	            
	            
	            //三行对齐
	            jiancey-=3;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd9[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd9[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey+=3;
	            
	            
	            
	            
	            
	            jiancey+=3;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd10[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd10[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey-=3;
	            
	            
	            
	            
	            jiancex-=3;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd11[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd11[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	 
	            }
	            
	            	}  
	            jiancex+=3;
	            
	            
	            
	            
	            jiancex+=3;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	            // zhi jisuan shuzi bufen de wucha
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd12[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[10]+= (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui10[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[11]+= (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui11[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[12]+= (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui12[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[13]+= (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui13[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[14]+= (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui14[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[15]+= (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui15[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[16]+= (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui16[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[17]+= (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui17[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[18]+= (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui18[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[19]+= (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui19[(y0-jiancey)/3][(x0-jiancex)/3]);
	               	  resultadd12[20]+= (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui20[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancex-=3;
	            
	        /*    
	            //二倍增强型适应（可去）
	            jiancey-=1;
	            jiancex-=1;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	         
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd9[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd9[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey+=1;
	            jiancex+=1;
	            
	            
	            
	            jiancey+=1;
	            jiancex-=1;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	          
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd10[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd10[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey-=1;
	            jiancex+=1;
	            
	            
	            jiancey+=1;
	            jiancex-=1;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	            
	     
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd11[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd11[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey-=1;
	            jiancex+=1;
	            
	            
	            jiancey+=1;
	            jiancex+=1;
	            for(y0=jiancey;y0<jiancey+changshuy;y0+=3)
	            	for(x0=jiancex;x0<jiancex+changshux;x0+=3)
	            	{
	            	    
	            		j++;
	            		if(j==14)
	            		{
	            			i++;	
	            		    j=0;
	            	    }
	            rgb = rgbArray[offset + (y0 - startY) * scansize  
	                    + (x0 - startX)];  
	            Color c = new Color(rgb);  
	            int get = c.getRed();
	            
	            if(get<40)
	            	get=0;
	            else
	            	get=1;
	     
	            if((y0-jiancey-20)*(y0-jiancey-20)+(x0-jiancex-22)*(x0-jiancex-22)<=375)
	            {
	            	  resultadd12[1]+= (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui1[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[2]+= (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui2[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[3]+= (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui3[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[4]+= (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui4[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[5]+= (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui5[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[6]+= (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui6[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[7]+= (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui7[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[8]+= (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui8[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  resultadd12[9]+= (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]) * (get - bidui9[(y0-jiancey)/3][(x0-jiancex)/3]);
	            	  
	            }
	            
	            	}  
	            jiancey-=1;
	            jiancex-=1;
	            
	            
	            
	            
	   */         
	            
	            
	            //此处给出识别的就结果
	            for(ii=1;ii<21;ii++)
	            {
	            	if(resultforcom[ii]>resultadd1[ii])
	            	{
	            		resultforcom[ii]=resultadd1[ii];
	            	}
	            	if(resultforcom[ii]>resultadd2[ii])
	            	{
	            		resultforcom[ii]=resultadd2[ii];
	            	}
	            	if(resultforcom[ii]>resultadd3[ii])
	            	{
	            		resultforcom[ii]=resultadd3[ii];
	            	}
	            	if(resultforcom[ii]>resultadd4[ii])
	            	{
	            		resultforcom[ii]=resultadd4[ii];
	            	}
	            	if(resultforcom[ii]>resultadd5[ii])
	            	{
	            		resultforcom[ii]=resultadd5[ii];
	            	}
	            	if(resultforcom[ii]>resultadd6[ii])
	            	{
	            		resultforcom[ii]=resultadd6[ii];
	            	}
	            	if(resultforcom[ii]>resultadd7[ii])
	            	{
	            		resultforcom[ii]=resultadd7[ii];
	            	}
	            	if(resultforcom[ii]>resultadd8[ii])
	            	{
	            		resultforcom[ii]=resultadd8[ii];
	            	}
	        	          	        	
	            	if(resultforcom[ii]>resultadd9[ii])
	            	{
	            		resultforcom[ii]=resultadd9[ii];
	            	}
	            	if(resultforcom[ii]>resultadd10[ii])
	            	{
	            		resultforcom[ii]=resultadd10[ii];
	            	}
	            	if(resultforcom[ii]>resultadd11[ii])
	            	{
	            		resultforcom[ii]=resultadd11[ii];
	            	}
	            	if(resultforcom[ii]>resultadd12[ii])
	            	{
	            		resultforcom[ii]=resultadd12[ii];
	            	}
	            	
	            	
	            }
	            
	            
	            for(ii=1;ii<21;ii++)
	            {
	            	if(resultforcom[ii]<biduijieguo)
	            	{
	            		biduijieguo=resultforcom[ii];
	            	}
	            }
	            
	            for(ii=1;ii<21;ii++)
	            {
	            	if(resultforcom[ii]==biduijieguo&&biduijieguo<36)
	            	{
	            		System.out.println("在位置："+ shibiey + "," + shibiex + "有数字：" + ii); 
	            		System.out.println("shibie wucha:" +biduijieguo); 

	            		
	            	}
	            }
	            
	            
	         
	            
	        	   } 
	            
	            
	         //读写模块，主要的处理程序部分   

	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (output != null)  
	                try {  
	                    output.close();  
	                } catch (IOException e) {  
	                }  
	        }  
           
	        
	}

}



