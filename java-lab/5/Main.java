/**	Develop :25
 	a Java program to create a class Bank that
	maintains two kinds of account for its customers, one
	called savings account and the other current account. The
	savings account provides compound interest and
	withdrawal facilities but no cheque book facility. The
	current account provides cheque book facility but no
	interest. Current account holders should also maintain a
	minimum balance and if the balance falls below this level,
	a service charge is imposed.
	Create a class Account that stores customer name,
	account number and type of account. From this derive the
	classes Cur-acct and Sav-acct to make them more specific
	to their requirements. Include the necessary methods in
	order to achieve the following tasks:
	a) Accept deposit from customer and update
	the balance.
	b) Display the balance.
	c) Compute and deposit interest
	d) Permit withdrawal and update the balance
	Check for the minimum balance, impose penalty if
	necessary and update the balance.
	*/
	
import java.util.Scanner;
import java.lang.Math;

abstract class Account{
	
	String customer_name;
	int account_number;
	String account_type;
	double balance;
	Object conduit;

	// A single scanner used throughout
	static Scanner J;
	static int acc_count;
	static{
		J = new Scanner(System.in);
		acc_count = 1;
	}

	// Accept deposit
	void acceptDeposit(){
		System.out.println("Enter the amount you woukld like to deposit : ");
		conduit = (double) J.nextDouble();
		this.balance += (double) conduit; 
		System.out.println("Balance updated!");
		
	}

	// Display balance
	void displayBalance(){
		System.out.println("Your current balance is : " + this.balance);
		
	}

	// Withdrawal
	void withdrawAmount(){
		System.out.println("Enter the amount you want to withdraw : ");
		conduit = (double) J.nextDouble();
		balance -= (double) conduit;
		System.out.println("Withdraw successful!");
		displayBalance();
	}

}	// End of class Account

class SavingsAccount extends Account{

	static int count;
	static int time;
	static double rate;

	static{
		System.out.println("Enter number of times, time over which to calculate interest amnd rate : ");
		count = J.nextInt();
		time = J.nextInt();
		rate = J.nextDouble();
	}

	SavingsAccount(){
		customer_name = J.nextLine();
		account_number = acc_count++;
		account_type = "Saving Account";
	
	}

	// Calculate compound interest and update the balance
	void compoundInterestFactor(){
		balance += balance*(Math.pow((1 + (rate/count)), count*time));
	
		System.out.println("Interest added!");
	}
}	// End of class SavingsAccount

class CurrentAccount extends Account{

	String cheque_book;
	static double minimum_balance;
	static double minimum_penalty;

	static{
		minimum_balance = 300.0;
		minimum_penalty = 200.0;
	}

	CurrentAccount(){
		cheque_book = "";
	} 
		
	// check for minimum balance	
	void checkMinimumBalance(){
		if(balance < minimum_balance){
			this.balance -= minimum_penalty;
			System.out.println("A penalty of " + minimum_penalty + " was imposed to sue to insufficient balance");
		}
	}

	void acceptDeposit(){
		super.acceptDeposit();
		cheque_book += ("Deposited " + ((double) conduit) + "\n");
	}

	void withdrawAmount(){
		super.withdrawAmount();
		cheque_book += ("Withdrew " + (double) conduit + "\n");
		checkMinimumBalance();
	}
	
	void printChequeBook(){
		System.out.println(this.cheque_book);
	}	
	
}	// End of class CurrentAccount

class Main{

	public static void main(String argv[]){
	SavingsAccount sa = new SavingsAccount();
	CurrentAccount ca = new CurrentAccount();
	
	System.out.println("Savings :");
	sa.acceptDeposit();
	sa.displayBalance();
	sa.withdrawAmount();
	sa.compoundInterestFactor();
	sa.displayBalance();

	System.out.println("\nCurrent :");
	ca.acceptDeposit();
	ca.displayBalance();
	ca.withdrawAmount();
	ca.printChequeBook();
	ca.displayBalance();

	}	// End of main
}
