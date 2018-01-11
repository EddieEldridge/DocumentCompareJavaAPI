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
	        
	        // Call our compareDocs function
	        Compare.compareDocs();
	       
	        
	   }
	 
}
