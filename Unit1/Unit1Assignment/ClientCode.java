/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	ClientCode.java
 * 	tests the code in the other classes
 */
package Unit1.Unit1Assignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientCode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //open the input scanner
		//initialize the variables necessary throughout the code
		String in;
		String color;
		String type;
		String brand;
		String[] att = new String[17];
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		int seats;
		int wheels;
		int fuelCapacity;
		int year;
		int maxLoad;
		boolean broken;
		
		//continue loop until user inputs q, the quit command
		do {
			print("Please specify an action:\nenter a new vehicle [E]\nremove an existing vehicle [R]\nspecify an existing vehicle to see more actions [S]?\n(input Q to quit at any time)");
			in = input.next();
			//prompt user for an action they would like to perform
			if (in.equalsIgnoreCase("e")) { //create a new vehicle
				print("Would you like to add a\nTruck [T]\nMinivan [M]\nCar [C]\nGo Back [B]?");
				in = input.next();
				if (in.equalsIgnoreCase("t")) { //create a truck
					//get the necessary inputs to identify the truck
					print("Please enter the brand of your truck: ");
					brand = input.next();
					print("Please enter the fuelCapacity of your truck: ");
					fuelCapacity = input.nextInt();
					print("Please enter the year of your truck: ");
					year = input.nextInt();
					print("Please enter the type of your truck: ");
					type = input.next();
					print("Please enter the color of your truck: ");
					color = input.next();
					print("Please enter the maxLoad of your truck: ");
					maxLoad = input.nextInt();
					print("Please enter the number of wheels your truck has: ");
					wheels = input.nextInt();
					vehicles.add(new Truck(brand, fuelCapacity, year, type, color, maxLoad, wheels)); 
					//store the data in the array list
				} else if (in.equalsIgnoreCase("m")) { //create a minivan
					//get the necessary inputs to identify the minivan
					print("Please enter the brand of your minivan: ");
					brand = input.next();
					print("Please enter the fuelCapacity of your minivan: ");
					fuelCapacity = input.nextInt();
					print("Please enter the year of your minivan: ");
					year = input.nextInt();
					print("Please enter the color of your minivan: ");
					color = input.next();
					print("Please enter the number of seats in your minivan: ");
					seats = input.nextInt();
					//store the data in the array list
					vehicles.add(new Minivan(seats, brand, fuelCapacity, year, color));
				} else if (in.equalsIgnoreCase("c")) { //create a car
					//get the necessary inputs to identify the car
					print("Please enter the brand of your Car: ");
					brand = input.next();
					print("Please enter the fuelCapacity of your Car: ");
					fuelCapacity = input.nextInt();
					print("Please enter the year of your Car: ");
					year = input.nextInt();
					print("Please enter the color of your Car: ");
					color = input.next();
					//store the data in the array list
					vehicles.add(new Car(brand, fuelCapacity, year, color));
				} else if (in.equalsIgnoreCase("b")) {//go back
					in = "b";
					continue;
				} else {
					in = "Q";
					continue;
				}
			} else if (in.equalsIgnoreCase("r")) { //remove an existing vehicle in the database
				//list the existing vehicles
				for (int i = 0; i < vehicles.size(); i++) {
					print((i+1) + ": " + vehicles.get(i).toString());
				}
				//if there are no vehicles restart the outermost loop
				if(vehicles.size() == 0) continue;
				print("Which vehicle would you like to remove: "); //prompt user for which vehicle to remove
				int remove = input.nextInt(); 
				//remove specified vehicle
				vehicles.remove(remove-1);
			} else if (in.equalsIgnoreCase("s")) { //specify an existing vehicle
				//list the existing vehicles
				for (int i = 0; i < vehicles.size(); i++) {
					print((i+1) + ": " + vehicles.get(i).toString());
				}
				//if there are no vehicles restart the outermost loop
				if(vehicles.size() == 0) continue;
				print("Which vehicle would you like to specify: "); //prompt user for which vehicle to specify
				int specify = input.nextInt();
				vehicles.get(specify-1);
				print("would you like to\nstart your vehicle [a]\nstop your vehicle [o]\nrepair your vehicle [r]");
				//prompt user for next action with specified vehicle
				in = input.next();
				if (in.equalsIgnoreCase("a")) { //start the vehicle
					vehicles.get(specify-1).start();
				} else if (in.equalsIgnoreCase("o")) { //stop the vehicle
					vehicles.get(specify-1).stop();
				} else if (in.equalsIgnoreCase("r")) { //repair the vehicle
					vehicles.get(specify-1).repair();
				} else { //quit
					in = "Q";
				}
			} else { //quit
				in = "Q";
			}
		} while (!in.equalsIgnoreCase("Q")); //quit case
	}

	static void print(String str) { //function to make printing easier
		System.out.println(str);
	}

}
