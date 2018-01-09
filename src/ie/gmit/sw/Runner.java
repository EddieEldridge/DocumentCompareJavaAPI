package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Runner {
	
	 public static void main(String[] args)
	 {
		 	
		 	// Header
	        System.out.println("========================");
	        System.out.println("Document Comparison API");
	        System.out.println("========================");
	        
	       
	       
	    	// Import scanner/bufferereader to read our file names from user
			FileInputStream fileInputStream = null;
			Scanner scanner = new Scanner(System.in);
			BufferedReader bufferedReader = null;
			      	
	        // Local variables
	        boolean exit = false;
	        String file1String;
	        String file2String;
	        
	    	// Prompt user to enter the filenames
        	System.out.println("Please enter the filename of file 1 (.txt): ");
        	file1String = ("resources/" + scanner.next() +".txt");

        	System.out.println("Please enter the filename of file 2: ");
        	file2String = ("resources/" + scanner.next() +".txt");
        	
        	 // File variables
	    	File file1 = new File(file1String);
	    	File file2 = new File(file2String);
	    	
	        // Menu
	        do
	        {  
	        	// File 1
	        	// Print out the number of bytes in the file
	        	// This will help the user confirm that their file has been read in correctly and that it is the correct file
	        	try (FileInputStream fileInputStream1 = new FileInputStream(file1)) {
	        		
	        		System.out.println("========================================================================");
	        		System.out.println(file1String);
	    			System.out.println("Total file size to read (in bytes) : "+ fileInputStream1.available());
	        		System.out.println("========================================================================");

	    			// Print the contents of a file
	    			/*
	    			int content;
	    			while ((content = fileInputStream1.read()) != -1) {
	    				// convert to char and display it
	    				System.out.print((char) content);
	    			}
	    			*/

	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	        	
	        	// File 2
	        	//  Print out the number of bytes in the file
	        	// This will help the user confirm that their file has been read in correctly and that it is the correct file
	        	try (FileInputStream fileInputStream2 = new FileInputStream(file2)) {
	        		
	        		System.out.println("========================================================================");
	        		System.out.println(file2String);
	    			System.out.println("Total file size to read (in bytes) : "+ fileInputStream2.available());
	        		System.out.println("========================================================================");

	    			// Print the contents of a file
	    			/*
	    			int content;
	    			while ((content = fileInputStream1.read()) != -1) {
	    				// convert to char and display it
	    				System.out.print((char) content);
	    			}
	    			*/

	    		} catch (IOException e) {
	    			e.printStackTrace();
	    		}
	        	
	        }while(exit!=false);  
	       
	        
	   }
	 
}
