/* Max Rink
 * ICS4U
 * February 2 2016
 * MyFile.java
 * creates a file then either keeps or deletes it
 */
package Unit4.Project2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
	
	public static void main(String args[]){
		File file = new File("C:/ZZZ.txt");
		Scanner input = new Scanner(System.in);
		try {
			file.createNewFile();
			System.out.println("ZZZ.txt has been created");
			System.out.println("keep [K] or delete[d] the file?");
			String in = input.next();
			if(in.equalsIgnoreCase("k")){
				return;
			} else {
				file.delete();
				System.out.println("file has successfully been deleted");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
