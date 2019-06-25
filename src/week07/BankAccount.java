package week07;

public class BankAccount {
	// Properties
	private double balance;
	private String name;

	// Custom Methods
	public BankAccount(double balance, String name) {
		this.name = name;
		this.balance = balance;
	}

	public double deposit(double money) {
		double deposit = 0;
		return deposit;
	}

	public double withdrawl(double mony) {
		double withdrawl = 0;
		return withdrawl;
	}

	// Getters And Setters

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
