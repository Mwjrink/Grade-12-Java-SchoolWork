/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	CourseGrade.java
 * 	Tests the grade book class and its methods
 */
package Unit2Assignment;

import java.util.Scanner;

public class CourseGrade {
  /* Main method is the method called when the program is ran in the java compiler
   * pre: any arguments run along with the program
   * post: Nothing is returned from this method
   */
	public static void main(String[] args) {
		//open the input scanner
		Scanner input = new Scanner(System.in);
		//create the necessary variables to store input
		int students, tests;
		String in;
		String[] names;
		//prompt user for the data for gradebook
		System.out.println("How many students are there?");
		students = input.nextInt();
		names = new String[students]; //initialize array to store names
		System.out.println("How many tests are there?");
		tests = input.nextInt();
		//prompt user for student names then store them in the array
		for(int i=0;i<students;i++){
			System.out.print("What is the name of student " + (i+1) + ": ");
			in = input.next();
			names[i] = in;
		}
		//create an instance of gradebook
		GradeBook gradebook = new GradeBook(students, tests, names);
		
		do {
			//prompt user for an action
			System.out.println("What would you like to do?\nFill in the Grades [F]\nShow Grades [S]\nStudent Average [E]\nTest Average [T]\nQuit [Q]");
				in = input.next();
			if (in.equalsIgnoreCase("F")) { //prompt user for grades and store them in the object
				int grade;
				int[][] grad = new int[students][tests];
				for (int y = 0; y < tests; y++) {
					for (int i = 0; i < students; i++) {
						System.out.println("please enter the grades for " + gradebook.getStudentNames()[i] + " for test " + (y+1));
						grad[i][y] = input.nextInt();
					}
				}
				gradebook.getGrades(grad);
			} else if (in.equalsIgnoreCase("S")) { //print the grades to the screen
				gradebook.showGrades();
			} else if (in.equalsIgnoreCase("E")) { //print the average for the student specified
				int student;
				System.out.println("Which student (number)");
				gradebook.showStudents();
				student = input.nextInt();
				System.out.println(gradebook.studentAverage(student-1));
			} else if (in.equalsIgnoreCase("T")) { //print the average on the test specified
				int test;
				System.out.println("Which test number?");
				gradebook.showTests();
				test = input.nextInt();
				System.out.println(gradebook.testAverage(test-1));
			}
		} while (!in.equalsIgnoreCase("q")); //run until user specifies quitting
		input.close();
	}
}
