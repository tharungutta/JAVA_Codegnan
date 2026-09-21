package Exception_Handling;

public class InSufficeintFundsException extends Exception {                           // throw Example

	InSufficeintFundsException(String str){
		super(str);
	}
	
}
class BankAccount{
	public static void main(String[] args) {
		int deposit = 10000, withdraw = 30000;
		if(withdraw<=deposit) {
			int balance = deposit - withdraw;
			System.out.println("Balance amount is:"+balance);
		}else {
			try {
			InSufficeintFundsException funds = new InSufficeintFundsException("Funds are not available");
			throw funds;
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}