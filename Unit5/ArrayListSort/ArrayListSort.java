/* Max Rink
 * ICS4U
 * February 2 2016
 * ArrayListSort.java
 * sorts an arraylist
 */
package Unit5.Project01;

import java.util.ArrayList;

public class ArrayListSort {
	
	public static void main(String[] args){
		ArrayList<Double> arr = new ArrayList<Double>();
		
		for(int i=0;i<100;i++){
			arr.add(Math.random()*1000);
		}

		Sorts.selectionSort(arr);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	}
	
}
