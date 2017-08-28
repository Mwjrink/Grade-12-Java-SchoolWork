/* Max Rink
 * ICS4U
 * February 2 2016
 * BouncePanel.java
 * bounces a ball in a panel
 */
package Unit3.Project11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.*;

public class BouncePanel extends JPanel implements Runnable // Animate
{
	Image ball, court;
	float current = 0F;
	Thread runner;
	int xPosition = 10;
	int xMove = 1;
	int yPosition = -1;
	int ballHeight = 185;
	int ballWidth = 190;
	int height;
	int speed = 1;
	JSlider slid;

	public BouncePanel(JSlider slid) {
		super();
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.slid = slid;
		ball = kit.getImage("res/Animation/tennis.gif");
		court = kit.getImage("res/Animation/court.jpg");
		runner = new Thread(this);
		runner.start();
		slid.setMinimum(1);
		slid.setMaximum(100);
		slid.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				speed = slid.getValue();
			}
		});
	}

	public void paintComponent(Graphics comp) {
		Graphics2D comp2D = (Graphics2D) comp;
		height = getSize().height - ballHeight;
		if (yPosition == -1) {
			yPosition = height - 20;
		}
		if ((court != null) && (ball != null)) {
			comp2D.drawImage(court, 0, 0, (int)super.getSize().getWidth(), (int)super.getSize().getHeight(), this);
			comp2D.drawImage(ball, (int) xPosition, (int) yPosition, this);
		}
	}

	public void run() {
		Thread thisThread = Thread.currentThread();
		while (runner == thisThread) {
			current += (float) 0.1;
			if (current > 3) {
				current = (float) 0;
			}
			xPosition += xMove;
			if (xPosition > (getSize().width - ballWidth)) {
				xMove *= -1;
			}
			if (xPosition < 1) {
				xMove *= -1;
			}
			double bounce = Math.sin(current) * height;
			yPosition = (int) (height - bounce);
			repaint();
			try {
				Thread.sleep(100 / speed);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}
}