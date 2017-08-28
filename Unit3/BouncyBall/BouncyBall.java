/* Max Rink
 * ICS4U
 * February 2 2016
 * BouncyBall.java
 * a class for the ball
 */
package Unit3.Project11;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BouncyBall extends JFrame{
	private static final long serialVersionUID = 1L;
	JSlider slid = new JSlider();
	public BouncyBall() {
		super("Tennis");
		setSize(550, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BouncePanel boing = new BouncePanel(slid);
		super.setLayout(new GridLayout(0, 1));
		add(boing);
		add(slid);
		setVisible(true);
	}

	public static void main(String[] arguments) {
		BouncyBall frame = new BouncyBall();
	}

}