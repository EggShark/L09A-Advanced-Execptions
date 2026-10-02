import java.io.PrintWriter;   // Import the FileWriter class
import java.io.File;
import java.io.IOException;  // Import the IOException class

public class NegativeBalanceExecption extends Exception {
	private double negativeBalance;
	
	public NegativeBalanceExecption() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceExecption(double bal) {
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
