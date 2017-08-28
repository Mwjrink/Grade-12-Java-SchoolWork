/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Associate.java
 * 	class to store data on an associate
 */
package Unit1.SalesCenter;

/**
 * Associate class.
 */
class Associate extends Employee {
	double hourlyPayRate;

	/**
	 * constructor pre: none post: An associate has been created.
	 */
	public Associate(String fName, String lName, double rate) {
		super(fName, lName);
		hourlyPayRate = rate;
	}

	/**
	 * Returns the associate pay rate. pre: none post: The associate pay rate
	 * has been returned.
	 */
	public double getRate() {
		return (hourlyPayRate);
	}

	/**
	 * Returns the associate pay for the hours worked. pre: none post: The
	 * associate pay for the hours worked has been returned.
	 */
	public double pay(double hours) {
		double payEarned;
		payEarned = hourlyPayRate * hours;
		if(hours>40){
			payEarned = (hourlyPayRate*40)+((hours-40)*1.5*hourlyPayRate);
		}
		return (payEarned);
	}

	/**
	 * Returns the employee name and title. pre: none post: The employee name
	 * and title has been returned.
	 */
	public String toString() {
		return (super.toString() + " associate");
	}
}
