/* Max Rink
 * ICS4U
 * February 2 2016
 * Search.java
 * fill an array with grades then determine the highest one
 */
package Unit2.Project09;

public class Search {
	/**
	 * Returns the index of the element numToFind. -1 returned if element not
	 * found. pre: none post: index of numToFind has been returned. -1 has been
	 * returned if element not found.
	 */
	public static int linear(int[] array, int numToFind) {
		int index = 0;
		while ((array[index] != numToFind) && (index < array.length - 1)) {
			index += 1;
		}

		if (array[index] == numToFind) {
			return (index);
		} else {
			return (-1);
		}
	}

	public static int linear(String[] arr, String look) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(look)){
				return i;
			}
		}

		return -1;
	}

}
