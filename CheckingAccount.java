public class CheckingAccount extends BankAccount {
	final private double fee = 0.15;
	
	public CheckingAccount (String name, double amount) {
		super(name, amount);
		this.setAccountNumber(getAccountNumber() + "-10");
	}
	
	public boolean withdraw (double amount) {
		if (super.withdraw(amount + fee))
			return true;
		return false;
	}
}
