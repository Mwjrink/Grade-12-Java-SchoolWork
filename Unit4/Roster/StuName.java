/* Max Rink
 * ICS4U
 * February 2 2016
 * StuName.java
 * class for storing students information
 */
package Unit4.Project6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StuName {

	String first, last;
	StuName(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	@Override
	public String toString(){
		return (last + ", " + first);
	}
}
