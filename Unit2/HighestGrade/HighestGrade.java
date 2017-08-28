/* Max Rink
 * ICS4U
 * February 2 2016
 * HighestGrade.java
 * fill an array then search it
 */
package Unit2.Project10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HighestGrade {
	public static void main(String args[]){
		ArrayList<Integer> grades = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.println("enter a grade between and 100: ");
			grades.add(input.nextInt());
		}
		
		Collections.reverse(grades);
		System.out.println(grades.get(0));
	}
}
