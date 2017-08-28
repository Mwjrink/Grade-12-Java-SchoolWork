/* Max Rink
 * ICS4U
 * February 2 2016
 * Stats.java
 * reads scores from a .dat file
 */
package Unit4.Project4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Stats {

	public static void main(String[] args) {
		File file = new File("res/test1.dat");
		ArrayList<Student> studs = new ArrayList<Student>();
		FileReader in;
		int average = 0;
		try {
			in = new FileReader(file);
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
