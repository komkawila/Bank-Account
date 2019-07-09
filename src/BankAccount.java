public class BankAccount {
	private double balance;
	private double interest;
	
	int accountNumber;
	String customerName;
	private double interestRate;
	
	String transactions;
	
	double showBalance() {
		return(balance);
	}
	
	void withdraw(double withraw) {
		if(balance >= withraw)
			balance = balance - withraw;						
	}
	
	void addinterest(double interestRate) {
		this.interestRate = interestRate;
	}
	
	void deposit(double deposit) {
		balance+=deposit;
		balance+=(balance*this.interestRate)/365;
	}
	
	//customerName
	void addcustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	//accountNumber
	void addaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

		
}