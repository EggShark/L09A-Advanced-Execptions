
public class NegativeBalanceExecption extends Exception {
	private double negativeBalance;
	public NegativeBalanceExecption(double bal) {
		super("Amount exceeds balance by " + bal);
		// TODO log file:
		this.negativeBalance = bal;
	}
}
