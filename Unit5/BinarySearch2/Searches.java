/* Max Rink
 * ICS4U
 * February 2 2016
 * Searches.java
 * searching algorithms
 */
package Unit5.Project07;

public class Searches {

	/**
	 * Searches items array for goal pre: items is sorted from low to high post:
	 * Position of goal has been returned, or -1 has been returned if goal not
	 * found.
	 */
	public static int binarySearch(int[] items, int start, int end, int goal) {
		do {
			if (start > end) {
				return (-1);
			} else {
				int mid = (start + end) / 2;
				System.out.println("Examining " + mid);
				if (goal == items[mid]) {
					return (mid);
				} else if (goal < items[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		} while (true);
	}
}
