
public class Bankaccount {
	public Bankaccount() {
		balance = 0;
	}
	public Bankaccount(double initialBalance, int accountNumber) {
		balance = initialBalance;
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
	public double getBalance() {
		return balance;
		}
	
	public void transfer(double amount, Bankaccount other) {
		this.withdraw(amount);
		other.deposit(amount);
	}
	private double balance;
}
