package ie.gmit.sw;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Menu {
	
	public static void prompt() throws IOException{
		
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
	    char response;
	    
	    // Prompt user to enter shingle size
	    System.out.println("Please enter the size of of the shingle: ");
	    shingleSize = scanner.nextInt();
	    
		// Prompt user to enter the filenames
		System.out.println("Please enter the filename of file 1 (.txt): ");
		file1String = ("resources/" + scanner.next() +".txt");

		System.out.println("Please enter the filename of file 2: ");
		file2String = ("resources/" + scanner.next() +".txt");
		
		// Prompt user to decide if they want to verify that they have selected the correct files
		System.out.println("Would you like to verify the contents the files? (Y/N)");
		response = scanner.next().charAt(0);
		
		// Pass the paths of our files to our FileParser class
		//FileParser fileID1 = new FileParser(file1String);
		//FileParser fileID2 = new FileParser(file2String);

		// Create a blocking queue to store our shingles in
		BlockingQueue<Shingle> shingleQueue = new LinkedBlockingDeque<>();

		
		// Menu if the user wants to verify that their files have been read in correctly
		if(response=='Y' || response=='y')
		{
			FileParser.byteSize(file1String, file2String);
		}
		else if(response=='N' || response=='n')
		{	
	        FileParser.parseFile(file1String, file2String);
		}
	

	}
	  
			
}
