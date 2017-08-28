/* Max Rink
 * ICS4U
 * February 2 2016
 * Assignment.java
 * reads and displays the contents of a file
 */
package Unit4.Project3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment {
	public static void main(String args[]) {
		File textFile = new File("res/Assignment.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		try {
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			try {
				while ((lineOfText = readFile.readLine()) != null) {
					System.out.println(lineOfText);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				readFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}

	}
}