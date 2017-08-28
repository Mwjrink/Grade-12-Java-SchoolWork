/* Max Rink
 * ICS4U
 * February 2 2016
 * Sorts.java
 * sorting algorithms
 */
package Unit5.Project01;

import java.util.ArrayList;

public class Sorts {

	/**
	 * Sorts an array of data from low to high pre: none post: items has been
	 * sorted from low to high
	 */

	public static void selectionSort(ArrayList<Double> items) {
		for (int index = 0; index < items.size(); index++) {
			for (int subIndex = index; subIndex < items.size(); subIndex++) {
				if (items.get(subIndex) < items.get(index)) {
					double temp = items.get(index);
					items.set(index, items.get(subIndex));
					items.set(subIndex, temp);
				}
			}
		}
	}
}
