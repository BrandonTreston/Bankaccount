
public class BankaccountTester {
	public static void main(String[] args) {
		Bankaccount account = new Bankaccount();
		account.deposit(1000);
		account.withdraw(500);
		account.withdraw(400);
		System.out.println(account.getbalance());
		
		
		}
	}