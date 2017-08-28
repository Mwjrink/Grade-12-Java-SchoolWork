/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Searches.java
 * 	Contains many different search algorithms
 */
package Unit5.Unit5Assignment;

import java.util.Arrays;

public class Searches {
	//random data for tests
	static int[] arr = {5,2,5,4,5,8,5,5,4,5,5,852,14,2,5,45,46,5,51,564,51,54,1,54,31,54,52,156,4,3514,546,545,1,3541,351,654,32,165,4135,465,13,54,51,56,456,465,456,46,516,846,51,984,35,168,864,65,46};
	/**
	 * Searches items array for goal pre: items is sorted from low to high post:
	 * Position of goal has been returned, or -1 has been returned if goal not
	 * found.
	 */
	
	/* the main method to test the code
	 * Pre: takes in an array of strings argument
	 * Post: does not return anything
	 */
	public static void main(String[] args){ //tests the search algorithm
		quickSort(arr, 0, arr.length-1); //sort the data
		/*
		for(int i=0; i<arr.length; i++){
			System.out.print(i + " ");
			System.out.println(arr[i]);
		}
		*/
		int foo = interpolationSearch(arr, 156);
		
		System.out.println("\n" + arr[foo] + " has been found at position " + foo + " using interpolation search");
	}
	
	/* a method to search for an integer in an array
	 * Pre: takes in an array of integers and the integer the method is searching for
	 * Post: returns the location of the integer
	 */
	public static int interpolationSearch(int[] arr, int goal){ //the search algorithm
		
		
		double examine = ((double)(goal-arr[0])/(double)(arr[arr.length-1] - arr[0])); //determine location to check by percentage
		//System.out.println(examine);
		
		int index = (int)(arr.length*examine-1); //get the index using the percentage
		
		int begin, end; //set the beginning and ending variables
		int[] subarr; //create a sub array
		if(arr[index] == goal){ //return index if the goal was found
			return index;
		} else {
			if(arr[index] > goal){ //if the found variable is greater create a sub array beneath the current array
				begin = 0;
				end = index;
				subarr = Arrays.copyOfRange(arr, begin, end);
			} else { //if the found variable is lesser create a sub array above the current array
				begin = index;
				end = arr.length-1;
				subarr = Arrays.copyOfRange(arr, begin, end);
			}
			//System.out.println(subarr.length);
			return interpolationSearch(subarr, goal)+begin; //return the found variable added to the beginning index of the array
		}
	}
	
	/* a method for partitioning the array in order to sort it
	 * Pre: takes in the array and the left most and right most values
	 * Post: returns the left most value
	 */
	static int partition(int arr[], int left, int right) { //partitions for the sort algorithm
	      int l = left, r = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (l <= r) {
	            while (arr[l] < pivot)
	                  l++;
	            while (arr[r] > pivot)
	                  r--;
	            if (l <= r) {
	                  tmp = arr[l];
	                  arr[l] = arr[r];
	                  arr[r] = tmp;
	                  l++;
	                  r--;
	            }
	      };
	     
	      return l;
	}
	
	/* a method for sorting the array using the quicksort algorithm
	 * Pre: takes in an array to be sorted and the left most and right most values
	 * Post: returns nothing
	 */
	static void quickSort(int arr[], int left, int right) { //sort algorithm
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1); //call self on new partition
	      if (index < right)
	            quickSort(arr, index, right); //call self on new partition
	}
}
