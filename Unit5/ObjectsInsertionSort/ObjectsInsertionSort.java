/* Max Rink
 * ICS4U
 * February 2 2016
 * ObjectsInsertionSort.java
 * a new sorting algorithm
 */
package Unit5.Project02;

public class ObjectsInsertionSort {
	public static void main(String[] args){
		String text = "Create an ObjectsInsertionSort application that implements an insertion sort on an array of objects. Test the sort on an array of String objects.";
		String[] arr = text.split(" ");
		
		Sorts.insertionSort(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}
