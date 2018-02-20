
public class Bankaccount {
	public Bankaccount() {
		balance = 0;
		accountNumber = 0;
	}
	public Bankaccount (double initialBalance, int anAccountnumber) {
		balance = initialBalance;
		accountNumber = anAccountnumber;
	}
	public void deposit (double amount) {
		double newbalance = balance + amount;
		balance = newbalance;
	}
	public void withdraw (double amount) {
		double newbalance = balance - amount;
		balance = newbalance;		
	}
	public double getbalance() {
		return balance;
	}
	public int getAccountnumber() {
		return accountNumber;
	}
	private double balance;
	private int accountNumber;
	

}
