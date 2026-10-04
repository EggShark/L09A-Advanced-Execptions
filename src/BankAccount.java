public class BankAccount {
	private double balance;
	
	public BankAccount(double bal) {
		this.balance = bal;
	}
	
	public void withdraw(double amount) throws NegativeBalanceException {
		// if amount is greater than balance, throws exception 
		if (amount > this.balance) {
			// pass negative value into Exception
			throw new NegativeBalanceException(Math.abs(this.balance - amount));
		}
		// otherwise, update balance
		this.balance -= amount;
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceException {
		if (amount > this.balance) {
			throw new NegativeBalanceException();
		}
		
		this.balance -= amount;
	}

}
