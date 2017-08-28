/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	TestDisk.java
 * 	tests the code in the other classes
 */
package Unit1.Disk;

/**
 * The Circle class is tested.
 */
public class TestDisk {
	public static void main(String[] args) {
		Disk spot1 = new Disk(3, 2);
		Disk spot2 = new Disk(4, 3);
		if (spot1.compareTo(spot2) == 0) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("not equal");
		}
		System.out.println(spot1);
		System.out.println(spot2);
	}
}
