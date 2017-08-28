/* Max Rink
 * ICS4U
 * February 2 2016
 * Roster.java
 * gets students names and writes them to a file
 */
package Unit4.Project6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Unit4.Project5.Student;

public class Roster {

	public static void main(String[] args) {
		ArrayList<StuName> studs = new ArrayList<StuName>();
		FileReader in;
		Scanner input = new Scanner(System.in);
		int nums;
		System.out.println("What is the name of the file? ");
		String nam = input.next();
		File file = new File("res/" + nam + ".dat");
		try {
			file.createNewFile();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		File f = new File("res/" + nam + ".dat");
		System.out.println("How many students in the class ");
		nums = input.nextInt();
		BufferedWriter bw;
		
		FileWriter fr;
		try {
			fr = new FileWriter(f);
			bw = new BufferedWriter(fr);
			
			for(int i=0;i<nums;i++){
				String first, last;
				System.out.println("Students first name: ");
				first = input.next();
				System.out.println(first + "'s last name: ");
				last = input.next();
				bw.write(first);
				bw.newLine();
				bw.write(last);
				bw.newLine();
			}
			bw.close();
			fr.close();
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		File f1 = new File("res/" + nam + ".dat");
		try {
			in = new FileReader(f1);
			BufferedReader br = new BufferedReader(in);

			String name;
			String last;

			try {
				while ((name = br.readLine()) != null) {
					last = br.readLine();
					studs.add(new StuName(name, last));
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		StuName[] stu = new StuName[studs.size()];
		stu = studs.toArray(stu);

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
		input.close();

	}
}
