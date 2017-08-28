/* Max Rink
 * ICS4U
 * February 2 2016
 * Squares.java
 * an array holds the square of its index
 */
package Unit2.Project02;

public class Squares {
	
	public static void main(String args[]){
		int[] squar = new int[5];
		
		for(int i=0;i<squar.length;i++){
			squar[i] = i*i;
		}
		
		for(int i=0;i<squar.length;i++){
			System.out.println(i + " squared is " + squar[i]);
		}
		
	}
	
}
