import java.util.Scanner;
public class BankaccountTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Balance: ");
		Bankaccount account =  new Bankaccount(in.nextDouble(), 0);
		System.out.print("Enter Deposit Amount: ");
		account.deposit(in.nextDouble());
		System.out.print("Enter Withdraw Amount: ");
		account.withdraw(in.nextDouble());
		System.out.print("Balance is: ");
		System.out.println(account.getBalance());
		in.close();	
		
		SavingsAccount savings = new SavingsAccount(.5);
		CheckingAccount checking = new CheckingAccount(100, 1);
		
		savings.deposit(10000);
		savings.transfer(2000, checking);
		checking.withdraw(1500);
		checking.withdraw(80);
		savings.transfer(1000, checking);
		checking.withdraw(400);
		savings.addIntrest();
		checking.deductFees();
		
		System.out.println("savings balance is: " +savings.getBalance());
		System.out.println("checking balance is: " + checking.getBalance());
	}

}
