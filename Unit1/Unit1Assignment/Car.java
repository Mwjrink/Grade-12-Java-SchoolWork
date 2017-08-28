/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Car.java
 * 	A car class that inherits vehicle
 */
package Unit1.Unit1Assignment;

public class Car extends Vehicle {

	Car(String brand, int fuelCapacity, int year, String color) { 
		//constructor, when called passes the appropriate variables to the supers constructor
		super(brand, fuelCapacity, false, year, "Car", color);
	}

	//start the car
	@Override
	void start() {
		System.out.println("car started");
	}

	//stop the car
	@Override
	void stop() {
		System.out.println("car stopped");
	}

}
