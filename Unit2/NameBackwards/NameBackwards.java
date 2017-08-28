/* Max Rink
 * ICS4U
 * February 2 2016
 * NameBackwards.java
 * outputs a name backwards
 */
package Unit2.Project08;

import java.util.Scanner;

public class NameBackwards {
	public static void main(String[] args) {
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}
}
