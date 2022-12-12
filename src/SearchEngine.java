import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author Katha.Chowdhury
 *
 */
public class SearchEngine {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
 System.out.println(".........Search Engine  started .............\n");
 
 if (args.length > 0 && args[0]!=null) {
	 

      String wordstoexclude[] = args[0].split(",");
      		
		 System.out.println("\n....  The common words to exclude in the file  ..."+ Arrays.toString(wordstoexclude));
		
		 
				 
		   String line;   
	        ArrayList<String> words = new ArrayList<String>();    
	        
		 FileReader file = null;
		try {
			file = new FileReader("data.txt ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	        BufferedReader br = new BufferedReader(file);    
		
	        
	      //Reads each line    
	        while((line = br.readLine()) != null) {    
	            String string[] = line.toLowerCase().split("[, ?.@-]+");    
	            //Adding all words generated in previous step into words    
	            for(String s : string){    
	                words.add(s);    
	            }    
	        }    
	        
	        String[] wordsarray = new String[words.size()];
	        wordsarray = words.toArray(wordsarray);
	       
	        System.out.println("\n..............The words arraylist "+words.toString());
	        System.out.println("\n..............The words arraylist "+words.size());
	        
	        System.out.println("\n..............The words array is  from arraylist....... "+Arrays.toString(wordsarray));
	        System.out.println("\n..............The words array is  from arraylist....... "+wordsarray.length);
	        
	        for(int q = 0; q < wordsarray.length; q++) {
	        	wordsarray[q]=wordsarray[q].replace(" ", "");
	        	wordsarray[q]=wordsarray[q].replace(":", "");
	        	wordsarray[q]=wordsarray[q].replace(";", "");
	        	wordsarray[q]=wordsarray[q].replace("'s", "");
	        		        	
	        }
	        System.out.println("\n..............The words array is after removal  ....... "+Arrays.toString(wordsarray));
	        System.out.println("\n..............The words array is after removal  ....... "+wordsarray.length);
	        
	        Set<String> setunique = new HashSet<String>();
	        for(int l = 0; l < wordsarray.length; l++) {
	        	setunique.add(wordsarray[l]);
	        }
	        
	        ////////////////removing the words to exclude //////////////
	        
	        System.out.println("\n..............The set created with unique values ....... "+setunique.toString());
	        System.out.println("\n..............The set created with unique values ....... "+setunique.size());
	        for(int m = 0; m < wordstoexclude.length; m++) {
	        	setunique.remove(wordstoexclude[m]);
	        	setunique.remove("");
	        	setunique.remove(" ");
	        		        }
	        System.out.println("\n..............The set after removal of excluded array ....... "+setunique.toString());
	        System.out.println("\n..............The set after removal of excluded array ....... "+setunique.size());
	        
	        String arrunique[] = new String[setunique.size()];
	        setunique.toArray(arrunique);
	        System.out.println("\n..............The set converted to array ....... "+Arrays.toString(arrunique)); 
	        System.out.println("\n..............The set converted to array ....... "+arrunique.length); 
	        
	        
	        for(int p = 0; p < arrunique.length; p++) {
	        	arrunique[p]=arrunique[p].replace(" ", "");
	        	arrunique[p]=arrunique[p].replace(":", "");
	        	arrunique[p]=arrunique[p].replace(";", "");
	        	arrunique[p]=arrunique[p].replace("'s", "");
	        }
	        
	        System.out.println("\n..............The array after some exclusions for serach....... "+Arrays.toString(arrunique));
	        System.out.println("\n..............The array after some exclusions for serach....... "+arrunique.length);
	        HashMap<String, Integer> timesap = new HashMap<String, Integer>();
	        
	        for( int l = 0; l < arrunique.length && l<100; l++ ){  
	        	
	        	 int counttimes = 0;
	        	
	        	for(int k =0; k < wordsarray.length; k++)
	        	{
	        		//System.out.println("the value of  arrunique "+ arrunique[l]);
	        		//System.out.println("the value of  wordsarray "+ wordsarray[k]));
	        	//if(wordsarray[k].arrunique[l]);
	        	//{
	        	
	        	boolean isFound = wordsarray[k].indexOf(arrunique[l]) !=-1? true: false ; //true
	        	if(isFound==true) {
	        		counttimes=counttimes+1;	
	        	}
	        	//}
	        		
	        	}
	        	timesap.put(arrunique[l], counttimes);
	        	
	        	
	        }
	        
	        System.out.println("\n..............The number of times is...... "+timesap); 
	        System.out.println("\n..............The number of times is  length......."+timesap.size()); 
	        
		 }
		 
		 
	        else
	 
	        {   // Print statements
	            System.out.println("\n.............. No command line " + "arguments found................\n");
	    }
	        

	}

}
