/* Max Rink
 * ICS4U
 * February 2 2016
 * Sunflower.java
 * displays sunflower in english with the option of changing the language
 */
package Unit3.Project4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sunflower {
	static boolean shown = true;
	static JFrame frame = new JFrame();
	static JLabel name = new JLabel("Sunflower");
	static JButton butt = new JButton("English");
	static JButton butt2 = new JButton("Latin");

	public static void main(String args[]) {
		butt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("Sunflower");
			}
		});
		butt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("HELIANTHUS");
			}
		});
		frame.setSize(200, 200);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(0, 1));
		panel.add(name);
		panel.add(butt);
		panel.add(butt2);
		frame.setVisible(true);

	}
}
