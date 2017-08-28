/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Puck.java
 * 	Puck info and data
 */
package Unit1.PuckPart1of2;

public class Puck extends Disk{
	
	private double weight;
	private boolean standard, youth;
	
	public Puck(double r, double t, double weight) {
		super(r, t);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	
	public String getDivision(){
		if(standard){
			return "standard";
		} else if(youth){
			return "youth";
		}
		return "";
	}
	@Override
	public boolean equals(Object d) {
		Puck testObj = (Puck) d;

		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == getThickness() && testObj.getWeight() == weight) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString(){
		return ("Puck with a radius of " + getRadius() + ", a thickness of " + getThickness() + " and a weight of " + getWeight());
	}

}
