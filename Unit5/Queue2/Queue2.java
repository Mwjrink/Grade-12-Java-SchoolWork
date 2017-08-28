/* Max Rink
 * ICS4U
 * February 2 2016
 * Stack2.java
 * a class for testing a queue
 */
package Unit5.Project11;

import java.util.Scanner;

public class Queue2 {
	public static void main(String[] args) {
		final int MAX_ITEMS = 3;
		Queue q = new Queue(MAX_ITEMS);
		Scanner input = new Scanner(System.in);
		String choice;
		Object num;
		do {
			System.out.print("Add/Remove/Count/Front/Quit: ");
			choice = input.next();
			if (choice.equalsIgnoreCase("a")) {
				if (q.size() < MAX_ITEMS) {
					System.out.print("Number to add: ");
					num = input.nextInt();
					q.enqueue(num);
				} else {
					System.out.println("Queue is full");
				}
			} else if (choice.equalsIgnoreCase("r")) {
				System.out.println("Dequeueing:" + q.dequeue());
			} else if (choice.equalsIgnoreCase("c")) {
				System.out.println("Items in queue:" + q.size());
			} else if (choice.equalsIgnoreCase("f")) {
				System.out.println("Front of queue:" + q.front());
			} else {
				System.out.println("quitting");
			}
		} while (!choice.equalsIgnoreCase("q"));
	}
}
