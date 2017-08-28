/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Rectangle.java
 * 	contains actions and data pertaining to rectangles
 */
package Unit1.RectanglePart4of5;

public class Rectangle implements Comparable {

	private int w, h;

	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;

		if (r.getH() == getH() && r.getW() == getW())
			return 0;
		else
			return 1;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

}
