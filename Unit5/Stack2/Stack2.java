/* Max Rink
 * ICS4U
 * February 2 2016
 * Stack2.java
 * tests a stack
 */
package Unit5.Project09;

public class Stack2 {
	public static void main(String[] args) 
	{ 
		Stack s = new Stack(10); 
			System.out.println("Adding integer class 10 and integer class 13 to stack."); 
		s.push(new Integer(10)); 
		s.push(new Integer(13)); 
			System.out.println("Top of stack: " + s.top());
			System.out.println("Items in stack: " + s.size()); 
			System.out.println("Removing top item."); 
		s.pop(); 
			System.out.println("Top of stack: " + s.top());
			System.out.println("Items in stack: " + s.size());
			System.out.println("Adding a new item."); 
		s.push(new Integer(40)); 
			System.out.println("Top of stack: " + s.top());
			System.out.println("Items in stack: "	+ s.size());
	}
}
