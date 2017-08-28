/* Max Rink
 * ICS4U
 * February 2 2016
 * Bank.java
 * a class for the actions of a bank
 */
package Unit2.Project11;

/**
* Bank class
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	private ArrayList<Account> accounts;

	/**
	 * constructor pre: none post: accounts has been initialized.
	 */
	public Bank() {
		accounts = new ArrayList<Account>();
	}

	/**
	 * Adds a new account to the bank accounts. pre: none post: An account has
	 * been added to the bank's accounts.
	 */

	public void addAccount() {
		Account newAcct;
		double bal;
		String £Name, lName;
		String address;
		Scanner input = new Scanner(System.in);
		System.out.print("First name:  ");
		£Name = input.nextLine();
		System.out.print("Last name:  ");
		lName = input.nextLine();
		System.out.print("Beginning balance:  ");
		bal = input.nextDouble();
		System.out.print("Enter a full address (street, city, state, and zip):  ");
		address = input.next();
		newAcct = new Account(bal, £Name, lName, address); // create acct object
		accounts.add(newAcct); // add account to bank accounts
		System.out.println("Account created. Account ID is:  " + newAcct.getID());
	}

	/**
	 * Deletes an existing account. pre: none post: An existing account has been
	 * deleted.
	 */
	public void deleteAccount(String acctID) {
		int acctIndex;
		Account acctToMatch;
		acctToMatch = new Account(acctID);
		acctIndex = accounts.indexOf(acctToMatch); // retrieve location o£
													// account
		if (acctIndex > -1) {
			accounts.remove(acctIndex); // remove account
			System.out.println("Account removed.");
		} else {
			System.out.println("Account does not exist.");
		}
	}

	/**
	 * Performs a transaction on an existing account. A transCode of 1 is for
	 * deposits and a transCode of 2 is for withdrawals. pre: trans Code is 1 or
	 * 2. post: A transaction has occurred for an existing account.
	 */
	public void transaction(int transCode, String acctID, double amt) {
		int acctIndex;
		Account acctToMatch, acct;
		acctToMatch = new Account(acctID);
		acctIndex = accounts.indexOf(acctToMatch); // retrieve location of
													// account
		if (acctIndex > -1) {
			acct = accounts.get(acctIndex); // retrieve object to modify
			if (transCode == 1) {
				acct.deposit(amt);
				accounts.set(acctIndex, acct); // replace object with updated
												// object
				System.out.println(acct);
			} else if (transCode == 2) {
				acct.withdrawal(amt);
				accounts.set(acctIndex, acct); // replace object with updated
												// object
				System.out.println(acct);
			}
		} else {
			System.out.println(" Account does not exist.");
		}
	}

	/**
	 * Displays the account information, including the current balance, for an
	 * existing account. pre: none post: Account information, including balance,
	 * has been displayed.
	 */
	public void checkBalance(String acctID) {
		int acctIndex;
		Account acctToMatch, acct;
		acctToMatch = new Account(acctID);
		acctIndex = accounts.indexOf(acctToMatch); // retrieve location of
													// account
		if (acctIndex > -1) {
			acct = accounts.get(acctIndex); // retrieve object to display
			System.out.println(acct);
		} else {
			System.out.println("Account does not exist.");
		}
	}
	
	
	public void modifyAccount(String acctID){
		int index = linear((Account[])accounts.toArray(), acctID);
		Scanner input = new Scanner(System.in);
		String street, city, state, zip;
		System.out.println("Enter a new street: ");
		street = input.next();
		System.out.println("Enter a new city: ");
		city = input.next();
		System.out.println("Enter a new state: ");
		state = input.next();
		System.out.println("Enter a new zip: ");
		zip = input.next();
		accounts.get(index).changeAddress(street, city, state, zip);
	}
	
	public int linear(Account[] arr, String look) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getID().equals(look)){
				return i;
			}
		}

		return -1;
	}
}