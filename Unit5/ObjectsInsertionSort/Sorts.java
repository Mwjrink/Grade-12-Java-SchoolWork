/* Max Rink
 * ICS4U
 * February 2 2016
 * Sorts.java
 * the sorting algorithms
 */
package Unit5.Project02;

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

	/**
	 * Sorts an array of integer from low to high pre: none post: Integers have
	 * been sorted from low to high
	 */

	public static void insertionSort(String[] items) {
		//String[] items = Arrays.copyOf(its, its.length, String[].class);
		String temp;
		int previousIndex;
		for (int index = 1; index < items.length; index++) {
			temp = items[index];
			previousIndex = index - 1;
			while ((items[previousIndex].length() > temp.length()) && (previousIndex > 0)) {
				items[previousIndex + 1] = items[previousIndex];
				previousIndex -= 1; // decrease index to compare //current item
									// with next
				// previous item
			}
			if (items[previousIndex].length() > temp.length()) {
				/* shift item in first element up into next element */ items[previousIndex + 1] = items[previousIndex];
				/* place current item at index 0 (first element) */
				items[previousIndex] = temp;
			} else {
				/*
				 * place current item at index ahead of previous item
				 */
				items[previousIndex + 1] = temp;
			}
		}
	}

}
