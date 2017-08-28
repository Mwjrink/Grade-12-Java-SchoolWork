/* Max Rink
 * ICS4U
 * February 2 2016
 * MyFile.java
 * checks whether or not a file exists
 */
package Unit4.Project1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the file: ");
		String name = input.next();
		File file = new File(name);
		if(file.exists()){
			System.out.println("file exists");
		} else {
			System.out.println("file does not exist");
		}
	}
}
