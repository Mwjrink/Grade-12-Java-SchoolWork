/* Max Rink
 * ICS4U
 * February 2 2016
 * StudentRoster.java
 * stores students names in an array
 */
package Unit2.Project01;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many students are there in the class? ");
		int num = input.nextInt();

		String[] nam = new String[num];

		for (int i = 0; i < nam.length; i++) {
			System.out.println("What is the " + i + " person in the class called?");
			nam[i] = input.next();
		}

		for (int i = 0; i < nam.length; i++) {
			System.out.println(nam[i]);
		}

	}

}
