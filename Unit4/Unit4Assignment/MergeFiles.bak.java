/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	MergeFiles.java
 * 	Opens two files then merges them
 */
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class MergeFiles {
	
	/* This is the main method
	 * pre: take in a string array as the argument 
	 * post: returns nothing as it is void
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //open the input scanner
		String file1, file2, file3; //create the file names
		System.out.print("Please specify the directory of the first file you would like to merge: ");
		file1 = input.next();
		System.out.print("Please specify the directory of the second file you would like to merge: ");
		file2 = input.next();
		System.out.print("Please specify the directory of the file you would like to create: ");
		file3 = input.next();
		combine(new File(file1), new File(file2), new File(file3));
	}
	/* This method combines 2 files into a third file
	 * pre: take in 3 file arguments 
	 * post: returns nothing as it is void
	 */
	static void combine(File fl1, File fl2, File fl3){
		String file3 = "";
		BufferedWriter bw3;
		int one=0, two=0;
		try {
			//open a scanner for the files
			Scanner scan1 = new Scanner(fl1);
			Scanner scan2 = new Scanner(fl2);
			//set the delimiters for the scanners
			scan1.useDelimiter(Pattern.compile(" "));
			scan2.useDelimiter(Pattern.compile(" "));
			//create the third file
			fl3.createNewFile();
			FileWriter fw3 = new FileWriter(fl3);
			bw3 = new BufferedWriter(fw3);
			one = scan1.nextInt(); //scan integer from file one
			two = scan2.nextInt(); //scan integer from file two
			while(scan1.hasNextInt() || scan2.hasNextInt()){ //while not at end of files
				file3 += (one <= two) ? (one + " ") : (two + " ");
				if(one <= two){
					one = (scan1.hasNextInt()) ? scan1.nextInt() : Integer.MAX_VALUE; 
					//ternary operator id statement
				}
				else{
					two = (scan2.hasNextInt()) ? scan2.nextInt() : Integer.MAX_VALUE; 
					//ternary operator if statement
				}
			}
			//ternary operator if statement
			file3 += (one <= two) ? (one + " ") : (two + " ");
			bw3.write(file3); 
			//write to file
			bw3.close(); 
			//close writer
			fw3.close(); 
			//close writer
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
			//print the error to the screen
		} catch (IOException e) {
			e.printStackTrace();
			//print the error to the screen
		}
	}
}

/*
C:\Users\Guest\Desktop\file1.txt
C:\Users\Guest\Desktop\file2.txt
C:\Users\Guest\Desktop\file3.txt


*/