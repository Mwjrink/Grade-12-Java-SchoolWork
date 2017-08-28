/* Max Rink
 * ICS4U
 * February 2 2016
 * BreakAPlate.java
 * breaksplates randomly
 */
package Unit3.Project9;

/** 
* BreakAPlate. 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BreakAPlate implements ActionListener {

	static final ImageIcon FIRST_PRIZE = new ImageIcon("res/Animation/tiger.gif");
	static final ImageIcon CONSOLATION_PRIZE = new ImageIcon("res/Animation/sticker.gif");
	JFrame frame;
	JPanel contentPane;
	JButton play;
	JLabel plates, prizeWon;
	GameBooth breakAPlate;

	public BreakAPlate() {
		/* initialize game booth and player */
		breakAPlate = new GameBooth(0, FIRST_PRIZE, CONSOLATION_PRIZE);

		/* Create and set up the frame */
		frame = new JFrame("BreakAPlate");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* Create a content pane with a BoxLayout and empty borders */ contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

		/* Create a label that shows the start of the game */
		plates = new JLabel(new ImageIcon("res/Animation/plates.gif"));
		plates.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		plates.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
		contentPane.add(plates);

		/* Create a Play button */
		play = new JButton("Play");
		play.setActionCommand("Play");
		play.setAlignmentX(JButton.CENTER_ALIGNMENT);
		play.addActionListener(this);
		contentPane.add(play);

		/* Create a label that will show prizes won */
		prizeWon = new JLabel(" ");
		prizeWon.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		prizeWon.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		contentPane.add(prizeWon);

		/* Add content pane to frame */
		frame.setContentPane(contentPane);

		/* Size and then display the frame. */
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Handle the button click pre: none post: The appropriate image and message
	 * are displayed.
	 */

	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		ImageIcon prize;

		if (eventName == "Play") {
			prize = breakAPlate.start();
			if (prize.equals(FIRST_PRIZE)) {
				plates.setIcon(new ImageIcon("res/Animation/platesall.gif"));
			} else if (prize.equals(CONSOLATION_PRIZE)) {
				plates.setIcon(new ImageIcon("res/Animation/platestwo.gif"));
			}
			prizeWon.setIcon(prize);
			play.setText("Play Again");
			play.setActionCommand("Play Again");
		} else if (eventName == "Play Again") {
			plates.setIcon(new ImageIcon("res/Animation/plates.gif"));
			prizeWon.setText(" ");
			play.setText("Play");
			play.setActionCommand("Play");
		}
	}

	/**
	 * Create and show the GUI.
	 */
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		BreakAPlate carnivalGame = new BreakAPlate();
	}

	public static void main(String[] args) {
		/*
		 * Methods that create and show a GUI should be run from an
		 * event-dispatching thread
		 */ javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}
}