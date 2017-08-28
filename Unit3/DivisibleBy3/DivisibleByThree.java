/* Max Rink
 * ICS4U
 * February 2 2016
 * DivisibleByThree.java
 * determines if a number is divisible by 3
 */
package Unit3.Project6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DivisibleByThree {
	static JFrame frame = new JFrame();
	static JTextField jc = new JTextField();
	static JButton jb = new JButton("VERIFY");
	static JLabel nm = new JLabel();
	public static void main(String args[]){

		jb.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		        if(Check(Integer.parseInt(jc.getText())))
		        	nm.setText("This number is divisible by 3");
		        else
		        	nm.setText("This number is NOT divisible by 3");
		    } 
		});
		frame.setSize(500,  300);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(0, 1));
		panel.add(jc);
		panel.add(jb);
		panel.add(nm);
		frame.setVisible(true);
		
	}
	
	static boolean Check(int i){
		if((((int)(i/3))*3) == i)
			return true;
		return false;
	}
}
