
public class BankAccount {
	
	 double balance;
	
	

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double depositAmnt) {
		 balance = balance + depositAmnt;
	}
	
	public void withdraw(double wthdrwAmnt) {
		balance = balance - wthdrwAmnt;
	}
	
}


