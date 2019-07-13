import javax.swing.JFrame;

public class BankAccountViewer {

	public static void main(String[] args) {

		BankAccount gabesAccount = new BankAccount(1000);

		JFrame gabesFrame = new BankAccountFrame(gabesAccount);
		gabesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gabesFrame.setVisible(true);

	}

}
