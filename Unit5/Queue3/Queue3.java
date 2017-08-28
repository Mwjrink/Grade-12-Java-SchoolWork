/* Max Rink
 * ICS4U
 * February 2 2016
 * Queue3.java
 * a class for testing a queue
 */
package Unit5.Project12;

import java.util.Scanner;

public class Queue3 {
	public static void main(String[] args) {
		Queue q = new Queue();
		Scanner input = new Scanner(System.in);
		String choice;
		Object num;
		do {
			System.out.print("Add/Remove/Count/Front/Quit: ");
			choice = input.next();
			if (choice.equalsIgnoreCase("a")) {
				System.out.print("Number to add: ");
				num = input.nextInt();
				q.enqueue(num);
			} else if (choice.equalsIgnoreCase("r")) {
				if (q.size() == 0) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Dequeueing:" + q.dequeue());
				}
			} else if (choice.equalsIgnoreCase("c")) {
				System.out.println("Items in queue:" + q.size());
			} else if (choice.equalsIgnoreCase("f")) {
				System.out.println("Front of queue:" + q.front());
			} else {
				System.out.println("quitting");
			}
		} while (!choice.equalsIgnoreCase("q"));
		input.close();
	}
}
