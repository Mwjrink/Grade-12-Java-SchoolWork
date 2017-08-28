/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	TestDisk.java
 * 	tests the code in the other classes
 */
package Unit1.PuckPart2of2;

/**
 * The Circle class is tested.
 */
public class TestDisk {
	public static void main(String[] args) {
		Puck spot1 = new Puck(3, 2, 5);
		Puck spot2 = new Puck(4, 3, 5);
		if (spot1.compareTo(spot2) == 0) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("not equal");
		}
		System.out.println(spot1);
		System.out.println(spot2);
	}
}
