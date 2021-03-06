/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Music.java
 * 	Tests the other classes
 */
package Unit1.MusicPart1of2;

/* 
* Music.java 
*/
import java.util.Scanner;

public class Music {
	/*
	 * Returns a selected instrument. pre: none post: An instrument object has
	 * been returned.
	 */
	public static Instrument assignInstrument() {
		String instrumentChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Select an instrument for the band member. ");
		System.out.print("Vocals, Piccolo, or Clarinet: ");
		instrumentChoice = input.nextLine();
		System.out.print("Enter the band member's name: ");
		String name = input.nextLine();
		if (instrumentChoice.equalsIgnoreCase("V")) {
			return (new Vocal(name));
		} else if (instrumentChoice.equalsIgnoreCase("P")) {
			return (new Piccolo(name));
		} else { // default to clarinet
			return (new Clarinet(name));
		}
	}

	public static void main(String[] args) {
		Performance band;
		Instrument bandMember1, bandMember2, bandMember3;
		Scanner input = new Scanner(System.in);
		String performanceChoice;
		/* assign instruments */
		bandMember1 = assignInstrument();
		bandMember2 = assignInstrument();
		bandMember3 = assignInstrument();
		System.out.println(bandMember1 + " " + bandMember2 + " " + bandMember3 + "\n");
		System.out.print("Would you like to hear a Solo, a Duet, a Trio, or Leave? ");
		performanceChoice = input.nextLine();
		while (!performanceChoice.equalsIgnoreCase("L")) {
			if (performanceChoice.equalsIgnoreCase("S")) {
				band = new Performance(bandMember1);
			} else if (performanceChoice.equalsIgnoreCase("D")) {
				band = new Performance(bandMember1, bandMember2);
			} else // default to trio
			{
				band = new Performance(bandMember1, bandMember2, bandMember3);
			}
			band.begin();

			System.out.print(" \nWould you like to hear a Solo, a Duet, a Trio, or Leave? ");
			performanceChoice = input.nextLine();
		}
	}
}
