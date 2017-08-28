/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Truck.java
 * 	A Truck class that inherits vehicle
 */
package Unit1.Unit1Assignment;

public class Truck extends Vehicle {
	
	int maxLoad;
	String type;
	int wheels;
	
	Truck(String brand, int fuelCapacity, int year, String type, String color, int maxLoad, int wheels) { //constructor, when called passes the appropriate variables to the supers constructor
		super(brand, fuelCapacity, false, year, "truck", color);
		this.maxLoad = maxLoad; //stores the necessary local data locally
		this.type = type;
		this.wheels = wheels;
	}

	public int getMaxLoad() { //returns the variable maxload
		return maxLoad;
	}


	public void setMaxLoad(int maxLoad) { //sets the max load
		this.maxLoad = maxLoad;
	}


	public String getType() { //returns the type of truck
		return type;
	}


	public void setType(String type) { //sets type of truck
		this.type = type;
	}


	@Override
	void start() { //starts truck
		System.out.println("truck started");
	}

	@Override
	void stop() { //stops truck
		System.out.println("truck stopped");
	}


}
