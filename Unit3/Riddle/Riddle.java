/* Max Rink
 * ICS4U
 * February 2 2016
 * Riddle.java
 * displays a riddle with the option to show the answer
 */
package Unit3.Project5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Riddle {
	static JFrame frame = new JFrame(); 
	static JLabel name = new JLabel("What is big and yellow and comes in the morning, to brighten mom's day?");
	static JButton butt = new JButton("Answer");
	public static void main(String args[]){
		butt.setActionCommand("toggle");
		butt.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		        name.setText("What is big and yellow and comes in the morning, to brighten mom's day?\nSCHOOLBUS");
		    } 
		});
		frame.setSize(800,  200);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(name);
		panel.add(butt);
		frame.setVisible(true);
		
	}
}
