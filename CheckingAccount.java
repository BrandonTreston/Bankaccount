/* 
 *Inheriting 3 methods and 2 fields
 * ~~~~~~~Methods~~~~~~
 * getBalance()
 * deposit()
 * withdraw()
 * 
 * ~~~~~~~Fields~~~~~~~~
 * private int balance
 */
public class CheckingAccount extends Bankaccount {
	
	public CheckingAccount(double initialBalance, int accountNumber) {
		super(initialBalance, accountNumber);
		transactionCount = 0;
		
	}
	
	public void deposit(double amount){
		transactionCount++;
		super.deposit(amount); //the keyword "super" goes and calls deposit() from the superclass
		
	}		//exists in Bankaccount and CheckingAccount, overrides
	
	public void withdraw(double amount) {
		transactionCount++;
		super.withdraw(amount);
		
	}		//exists in Bankaccount and CheckingAccount, overrides
	
	public void deductFees() {
		if (transactionCount > freeTransactions) {
			double fees = transactionFee * (transactionCount - freeTransactions);
			super.withdraw(fees);
		}
		transactionCount = 0;

	}		//defined in CheckingAccount, does not override
	
	public void transfer(double amount, Bankaccount other) {
		super.withdraw(amount);
		other.deposit(amount);
	}
	private int transactionCount;
	private static final int freeTransactions = 3;
	private static final double transactionFee = 2.0;
	//also, inherits the fields balance, and number from Bankaccount
}
