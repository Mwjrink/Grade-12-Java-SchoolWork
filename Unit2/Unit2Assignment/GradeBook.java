/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	GradeBook.java
 * 	Contains data and actions pertaining to a gradebook
 */
package Unit2Assignment;

import java.util.Scanner;

public class GradeBook {
	//create class variables
	int[][] grades;
	int students, tests;
	String[] studentNames;
	//constructor
	/* This constructor initializes all of the data for all of the arrays
   * pre: takes in integers students and tests and a string array called names
   * post: This method does not return any data
   */
	GradeBook(int students, int tests, String[] names) { //initialize the arrays and fill them
		grades = new int[students][tests]; //initialize the size of the array to the specified values of students and tests
		studentNames = new String[students]; //initialize the array of names to the size of the class
		String name; //create a String called "name" and leave it empty
		Scanner inp = new Scanner(System.in); //open the scanner for getting user input
		for (int i = 0; i < names.length; i++) { //run a for loop for the length of the array
			studentNames[i] = names[i]; //make all of the names in the created array equal to the names in the passed in array
		}
		this.tests = tests;
		this.students = students;
	}
	/* This method prints all of the students names and a reference number to the screen
	   * pre: This method does not take in any data as arguments
	   * post: This method does not return anything
	   */
	void showStudents(){
		for(int i=0; i<students; i++){
			System.out.println((i+1) + " " + studentNames[i]);
		}
	}
	/* This method prints all of the tests reference numbers to the screen
	   * pre: This method does not take in any data as arguments
	   * post: This method does not return anything
	   */
	void showTests(){
		for(int i=0; i<students; i++){
			System.out.println((i+1));
		}
	}
	/* This method allows the user to fill the array with the grades for the tests
   * pre: a 2-dimensional integer array called grad
   * post: This method does not return anything
   */
	void getGrades(int[][] grad) {
		for (int y = 0; y < tests; y++) {
			for (int i = 0; i < students; i++) {
				grades[i][y] = grad[i][y];
			}
		}
	}
	/* This method prints all of the available grades to the screen
   * pre: This method does not take any arguments
   * post: This method does not return anything
   */
	void showGrades() { //print the grades to the screen
		System.out.println(tests);
		for (int y = 0; y < tests; y++) {
			for (int i = 0; i < students; i++) {
				System.out.println(studentNames[i] + " for test " + (y+1) + " has a grade of " + grades[i][y]);
			}
		}
	}
	/* This method calculates and returns averages for a student
   * pre: This method takes in an integer value corresponding to a student
   * post: This method returns a double containing the calculated average for the student
   */
	double studentAverage(int student) { //return the students average
		double average = 0;
		for (int i = 0; i < tests; i++) {
			average += grades[student][i];
		}
		double av = average/tests;
		return av;
	}
	/* This method calculates and returns the average grade scored on a specified test
     * pre: Takes in the test number as an argument
     * post: returns the average on the test
     */
	double testAverage(int test) { //return the test average
		double average = 0;
		for (int i = 0; i < students; i++) {
			average += grades[i][test];
		}
		average /= students;
		return average;
	}

	//getters and setters
	/* This method sets the value for 
   * pre: Takes in a 2 dimensional integer array value for grades
   * post: this method does not return any data
   */
	public void setGrades(int[][] grades) {
		this.grades = grades;
	}
	/* This method gets the value for students and returns it
   * pre: This method does not take in any arguments
   * post: returns the value for students stored in the class
   */
	public int getStudents() {
		return students;
	}
	/* This method sets the value for students
   * pre: Takes in an integer value for students
   * post: this method does not return any data
   */
	public void setStudents(int students) {
		this.students = students;
	}
	/* This method gets the value for tests and returns it
   * pre: This method does not take in any arguments
   * post: returns the value for tests stored in the class
   */
	public int getTests() {
		return tests;
	}
	/* This method sets the value for tests
   * pre: Takes in an integer value for tests
   * post: this method does not return any data
   */
	public void setTests(int tests) {
		this.tests = tests;
	}
	/* This method gets the value for studentNames and returns it
   * pre: This method does not take in any arguments
   * post: returns the integer array stored in the class for studentNames
   */
	public String[] getStudentNames() {
		return studentNames;
	}
	/* This method sets the value for studentNames
   * pre: Takes in a string array value for studentNames
   * post: this method does not return any data
   */
	public void setStudentNames(String[] studentNames) {
		this.studentNames = studentNames;
	}

}
