/* Max Rink
 * ICS4U
 * February 2 2016
 * MetricConversion.java
 * displays conversion formulas
 */
package Unit3.Project7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MetricConversion {
	static JFrame frame = new JFrame();
	static String[] conv = {"inches to centimeters", "feet to meters", "gallons to liters", "pounds to kilograms"};
	static String[] conv1 = {"1 inch = 2.54 centimeters", "1 foot = 0.3048 meters", "1 gallon = 4.5461 liters", "1 pound = 0.4536 kilograms"};
	static JComboBox jc = new JComboBox(conv);
	static JLabel nm = new JLabel(conv1[0]);
	public static void main(String args[]){

		jc.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		        nm.setText(conv1[jc.getSelectedIndex()]);
		    } 
		});
		frame.setSize(800,  200);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(0, 1));
		panel.add(jc);
		panel.add(nm);
		frame.setVisible(true);
		frame.pack();
		
	}
}
