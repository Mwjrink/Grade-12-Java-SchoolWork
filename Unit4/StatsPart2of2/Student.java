/* Max Rink
 * ICS4U
 * February 2 2016
 * Student.java
 * stores information for students
 */
package Unit4.Project5;

public class Student {
	private int testScore;
	private String name;
	
	Student(String name, int testScore){
		this.name = name;
		this.testScore = testScore;
	}
	
	@Override
	public String toString(){
		return (name + ": " + testScore);
	}

	public int getTestScore() {
		return testScore;
	}

	public String getName() {
		return name;
	}
	
	
}
