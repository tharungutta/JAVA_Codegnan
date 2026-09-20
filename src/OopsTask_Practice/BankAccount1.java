package OopsTask_Practice;

 abstract public class BankAccount1 {
    int accNumber;
    String name;
    double amount = 1000, interest = 0.0;
    BankAccount1(int accNumber, String name){
    	this.accNumber = accNumber;
    	this.name = name;
    }
    abstract void calInterest();
}
class SavingsAccount extends BankAccount1{
	SavingsAccount(int accNumber, String name){
		super(accNumber, name);
	}
	@Override
	void calInterest(){
		interest = amount*0.2;
		System.out.println("Interest amount:"+interest);
	}
}
class CurrentAccount extends BankAccount1{
	CurrentAccount(int accNumber, String name){
		super(accNumber, name);
	}
	@Override
    void calInterest() {
		interest = amount*0.05;
		System.out.println("Interst for current:"+interest);
	}
	public static void main(String[] args) {
		BankAccount1 b1 = new SavingsAccount(123, "Tharun");
		b1.calInterest();
		BankAccount1 b2 = new CurrentAccount(456,"Jyothi");
		b2.calInterest();
	}
}
