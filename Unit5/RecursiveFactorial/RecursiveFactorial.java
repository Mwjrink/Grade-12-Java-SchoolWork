/* Max Rink
 * ICS4U
 * February 2 2016
 * RecursiveFactorial.java
 * sorting algorithms
 */
package Unit5.Project03;

public class RecursiveFactorial {
	public static void main(String[] args){
		System.out.println(getFactorial(5));
	}
	
	static int getFactorial(int num){
		if(num == 1){
			return num;
		}
		return num*getFactorial(num-1);
	}
}
