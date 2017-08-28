/* Max Rink
 * ICS4U
 * February 2 2016
 * Roll.java
 * rolls two dice
 */
package Unit3.Project8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Roll implements ActionListener {
	JFrame frame;
	JPanel contentPane;
	JButton rollDie;
	JLabel dieFace, dieFace1;

	public Roll() {
		/* Create and set up the frame */
		frame = new JFrame("Roll");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* Create a content pane with a BoxLayout and empty borders */
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		/* Create a label that shows a die face */
		dieFace = new JLabel(new ImageIcon("res/Animation/die3.gif"));
		dieFace.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		dieFace.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		
		dieFace1 = new JLabel(new ImageIcon("res/Animation/die3.gif"));
		dieFace1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		dieFace1.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

		contentPane.add(dieFace);
		
		contentPane.add(dieFace1);

		/* Create a Roll Die button */
		rollDie = new JButton("Roll Die");
		rollDie.setAlignmentX(JButton.CENTER_ALIGNMENT);
		rollDie.addActionListener(this);
		contentPane.add(rollDie);

		/* Add content pane to frame */
		frame.setContentPane(contentPane);

		/* Size and then display the frame. */
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Handle a button click pre: none post: A die has been rolled. Matching
	 * image shown.
	 */
	public void actionPerformed(ActionEvent event) {
		int newRoll;
		newRoll = (int) (6 * Math.random() + 1);
		switch(newRoll){
		case 1:
			dieFace.setIcon(new ImageIcon("res/Animation/diel.gif"));break;
		case 2:
			dieFace.setIcon(new ImageIcon("res/Animation/die2.gif"));break;
		case 3:
			dieFace.setIcon(new ImageIcon("res/Animation/die3.gif"));break;
		case 4:
			dieFace.setIcon(new ImageIcon("res/Animation/die4.gif"));break;
		case 5:
			dieFace.setIcon(new ImageIcon("res/Animation/die5.gif"));break;
		case 6:
			dieFace.setIcon(new ImageIcon("res/Animation/die6.gif"));break;
			default:break;
		}
		
		newRoll = (int) (6 * Math.random() + 1);
		switch(newRoll){
		case 1:
			dieFace1.setIcon(new ImageIcon("res/Animation/diel.gif"));break;
		case 2:
			dieFace1.setIcon(new ImageIcon("res/Animation/die2.gif"));break;
		case 3:
			dieFace1.setIcon(new ImageIcon("res/Animation/die3.gif"));break;
		case 4:
			dieFace1.setIcon(new ImageIcon("res/Animation/die4.gif"));break;
		case 5:
			dieFace1.setIcon(new ImageIcon("res/Animation/die5.gif"));break;
		case 6:
			dieFace1.setIcon(new ImageIcon("res/Animation/die6.gif"));break;
			default:break;
		}
	}
	
	public static void main(String args[]){
		Roll roll = new Roll();
	}
}