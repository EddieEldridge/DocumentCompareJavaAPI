package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Runner {
	
	/**
	 * Run our menu for user input
	 *
	 * @throws IOException If an I/O error occurs.
	 */
	public static void main(String[] args) throws IOException {
		// Call our menu function
		Menu.prompt();
	}

}
