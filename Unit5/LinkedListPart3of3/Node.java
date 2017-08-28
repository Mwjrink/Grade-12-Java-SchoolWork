/* Max Rink
 * ICS4U
 * February 2 2016
 * Node.java
 * a class for making a node
 */
package Unit5.Project15;

public class Node {
	private String data;
	private Node next;

	/**
	 * constructor pre: none post: A node has been created.
	 */

	public Node(String newData) {
		data = newData;
		next = null;
	}

	/**
	 * The node pointed to by next is returned pre: none post: A node has been
	 * returned.
	 */
	public Node getNext() {
		return (next);
	}

	/**
	 * The node pointed to by next is changed to newNode pre: none post: next
	 * points to newNode.
	 */

	public void setNext(Node newNode) {
		next = newNode;
	}

	/**
	 * The node pointed to by next is returned pre: none post: A node has been
	 * returned.
	 */
	public String getData() {
		return (data);
	}
}