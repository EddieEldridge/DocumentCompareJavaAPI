package ie.gmit.sw;

import java.io.File;

public class Threader {
	
	
// Pass our two files into a function
// They will be both run in two seperate threads 
static void threads(File file1, File file2) {
		
		Thread t1 = new Thread();
		t1.start();
		
		Thread t2 = new Thread();
		t2.start();
	} // threads
}
