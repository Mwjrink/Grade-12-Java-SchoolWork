/* Max Rink
 * ICS4U
 * February 2 2016
 * LocalBank.java
 * has actions for a local bank branch
 */
package Unit4.Project7;

/** 
* LocalBank2 client code. 
*/

import java.io.*;
import java.util.Scanner;

public class LocalBank {
	public static void main(String[] args) {
		File accountsFile = new File("res/LBAccounts.dat");
		Bank easySave = new Bank(accountsFile);
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;

		/* display menu of choices */
		do {
			System.out.println(" \nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();

			if (action.equalsIgnoreCase("A")) {
				easySave.addAccount();
			} else if (!action.equalsIgnoreCase("Q")) {
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
		easySave.updateAccounts(accountsFile); // write account to file
	}
}
