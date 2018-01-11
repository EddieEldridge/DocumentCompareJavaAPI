package ie.gmit.sw;

import java.util.Scanner;

public class Menu {
	
	public static void prompt(){
		
		// Header
        System.out.println("========================");
        System.out.println("Document Comparison API");
        System.out.println("========================");
        
        // Scanner for user input
		Scanner scanner = new Scanner(System.in);

		 // Local variables
		int shingleSize;
		boolean exit = false;
	    String file1String;
	    String file2String;
	    
	    // Prompt user to enter shingle size
	    System.out.println("Please enter the size of of the shingle: ");
	    shingleSize = scanner.nextInt();
	    
		// Prompt user to enter the filenames
		System.out.println("Please enter the filename of file 1 (.txt): ");
		file1String = ("resources/" + scanner.next() +".txt");

		System.out.println("Please enter the filename of file 2: ");
		file2String = ("resources/" + scanner.next() +".txt");
		
        Compare.compareDocs(file1String, file2String);

	}
	  
			
}
