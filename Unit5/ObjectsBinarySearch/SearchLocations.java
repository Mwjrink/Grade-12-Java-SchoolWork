/* Max Rink
 * ICS4U
 * February 2 2016
 * SearchLocations.java
 * searches for a number
 */
package Unit5.Project06;

import java.util.Scanner;

public class SearchLocations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String goal;
		String text = "Review: ObjectsBinarySearch Create an ObjectsBinarySearch application that implements a binary search on an array of objects. Test the search on an array of String objects. ";
		String[] arr = text.split(" ");
		System.out.println(text);
		do {
			System.out.println("Enter a string to search for, [0] to quit: ");
			goal = input.next();
			if(!goal.equals("0"))
				System.out.println("Number at position: " + Searches.binarySearch(arr, 0, arr.length - 1, goal));
		} while (!goal.equals("0"));
		input.close();
	}
}
