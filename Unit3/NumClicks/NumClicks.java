/* Max Rink
 * ICS4U
 * February 2 2016
 * NumClicks.java
 * counts the number of clicks
 */
package Unit3.Project3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumClicks {
	static int clicks = 0;
	static JFrame frame = new JFrame(); 
	static JLabel name = new JLabel(Integer.toString(clicks));
	static JButton butt = new JButton("increment");
	public static void main(String args[]){
		butt.setActionCommand("toggle");
		butt.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		        clicks++;
		        name.setText(Integer.toString(clicks));
		    } 
		});
		frame.setSize(200,  200);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(name);
		panel.add(butt);
		frame.setVisible(true);
		
	}
}
