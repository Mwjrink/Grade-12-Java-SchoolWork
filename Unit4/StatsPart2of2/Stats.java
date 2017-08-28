/* Max Rink
 * ICS4U
 * February 2 2016
 * Stats.java
 * gets scores and writes them to a file
 */
package Unit4.Project5;

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

public class Stats {

	public static void main(String[] args) {
		ArrayList<Student> studs = new ArrayList<Student>();
		FileReader in;
		Scanner input = new Scanner(System.in);
		int average = 0;
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
				int score;
				String anem;
				System.out.println("Students name: ");
				anem = input.next();
				System.out.println(anem + "'s score: ");
				score = input.nextInt();
				bw.write(anem);
				bw.newLine();
				bw.write(Integer.toString(score));
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
			int score;

			try {
				while ((name = br.readLine()) != null) {
					score = Integer.parseInt(br.readLine());
					studs.add(new Student(name, score));
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		Student[] stu = new Student[studs.size()];
		stu = studs.toArray(stu);

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
			average += stu[i].getTestScore();
		}

		Collections.sort(studs, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int x, y;
				x = o1.getTestScore();
				y = o2.getTestScore();
				return Integer.compare(x, y);
			}
		});

		System.out.println("The average test score is " + average/stu.length);
		System.out.println("The maximum test score is " + stu[0]);
		System.out.println("The minmum test score is " + stu[stu.length-1]);
	}
}
