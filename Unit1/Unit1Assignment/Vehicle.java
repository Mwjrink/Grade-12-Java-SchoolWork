/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Vehicle.java
 * 	An abstract class that contains the base information for vehicles
 */
package Unit1.Unit1Assignment;

public abstract class Vehicle { //the super class

	//variables pertaining to a vehicle
	private String brand;
	private int fuelCapacity;
	private boolean broken;
	private int year;
	private String type;
	private String color;
	
	Vehicle(String brand, int fuelCapacity, boolean broken, int year, String type, String color){ //the constructor takes in the necessary information and stores it in its instance
		this.brand = brand;
		this.fuelCapacity = fuelCapacity;
		this.broken = broken;
		this.year = year;
		this.type = type;
		this.color = color;
	}
	
	//getters and setters of the variables
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString(){
		return (year + " " + color + " " + brand + " " + type);
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isBroken() {
		return broken;
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	abstract void start(); //start method is abstract meaning all sub classes must have there own version
	
	abstract void stop(); //stop method is abstract meaning all sub classes must have there own version
	
	void repair(){ //a method for repairing a broken vehicle
		System.out.println("Vehicle has been repaired");
		broken = false;
	}
	
}
