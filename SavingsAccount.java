//methods and fields defined in this class are exclusively for objects of this class.
public class SavingsAccount extends Bankaccount {
	public SavingsAccount(double rate) {
		intrestRate = rate;
		
	}
	public void addIntrest() {
		double intrest = getBalance() * intrestRate / 100;
		deposit(intrest);
		
	}
	
	private double intrestRate;
	
}
