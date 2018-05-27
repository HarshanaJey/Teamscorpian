package entities;

public class BankAccount {
	private String AccountHolder;
	private float AccountBalance;
	
	
	public BankAccount(String accountHolder, float accountBalance) {
		super();
		AccountHolder = accountHolder;
		AccountBalance = accountBalance;
	}
	
	public BankAccount() {
		super();
		AccountBalance=1000;
	}

	public static BankAccount getAccount(String name) {
		return new BankAccount();
	}
	
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public float getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		AccountBalance = accountBalance;
	}
	
}
