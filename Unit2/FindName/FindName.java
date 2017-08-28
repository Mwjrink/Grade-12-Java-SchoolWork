/* Max Rink
 * ICS4U
 * February 2 2016
 * FindName.java
 * searches an array for a name
 */
package Unit2.Project09;

import java.util.Scanner;

public class FindName {

	public static void main(String args[]) {
		Search search = new Search();
		Scanner input = new Scanner(System.in);
		String[] arr = new String[10];
		String look;
		for (int i = 0; i < 10; i++) {
			System.out.println("enter name " + (i+1) + ": ");
			arr[i] = input.next();
		}
		
		System.out.println("enter name to search for: ");
		look = input.next();
		
		System.out.println(search.linear(arr, look));
	}

}
