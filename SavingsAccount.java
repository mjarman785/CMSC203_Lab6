public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount (String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber++;
		this.accountNumber = oldAccount.accountNumber.substring(0, (oldAccount.accountNumber.length() - 2));
		this.accountNumber = this.accountNumber + "-" + savingsNumber;
	}
	
	public void postInterest () {
		super.deposit(this.getBalance() * ((rate / 100) / 12));
	}


	public String getAccountNumber () {
		return this.accountNumber;
	}
}
