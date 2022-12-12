import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Katha.Chowdhury
 *
 */
public class NewTask {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(".........new task  started .............\n");
		
		
		 
		   String line;   
	        ArrayList<String> words = new ArrayList<String>();    
	        
		 FileReader file = null;
		try {
			file = new FileReader("C:\\Users\\katha.chowdhury\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\DigitCounter\\src\\data1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	        BufferedReader br = new BufferedReader(file);    
	        ArrayList<Integer> intarraylist = new   ArrayList<Integer>();
	        
	        while((line = br.readLine()) != null) {    
	           System.out.println(" \n the contents of the file ...................."  + line) ;
	            //Adding all words generated in previous step into words 
	           if (line.equalsIgnoreCase("Homer Simpson"))
	         // Integer.parseInt(line)
	        	   {line="48";
	        	   intarraylist.add(Integer.parseInt("50"));
	        	   }
	           else {
	           intarraylist.add(Integer.parseInt(line));
	           } 
	            }    
	        
	        System.out.println("\n.........value of array is  before sorting is ............."+ intarraylist);
	        ///////////////////////////////////// sort the arry of numbers/////////////////
	        Collections.sort(intarraylist);
	           
	        System.out.println("\n.........value of array is after sorting is ............."+ intarraylist);
		 

	}

}
