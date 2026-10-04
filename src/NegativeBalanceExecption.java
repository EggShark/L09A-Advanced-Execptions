import java.io.PrintWriter;   // Import the FileWriter class
import java.io.File;
import java.io.IOException;  // Import the IOException class

public class NegativeBalanceExecption extends Exception {
	private double negativeBalance;
	
	// Constructor if not given a balance amount - used by quickWithdraw()
	public NegativeBalanceExecption() {
		// Print simple error
		super("Error: negative balance");
	}
	
	// Constructor to accept the amount that balance is exceeded by - used by withdraw()
	public NegativeBalanceExecption(double bal) {
		// Create detailed output for the user
		super("Amount exceeds balance by " + bal);

		try {
			File f = new File("logfile.txt");
			PrintWriter writer = new PrintWriter(f);
			writer.println("Amount exceeds balance by " + bal);
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Something went wrong writing the file");
			e.printStackTrace();
		}
		
		this.negativeBalance = bal;
	}
	
	public String toString() {
		return "Balance of " + this.negativeBalance + " is not allowed";
	}
}
