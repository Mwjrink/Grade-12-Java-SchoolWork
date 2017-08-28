/* Max Rink
 * ICS4U
 * February 2 2016
 * Stack.java
 * a class for making stacks
 */
package Unit5.Project09;

public class Stack {
	private Object[] data;
	private int top;

	/**
	 * constructor pre: none post: An empty stack that can hold up to maxItems
	 * has been created.
	 */

	public Stack(int maxItems) {
		data = new Object[maxItems];
		top = -1; // no items in the array
	}

	/**
	 * Returns the top item without removing it from the stack. pre: Stack
	 * contains at least one item. post: The top item has been returned while
	 * leaving it on the stack.
	 */
	public Object top() {
		return (data[top]);
	}

	/**
	 * Removes the top item from the stack and returns it. pre: Stack contains
	 * at least one item. post: The top item of the stack has been removed and
	 * returned.
	 */
	public Object pop() {
		top -= 1;
		return (data[top + 1]);
	}

	/**
	 * Adds an item to the top of the stack if there is room. pre: none post: A
	 * new item has been added to the top of the stack.
	 */
	public void push(Object num) {
		if (top < data.length - 1) {
			top += 1;
			data[top] = num;
		}
	}

	/**
	 * Determines if there are items on the stack. pre: none post: true returned
	 * if there are items on the stack, false returned otherwise.
	 */
	public boolean isEmpty() {
		if (top == -1) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns the number of items in the stack. pre: none post: The number of
	 * items in the stack is returned.
	 */
	public Object size() {
		if (isEmpty()) {
			return (0);
		} else {
			return (top);
		}
	}

	/**
	 * Empties the stack. pre: none post: There are no items in the stack.
	 */
	public void makeEmpty() {
		top = -1;
	}
}
