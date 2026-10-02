
public class BankAccount {
	private double balance;
	
	public BankAccount(double bal) {
		this.balance = bal;
	}
	
	public void withdraw(double amount) throws NegativeBalanceExecption {
		
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceExecption {
		if (amount > this.balance) {
			throw new NegativeBalanceExecption();
		}
		
		this.balance -= amount;
	}

}
