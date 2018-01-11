package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Compare 
{
	  
	public static void compareDocs(String file1String, String file2String)
	{
		// Import scanner/bufferereader to read our file names from user
		FileInputStream fileInputStream = null;
		BufferedReader bufferedReader = null;
		      	
	    // Local variables
		int shingleSize;
		boolean exit = false;
	    
		 // File variables
		File file1 = new File(file1String);
		File file2 = new File(file2String);
		
	    // Print bytes for each file
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
				System.out.println("The file could not be read correctly.");
			}
	    	
	    	// File 2
	    	// Print out the number of bytes in the file
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
				System.out.println("The file could not be read correctly.");
			}
	    	
	    }while(exit!=false); 
	    
	}// compareDocs
	
	private static void threads(File file1, File file2) {
		
		Thread t1 = new Thread((Runnable) file1);
		t1.start();
		
		Thread t2 = new Thread((Runnable) file2);
		t2.start();
	} // threads
	
}
	
