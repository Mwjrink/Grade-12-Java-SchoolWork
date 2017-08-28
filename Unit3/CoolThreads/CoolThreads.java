/* Max Rink
 * ICS4U
 * February 2 2016
 * CoolThreads.java
 * demonstrates the capabilities of threads
 */
package Unit3.Project10;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CoolThreads extends JFrame implements Runnable, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread go;
	JLabel howManyLabel = new JLabel("Quantity: ");
	JTextField howMany = new JTextField("400", 10);
	JButton display = new JButton("Display primes");
	JButton stop = new JButton("STOP");
	JTextArea primes = new JTextArea(8, 40);

	CoolThreads() {
		super("Find Prime Numbers");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		display.addActionListener(this);
		display.setActionCommand("enable");
		stop.addActionListener(this);
		stop.setActionCommand("stop");

		JPanel topPanel = new JPanel();
		topPanel.add(howManyLabel);
		topPanel.add(howMany);
		topPanel.add(display);
		topPanel.add(stop);
		add(topPanel, BorderLayout.NORTH);

		primes.setLineWrap(true);
		JScrollPane textPane = new JScrollPane(primes);
		add(textPane, BorderLayout.CENTER);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getActionCommand().equals("enable")) {
			display.setEnabled(false);
			if (go == null) {
				go = new Thread(this);
				go.start();
			}
		} else if (evt.getActionCommand().equals("stop")) {
			stop();
		}
	}

	public void run() {
		int quantity = Integer.parseInt(howMany.getText());
		int numPrimes = 0;
		// candidate: the number that might be prime
		int candidate = 2;
		primes.append("First " + quantity + " primes:");
		while (numPrimes < quantity) {
			if (isPrime(candidate)) {
				primes.append(candidate + " ");
				numPrimes++;
			}
			candidate++;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static boolean isPrime(int checkNumber) {
		double root = Math.sqrt(checkNumber);
		for (int i = 2; i <= root; i++) {
			if (checkNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] arguments) {
		CoolThreads fp = new CoolThreads();
	}

	public void stop() {
		if (go != null) {
			try {
				go.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
