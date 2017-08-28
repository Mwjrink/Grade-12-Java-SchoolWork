/* Max Rink
 * ICS4U
 * February 2 2016
 * Name.java
 * prints name in a window to the screen
 */
package Unit3.Project1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Name {
	public static void main(String args[]){
		JFrame frame = new JFrame(); 
		JLabel name = new JLabel("Max Rink");
		frame.setSize(200,  200);
		frame.add(name);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
