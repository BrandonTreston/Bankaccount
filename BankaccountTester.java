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
		System.out.println(account.getBalance(0));
		in.close();
	}

}
