import java.util.HashMap;
import java.util.Arrays ;

/**
 * 
 */

/**
 * @author Katha.Chowdhury
 *
 */
public class DigitCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 System.out.println(".........DigitCounter  started .............\n");
		 
		 if (args.length > 0) {
		 
		 System.out.println("\n....  The starting number of the number series :" + args[0]);
		
		 System.out.println("\n.... The ending number of the number series :" + args[1]);
		
		 System.out.println("\n....  The a comma delimited list of digits.:"  + args[2]);
		 
		 int startint=Integer.parseInt(args[0]);
		 int endint=Integer.parseInt(args[1]);
		 HashMap<String, Integer> timesap = new HashMap<String, Integer>();
		 
		 
		 if(args[2]!=null) {
			 
			 String str[] = args[2].split(",");
			 System.out.println("\n....  The values of the digits are ........"  +Arrays.toString(str));
			 
			 for(int j=0;j< str.length;j++) {
			 
				 int counttimes = 0;
				 
			 for(int i=startint;i<=endint;i++){
				 String strrvalue=Integer.toString(i);
				 
				 
				
				 for (int k = 0; k < strrvalue.length(); k++) {
					    if (strrvalue.charAt(k) == str[j].charAt(0)) {
					    	counttimes++;
					    }
					}
				 			 	 
				
			 }
		       
			 timesap.put(str[j],counttimes) ;
		
		 
		 }
			 
		 }
		 
		 System.out.println("\n................The number of times is "+timesap);
		 
		 }
		 
		 
	        else
	 
	        {   // Print statements
	            System.out.println("\n .......................No command line " + "arguments found...................\n");
	    }
		 

	}

}
