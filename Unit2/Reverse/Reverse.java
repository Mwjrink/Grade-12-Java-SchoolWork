/* Max Rink
 * ICS4U
 * February 2 2016
 * Reverse.java
 * stores the reverse of the index in an array
 */
package Unit2.Project03;

public class Reverse {
	
	public static void main(String args[]){
		int[] squar = new int[10];
		
		for(int i=0;i<squar.length;i++){
			squar[9-i] = i;
		}
		
		for(int i=0;i<squar.length;i++){
			System.out.println(squar[i]);
		}
		
	}
	
}
