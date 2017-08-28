/* Max Rink
 * ICS4U
 * February 2 2016
 * Queue.java
 * a class for making a queue
 */
package Unit5.Project12;

import java.util.ArrayList;

public class Queue {
	private ArrayList<Object> data;
	private int front, rear;

	/**
	 * constructor pre: none post: An empty queue that can hold up to maxItems
	 * has been created.
	 */

	public Queue() {
		data = new ArrayList<Object>();
		front = -1; // no items in the array
		rear = -1;
	}

	/**
	 * Returns the front item without removing it from the queue. pre: Queue
	 * contains at least one item. post: The front item has been returned while
	 * leaving it in the queue.
	 */

	public Object front() {
		return (data.get(front));
	}

	/**
	 * Removes the front item from the queue and returns it. pre: Queue contains
	 * at least one item. post: The front item of the queue has been removed and
	 * returned.
	 */

	public Object dequeue() {
		Object num;
		num = data.get(front); // get front item
		// if dequeueing last item then make empty
		data.remove(front);
		// move pointer to next item
		front -= 1;
		return (num);
	}

	/**
	 * Adds an item to the queue if there is room. pre: none post: A new item
	 * has been added to the queue.
	 */
	public void enqueue(Object num) {
		rear = 0;
		front += 1;
		data.add(num);
	}

	/**
	 * Determines if there are items on the queue. pre: none post: true returned
	 * if there are items on the queue, false returned otherwise.
	 */
	public boolean isEmpty() {
		if (data.size() == 0) {
			return (true);
		} else {
			return (false);
		}
	}

	/**
	 * Returns the number of items in the queue. pre: none post: The number of
	 * items in the queue is returned.
	 */
	public int size() {
		return data.size();
	}

	/**
	 * Empties the queue. pre: none post: There are no items in the queue.
	 */
	public void makeEmpty() {
		front = -1;
		rear = -1;
	}
}
