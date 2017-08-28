/*	Max Rink
 * 	ICS4U
 * 	February 2 2017
 * 	Hockey.java
 * 	Tests the other classes
 */
package Unit1.PuckPart1of2;

public class Hockey {
	
	public static void main(String args[]){
		Puck puck = new Puck(3.0, 1.0, 5.1);
		Puck puck2 = new Puck(3.0, 1.0, 5.5);
		
		if(puck.equals(puck2))
			System.out.println(puck.toString() + " is equal to " + puck2.toString());
		else
			System.out.println(puck.toString() + " is not equal to " + puck2.toString());
	}
}
