/* Max Rink
 * ICS4U
 * February 2 2016
 * Searches.java
 * searching algorithms
 */
package Unit5.Project06;

public class Searches {

	/**
	 * Searches items array for goal pre: items is sorted from low to high post:
	 * Position of goal has been returned, or -1 has been returned if goal not
	 * found.
	 */
	public static int binarySearch(String[] items, int start, int end, String goal) {
		if (start > end) {
			return (-1);
		} else {
			int mid = (start + end) / 2;
			System.out.println("Examining " + mid);
			if (goal.equals(items[mid])) {
				return (mid);
			} else if (goal.length() < items[mid].length()) {
				return (binarySearch(items, start, mid - 1, goal));
			} else {
				return (binarySearch(items, mid + 1, end, goal));
			}
		}
	}
}
