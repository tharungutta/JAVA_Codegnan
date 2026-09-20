package OopsTask_Practice;

public class BankAccount {
  private int accountNumber;
  private String accountHolderName;
  private double balance;
  public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

// deposit 
public void deposit(double amount) {
	balance = balance+amount;
}
//withdraw
public void withdraw(double amount) {
	if(amount<=balance) {
		balance -= amount;
	}else {
		System.out.println("Insufficient balance");
	}
}
//balance
public void balance() {
	System.out.println("Balance:"+balance);
}
public static void main(String[] args) {
	BankAccount b1 = new BankAccount();
	b1.setAccountNumber(100);
	b1.setAccountHolderName("Tharun");
	b1.deposit(10000);
	b1.withdraw(4000);
	System.out.println(b1.getAccountNumber());
	System.out.println(b1.getAccountHolderName());
    b1.balance();
}


  
}
