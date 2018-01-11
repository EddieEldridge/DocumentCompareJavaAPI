package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileParser {

	/**
	 * Prints the fileName, it's location and the number of bytes in the file
	**/
	public static void byteSize(String file1String, String file2String) {

		// Local variables
		boolean exit = false;

		// File variables
		File file1 = new File(file1String);
		File file2 = new File(file2String);

		// Print bytes for each file
		do {
			// File 1
			// Print out the number of bytes in the file
			// This will help the user confirm that their file has been read in
			// correctly and that it is the correct file
			try (FileInputStream fileInputStream1 = new FileInputStream(file1)) {

				System.out.println("========================================================================");
				System.out.println(file1String);
				System.out.println("Total file size to read (in bytes) : " + fileInputStream1.available());
				System.out.println("========================================================================");

				// Print the contents of a file
				/*
				 * int content; while ((content = fileInputStream1.read()) !=
				 * -1) { // convert to char and display it
				 * System.out.print((char) content); }
				 */

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("The file could not be read correctly.");
			}

			// File 2
			// Print out the number of bytes in the file
			// This will help the user confirm that their file has been read in
			// correctly and that it is the correct file
			try (FileInputStream fileInputStream2 = new FileInputStream(file2)) {

				System.out.println("========================================================================");
				System.out.println(file2String);
				System.out.println("Total file size to read (in bytes) : " + fileInputStream2.available());
				System.out.println("========================================================================");

				// Print the contents of a file
				/*
				 * int content; while ((content = fileInputStream1.read()) !=
				 * -1) { // convert to char and display it
				 * System.out.print((char) content); }
				 */

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("The file could not be read correctly.");
			}

		} while (exit != false);

		// FileParser.FileParser(file1, file2);
		// Threader.threads(file1, file2);
	}
	
	/**
	 * Attempts to parse the file, adding each words to a variable called fileContents
	**/
	public static void parseFile(String file1String, String file2String) throws IOException {

		String fileContents;

		// Reader to read in our file
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1String)));

		// String builder to store contents of file in a string
		StringBuilder stringBuilder = new StringBuilder();

		// Store each line in a string so it can be appended to our fileConents
		// variable
		String perLine;

		// While there are still lines to read by the buffereReader
		while ((perLine = bufferedReader.readLine()) != null) {
			// Append our fileConents variable with the contents of perLine(each
			// line of the file)
			stringBuilder.append(perLine);
		}
		fileContents = stringBuilder.toString();
		// System.out.println(fileContents);
	}
	
	/**
	 * Splits the words every time a space is encountered and returns a string Array of words called words containing every word in the file
	**/
	public static String[] getWords(String fileContents) {
		String[] words;

		// Split the words every time a space is encountered
		return words = fileContents.split(" ");

	}

}
