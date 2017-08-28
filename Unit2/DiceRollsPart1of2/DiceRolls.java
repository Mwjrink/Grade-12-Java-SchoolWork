/* Max Rink
 * ICS4U
 * February 2 2016
 * DiceRolls.java
 * determines the outcomes of rolling 3 dice
 */
package Unit2.Project04;

import java.util.Scanner;
import java.lang.Math;

public class DiceRolls {
	public static void main(String[] args) {
		int[] outcomes = new int[19];
		Scanner input = new Scanner(System.in);
		int numRolls;
		int outcome;

		/* prompt user for number of rolls */
		System.out.print("How many rolls? ");
		numRolls = input.nextInt();

		/* roll dice and add to outcomes */
		for (int roll = 0; roll < numRolls; roll++) {
			outcome = (int) (6 * Math.random() + 1) + (int) (6 * Math.random() + 1) + (int) (6 * Math.random() + 1);
			outcomes[outcome] += 1;
		}

		/* show counts of outcomes */
		for (int i = 3; i <= 18; i++) {
			System.out.println(i + ": " + outcomes[i]);

		}
	}
}
