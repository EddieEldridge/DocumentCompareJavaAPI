package ie.gmit.sw;

import java.util.*;

public class Runner {
	
	 public static void main(String[] args) {
		 	
		 	// Header
	        System.out.println("========================");
	        System.out.println("Document Comparison API");
	        System.out.println("========================");
	        
	        // Import scanner to read our file names from user
			Scanner scanner = new Scanner(System.in);
			
	        // Local variables
	        boolean exit = false;
	        String file1;
	        String file2;
	        
	        // Menu
	        do
	        {  
	        	// Prompt user to enter the filenames
	        	System.out.println("Please enter the filename of file 1: ");
	        	file1 = scanner.nextLine();
	        	//System.out.println(file1);
	        	
	        	System.out.println("Please enter the filename of file 2: ");
	        	file2 = scanner.nextLine();
	        	//System.out.println(file2);
	        	
	        }while(exit!=false);  
	       
	        
	    }
	 
}
