/* Max Rink
 * ICS4U
 * February 2 2016
 * Sorts.java
 * sorting algorithms
 */
package Unit5.Project04;

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
		// String[] items = Arrays.copyOf(its, its.length, String[].class);
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

	private static void merge(String[] items, int start, int mid, int end) {
		String[] temp = new String[items.length];
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;

		while (!(pos1 > mid && pos2 > end)) {
			if ((pos1 > mid) || ((pos2 <= end) && (items[pos2].length() < items[pos1].length()))) {
				temp[spot] = items[pos2];
				pos2 += 1;
			} else {
				temp[spot] = items[pos1];
				pos1 += 1;
			}
			spot += 1;
		}

		/* copy values from temp back to items */
		for (int i = start; i <= end; i++) {
			items[i] = temp[i];
		}
	}

	/**
	 * Sorts items [start .. end] pre: start > 0, end > 0 post: items[start ..
	 * end] is sorted low to high
	 */

	public static void mergesort(String[] items, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(items, start, mid);
			mergesort(items, mid + 1, end);
			merge(items, start, mid, end);
		}
	}

}
