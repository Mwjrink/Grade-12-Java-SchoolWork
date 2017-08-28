/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Minivan.java
 * 	A Minivan class that inherits vehicle
 */
package Unit1.Unit1Assignment;

public class Minivan extends Vehicle {
	int seats;

	Minivan(int seats, String brand, int fuelCapacity, int year, String color) { //constructor, when called passes the appropriate variables to the supers constructor
		super(brand, fuelCapacity, false, year, "Minivan", color);
		this.seats = seats;
	}

	@Override
	void start() { //start the van
		System.out.println("minivan started");
	}

	@Override
	void stop() { //stop the van
		System.out.println("minivan stopped");
	}


}
