/* Max Rink
 * ICS4U
 * February 2 2016
 * DiceRolls.java
 * outcomes of dicerols with more customizability
 */
package Unit2.Project05;

import java.util.Scanner;
import java.lang.Math;

public class DiceRolls {
	public static void main(String[] args) {
		int[] outcomes;
		Scanner input = new Scanner(System.in);
		int numRolls, numDice, numSides;
		int outcome;

		/* prompt user for number of rolls */
		System.out.print("How many rolls? ");
		numRolls = input.nextInt();
		System.out.print("How many dice? ");
		numDice = input.nextInt();
		System.out.print("How many sides on the dice? ");
		numSides = input.nextInt();
		
		outcomes = new int[(numDice*numSides)+1];

		/* roll dice and add to outcomes */
		for (int roll = 0; roll < numRolls; roll++) {
			outcome = (int) (6 * Math.random() + 1)*numDice;
			outcomes[outcome] += 1;
		}

		/* show counts of outcomes */
		for (int i = numDice; i < outcomes.length; i++) {
			System.out.println(i + ": " + outcomes[i]);

		}
	}
}
