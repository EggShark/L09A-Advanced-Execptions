
public class ATM {
	private BankAccount account;
	
	public ATM() {
		this.account = new BankAccount(500.0);
		// TODO Auto-generated constructor stub
	}
	
	public void handleTransactions() {
		try {
			this.account.withdraw(600.0);
		} 
		catch (NegativeBalanceExecption e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		// second try-catch
		// calls quickWithdraw() with 600
		// contain same printouts on error
	}
	
	public static void main(String[] args) {
			ATM atm = new ATM();
			atm.handleTransactions();
	}

}
