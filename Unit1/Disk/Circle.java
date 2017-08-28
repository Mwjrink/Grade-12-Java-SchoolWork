/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Circle.java
 * 	Circle data and actions
 */
package Unit1.Disk;
/**
 * Circle class.
 */
public class Circle implements Comparable {
	private static final double PI = 3.14;
	private double radius;

	/**
	 * constructor pre: none post: A Circle object created. Radius initialized
	 * to 1.
	 */

	public Circle() {
		radius = 1;
	}

	public Circle(double r) {
		radius = r; // input radius
	}

	/**
	 * Changes the radius of the circle. pre: none post: Radius has been
	 * changed.
	 */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	/**
	 * Calculates the area of the circle. pre: none post: The area of the circle
	 * has been returned.
	 */

	public double area() {
		double circleArea;
		circleArea = PI * radius * radius;
		return (circleArea);
	}

	/**
	 * Returns the radius of the circle. pre: none post: The radius of the
	 * circle has been returned.
	 */
	public double getRadius() {
		return (radius);
	}

	public double getCircumference() {
		double circleCircumference;
		circleCircumference = PI * radius * 2;
		return (circleCircumference);
	}

	public void getFormula(int f) {
		System.out.print("The formula for ");
		switch (f) {
		case 1:
			System.out.println("area of a circle is:  A = Pi*r*r");
			break;
		case 2:
			System.out.println("circumference of a circle is:  C = Pi*2*r");
			break;
		}
	}

	public boolean equals(Object c) {
		Circle testCircle = (Circle) c;
		if (testCircle.getRadius() == radius) {
			return (true);
		} else {
			return (false);
		}
	}

	public String toString() {
		String circleString;
		circleString = "Circle has radius " + radius;
		return (circleString);
	}

	public int compareTo(Object c) {
		Circle testCircle = (Circle) c;
		if (radius < testCircle.getRadius()) {
			return (-1);
		} else if (radius == testCircle.getRadius()) {
			return (0);
		} else {
			return (1);
		}
	}
}
