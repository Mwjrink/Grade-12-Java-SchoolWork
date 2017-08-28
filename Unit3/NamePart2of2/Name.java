/* Max Rink
 * ICS4U
 * February 2 2016
 * Name.java
 * displays your name in a window with the option to hide it
 */
package Unit3.Project2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Name {
	static boolean shown = true;
	static JFrame frame = new JFrame(); 
	static JLabel name = new JLabel("Max Rink");
	static JButton butt = new JButton("show/hide");
	public static void main(String args[]){
		butt.setActionCommand("toggle");
		butt.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		        toggle();
		    } 
		});
		frame.setSize(200,  200);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(name);
		panel.add(butt);
		frame.setVisible(true);
		
	}
	
	public static void toggle(){
		shown = !shown;
		if(shown){
			name.setVisible(false);
		} else {
			name.setVisible(true);
		}
	}
}
