/* Max Rink
 * ICS4U
 * February 2 2016
 * NumberCount.java
 * counts the occurence of the digits in a number
 */
package Unit2.Project06;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		int[] num;
		String temp;
		Scanner input = new Scanner(System.in);

		System.out.print("Input an absurdly large number please: ");
		temp = input.next();

		int[] gg = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			gg[i] = temp.charAt(i) - '0';
		}
		

		num = new int[10];
		for (int i = 0; i < gg.length; i++) {
			num[gg[i]]++;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);

		}
	}
}
