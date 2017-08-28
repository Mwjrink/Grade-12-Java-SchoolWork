/*	Max Rink, Joshua Downing, Joseph Green
 * 	ICS4U
 * 	February 2 2017
 * 	Clacker.java
 * 	A dice game using JFrames
 */
package Unit3.Unit3Assignment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Clacker extends JFrame implements ActionListener {
	//create necessary variables
	private static final long serialVersionUID = 1L;
	JButton[] numbers = new JButton[12];
	int sc = -1; //set initial score
	boolean scored=false,running=false;
	boolean[] used = new boolean[12];
	int dieFace1, dieFace2;
	//create the necessary components
	ImageIcon[] faces;
	JPanel butts;
	JPanel dice;
	JPanel scores;
	JLabel die1;
	JLabel die2;
	JButton roll;
	JButton stop;
	Thread rolling;
	//initialize the score and button
	JLabel score = new JLabel("\nScore\n"+sc);
	JButton reset = new JButton("New Game"); //initialize reset button

	/* A contructor, sets up and initializes eveything that is needed
	 * pre: nothing is passed to this constructor
	 * post: nothing is returned from this constructor
	 */
	Clacker(){ //constructor
		this.setSize(300, 450); //set window size
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //set close operation
		this.setResizable(false);
		this.setLayout(new GridLayout(0, 1));
		//initialize the necessary components
		butts = new JPanel();
		dice = new JPanel();
		scores = new JPanel();
		faces = new ImageIcon[6];
		//load the faces into memory in an array
		for(int i=0;i<6;i++){
			faces[i] = new ImageIcon("res/Animation/die" + (i+1) + ".gif");
		}
		//initialize variables
		die1 = new JLabel();
		die2 = new JLabel();
		rollDice();
		roll = new JButton("Roll");
		roll.setEnabled(false);
		stop = new JButton("Stop");
		//ad action listeners to the roll and new game buttons
		roll.addActionListener(this);
		roll.setActionCommand(""+13);
		stop.addActionListener(this);
		stop.setActionCommand(""+15);
		reset.addActionListener(this);
		reset.setActionCommand(""+14);
		scores.setLayout(new GridLayout(0, 1));
		butts.setLayout(new GridLayout(4,3,1,1));
		//add action listeners and the labels to the buttons
		for(int i=0;i<12;i++){
			numbers[i] = new JButton("  " + (i+1) + "  ");
			numbers[i].addActionListener(this);
			numbers[i].setActionCommand("" + i);
			numbers[i].setEnabled(false);
			butts.add(numbers[i]);
			used[i]=false;
		}
		//add all the components to the panels then the Frame
		score.setHorizontalAlignment(0);
		scores.add(reset);
		scores.add(roll);
		scores.add(stop);
		scores.add(score);
		dice.add(die1);
		dice.add(die2);
		this.add(butts);
		this.add(dice);
		this.add(scores);
		this.setVisible(true);
	}

	/* the method that accepts all button action commands
	 * pre: an action event called e
	 * post: nothing is returned from this method
	 */
	@Override
	public void actionPerformed(ActionEvent e) { //receive actions
		if(Integer.parseInt(e.getActionCommand()) == 13){ //roll the dice button pressed
			rollDice();
			scored=false;
			return;
		} else if (Integer.parseInt(e.getActionCommand()) == 14){ //new game button pressed
			enableAll();
			return;
		} else if (Integer.parseInt(e.getActionCommand()) == 15){
			stop();
			return;
		}
		int poss = Integer.parseInt(e.getActionCommand());
		isValid(poss);
			
	}
	
	/* Method called when the roll dice button is pressed, starts the thread in the inline class 
	 * pre: nothing is passed to the method
	 * post: nothing is returned from the method
	 */
	public void rollDice(){ //roll the dice
		try{
			roll.setEnabled(false);
			stop.setEnabled(true);
			for(int i=0;i<12;i++){
				numbers[i].setEnabled(false);
			}
		} catch (NullPointerException e){
			
		}
		
		if(!running){
			running = true;
			rolling = new Thread(new roller());
			rolling.start();
			sc++;
			updateScore();
		}
	}

	/* Stop method, called when the stop the dice button si pressed, ends the thread and enables the buttons
	 * pre: nothing is passed to the method
	 * post: nothing is returned from the method
	 */
	public void stop(){
		roll.setEnabled(true);
		stop.setEnabled(false);
		rolling.stop();
		running = false;
		int pos = dieFace1+dieFace2+1;
		if(!used[pos]){
			numbers[pos].setEnabled(true);
		}
		if(!used[dieFace1]){
			numbers[dieFace1].setEnabled(true);
		}
		if(!used[dieFace2]){
			numbers[dieFace2].setEnabled(true);
		}
	}	

	/* A class used to run a thread for rolling the dice animation
	 * pre: nothing is passed because its a class
	 * post: nothing is returned because its a class
	 */
	class roller implements Runnable{

		/* the run method, ran in a thread and used for animation
		 * pre: nothing is passed to this method
		 * post: nothing is returned from this method
		 */
		@Override
		public void run() {
			while(!Thread.interrupted()){
				dieFace1=(int) (6 * Math.random());
				die1.setIcon(faces[dieFace1]);
				dieFace2=(int) (6 * Math.random());
				die2.setIcon(faces[dieFace2]);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/* method used to enable all of the buttons, and reset the game
	 * pre: nothing is passed to this method
	 * post: nothing is returned from this method
	 */
	public void enableAll(){ //enable all the buttons
		for(int i=0;i<12;i++){
			numbers[i].setEnabled(false);
			butts.add(numbers[i]);
			used[i]=false;
			numbers[i].setText(""+(i+1));
		}
		sc=0;
		updateScore();
		rollDice();
	}
	
	/* Method called to update the score label's text
	 * pre: this method does not take in any parameters
	 * post: this method does not return anything
	 */
	public void updateScore(){ //update the score JLabel
		score.setText("\n\t Score:  \t\n"+sc);
	}
	
	/* the method that is run when the program is executed
	 * pre: arguments run along with the program
	 * post: this method does not return anything
	 */
	public static void main(String[] args){ //main method creates instance of this class
		Clacker clack = new Clacker();
	}
	
	/* this method checks the validity of the pressed button
	 * pre: integer for the numbered button pressed
	 * post: returns a boolean indicating whether the pressed button is a valid press;
	 */
	public void isValid(int butt){
		int pos = dieFace1+dieFace2+1;
		if(butt == pos && !scored) {
			numbers[pos].setEnabled(false); //another button pressed, cover the specified button
			numbers[pos].setText("--");
			used[pos]=true;
			numbers[dieFace1].setEnabled(false); //another button pressed, cover the specified button
			numbers[dieFace2].setEnabled(false);
			scored=true;
		} else if ((butt == dieFace1 || butt == dieFace2) && !scored){
			numbers[dieFace1].setEnabled(false); //another button pressed, cover the specified button
			numbers[dieFace2].setEnabled(false);
			numbers[pos].setEnabled(false);
			numbers[dieFace1].setText("--");
			numbers[dieFace2].setText("--");
			used[dieFace1]=true;
			used[dieFace2]=true;
			scored=true;
		}
	}
}
