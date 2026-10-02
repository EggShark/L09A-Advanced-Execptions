
public class BankAccount {
	private double balance;
	
	public BankAccount(double bal) {
		this.balance = bal;
	}
	
	public void withdraw(double amount) throws NegativeBalanceExecption {
		// takes parameter to withdraw amount
		// if amount is greater than balance, throws exception 
			//(pass negative value to exception, but make it positive) 
		// otherwise, update balance
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceExecption {
		if (amount > this.balance) {
			throw new NegativeBalanceExecption();
		}
		
		this.balance -= amount;
	}

}
