
public class Bankaccount {
	public Bankaccount() {
		balance = 0;
		number = 0;
	}
	public Bankaccount(double initialBalance, int accountNumber) {
		balance = initialBalance;
		number = accountNumber;
	}
	public void deposit(double amount) {
		if( amount >= 0 ) {
		double newBalance = balance + amount;
		balance = newBalance;
		}
		else {
			System.out.println("Error, negative amount");
		}
	}
	public void withdraw(double amount) {
		if( amount >= 0 && amount <= balance) {
		double newBalance = balance - amount;
		balance = newBalance;
		}
		else {
			System.out.println("Error, negative amount");
		}
	}
	public double getBalance(int accountNumber) {
		if(number == accountNumber) {
		return balance;
		}
		else {
			System.out.print("The account is not on file");
			return accountNumber;
		}
	}
	private double balance;
	private int number;
}
