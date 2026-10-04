
public class ATM {
	private BankAccount account;
	
	public ATM() {
		this.account = new BankAccount(500.0);
		// TODO Auto-generated constructor stub
	}
	
	public void handleTransactions() {
		// try withdraw
		try {
			this.account.withdraw(600.0);
		} 
		catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		// try quick withdraw
		try {
			this.account.quickWithdraw(600.0);
		} 
		catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
			ATM atm = new ATM();
			atm.handleTransactions();
	}

}
