/* Max Rink
 * ICS4U
 * February 2 2016
 * Customer.java
 * class to specify and store data pertaining to a customer
 */
package Unit2.Project11;

/**
 * Customer class.
 */
public class Customer {
	private String firstName, lastName;
	private String street, city, state, zip;

	public void changeStreet(String street) {
		this.street = street;
	}

	public void changeCity(String city) {
		this.city = city;
	}

	public void changeState(String state) {
		this.state = state;
	}

	public void changeZip(String zip) {
		this.zip = zip;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	/**
	 * constructor pre: none post: A Customer object has been created. Customer
	 * data has been initialized with parameters.
	 */
	public Customer(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}

	/**
	 * Returns a String that represents the Customer object. pre: none post: A
	 * string representing the Customer object has been returned.
	 */
	public String toString() {
		String custString;
		custString = firstName + " " + lastName + " " + street + " " + city + " " + state + " " + zip + "\n";
		return (custString);
	}
}