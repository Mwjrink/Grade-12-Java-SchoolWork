/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	ClientCode.java
 * 	tests the code in the other classes
 */
package Unit1.RectanglePart4of5;

public class ClientCode {

	public static void main(String args[]) {
		Rectangle r = new Rectangle(3, 7);
		Rectangle r3 = new Rectangle(2, 7);

		if (r.compareTo(r3) == 0)
			System.out.println("Rectangles are equal");
		else
			System.out.println("Rectangles are not equal");
	}

}
