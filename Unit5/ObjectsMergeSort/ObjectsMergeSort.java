/* Max Rink
 * ICS4U
 * February 2 2016
 * ObjectsMergeSort.java
 * tests a new sorting algorithms
 */
package Unit5.Project04;


public class ObjectsMergeSort {
	public static void main(String[] args) {
		String text = "Create an ObjectsInsertionSort application that implements an insertion sort on an array of objects. Test the sort on an array of String objects.";
		String[] arr = text.split(" ");

		Sorts.mergesort(arr, 0, arr.length-1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
