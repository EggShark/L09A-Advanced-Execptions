public class BankAccount {
	private double balance;
	
	public BankAccount(double bal) {
		this.balance = bal;
	}
	
	public void withdraw(double amount) throws NegativeBalanceExecption {
		// if amount is greater than balance, throws exception 
		if (amount > this.balance) {
			// pass negative value into 
			throw new NegativeBalanceExecption(Math.abs(this.balance - amount));
		}
		// otherwise, update balance
		this.balance -= amount;
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceExecption {
		if (amount > this.balance) {
			throw new NegativeBalanceExecption();
		}
		
		this.balance -= amount;
	}

}
