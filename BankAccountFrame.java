import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JFrame {

	BankAccount account;

	private JLabel amount = new JLabel("Amount");
	private JTextField amntTextField = new JTextField(10);
	private JButton deposit = new JButton("Deposit");
	private JButton withdraw = new JButton("Withdraw");
	private JLabel balance = new JLabel();

	public BankAccountFrame(BankAccount b) {
		account = b;
		depositListener d = new depositListener();
		deposit.addActionListener(d);
		withdrawListener w = new withdrawListener();
		withdraw.addActionListener(w);

		JPanel panel = new JPanel();

		panel.add(amount);
		panel.add(amntTextField);
		panel.add(deposit);
		panel.add(withdraw);
		panel.add(balance);
		add(panel);
		setSize(400, 100);
	}

	class depositListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String x = amntTextField.getText();
			double depAmnt = Double.parseDouble(x);

			account.deposit(depAmnt);

			balance.setText("balance=" + account.getBalance());
		}

	}

	class withdrawListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent f) {
			String y = amntTextField.getText();

			double wthdrwAmnt = Double.parseDouble(y);

			account.withdraw(wthdrwAmnt);

			balance.setText("balance=" + account.getBalance());

		}
	}
}
