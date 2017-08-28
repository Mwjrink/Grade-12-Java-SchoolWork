/* Max Rink
 * ICS4U
 * February 2 2016
 * CountLetter.java
 * counts letters in a phrase
 */
package Unit2.Project07;

import java.util.Scanner;

public class CountLetter {
	public static void main(String[] args) {
		final int LOW = 'A'; // smallest possible value
		final int HIGH = 'Z'; // highest possible value
		int[] letterCounts = new int[HIGH - LOW + 1];
		Scanner input = new Scanner(System.in);
		String sentence;
		char[] wordLetters;
		int offset; // array index

		/* prompt user for a word */
		System.out.print("Enter a sentence: ");
		sentence = input.nextLine();
		
		sentence = sentence.replaceAll("\\s","");
		
		/* convert word to char array and count letter occurrences */
		sentence = sentence.toUpperCase();
		wordLetters = sentence.toCharArray();
		for (int letter = 0; letter < wordLetters.length; letter++) {
			offset = wordLetters[letter] - LOW;
			letterCounts[offset] += 1;
		}

		/* show letter occurrences */
		for (int i = LOW; i <= HIGH; i++) {
			System.out.println((char) i + ": " + letterCounts[i - LOW]);
		}
	}
}