/* Max Rink
 * ICS4U
 * February 2 2016
 * LinkedList.java
 * a class for making a linked list
 */
package Unit5.Project14;

public class LinkedList {
	private Node head;

	/**
	 * constructor pre: none post: A linked list with a null item has been
	 * created.
	 */
	public LinkedList() {
		head = null;
	}

	/**
	 * Adds a node to the linked list. pre: none post: The linked list has a new
	 * node at the head.
	 */
	public void addAtFront(String str) {
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}

	/**
	 * Deletes a node in the linked list. pre: none post: The first node
	 * containing str has been deleted.
	 */
	public void remove(String str) {
		Node current = head;
		Node previous = head;
		if (current.getData().equals(str)) {
			head = current.getNext();
		} else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
				if (current.getData().equals(str)) {
					previous.setNext(current.getNext());
				}
			}
		}
	}

	/**
	 * Creates a string that lists the nodes of the linked list. pre: none post:
	 * The linked list has been written to a string.
	 */
	public String toString() {
		Node current = head;
		String listString;
		if (current != null) {
			listString = current.getData() + "\n";
			while (current.getNext() != null) {
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return (listString);
		} else {
			return ("There are no items in list.");
		}
	}
	
	public int size(){
		Node next, current = head;
		int index=0;
		do{
			next = current.getNext();
			current = next;
			index++;
		}while(next != null);
		return index;
	}
	
	public void addAtEnd(String str){
		Node next, current = head;
		do{
			next = current.getNext();
			current = next;
		}while(next != null);
		Node newNode = new Node(str);
		current.setNext(newNode);
	}
	
}
