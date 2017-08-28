/* Max Rink
 * ICS4U
 * February 2 2016
 * BinarySearch2.java
 * a new sorting algorithm
 */
package Unit5.Project07;

import java.util.Scanner;

public class BinarySearch2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int goal;
		int[] arr = { 1, 4, 4, 7, 10, 13, 16, 24, 24, 25, 27, 27, 30, 30, 30, 49, 50, 51, 52, 53, 54, 54, 55, 57, 58,
				64, 69, 74, 78, 79, 85, 86, 86, 88, 89, 96, 96, 97, 98 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		do {
			System.out.println("Enter a number to search for, [0] to quit: ");
			goal = input.nextInt();
			if (goal != 0)
				System.out.println("Number at position: " + Searches.binarySearch(arr, 0, arr.length - 1, goal));
		} while (goal != 0);
		input.close();
	}
}
