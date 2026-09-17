package Exception_Handling;
import java.util.*;
public class IncorrectPinException extends Exception {                    // throws Example
   IncorrectPinException(String str){
	   super(str);
   }
}

class Atm{
	public static void main(String[] args) throws IncorrectPinException {
		Scanner sc = new Scanner(System.in);
		int Opin  = 123;
		int pin  = sc.nextInt();
		if(pin == Opin) {
			System.out.println("Correct pin");
		}else {
			
				throw new IncorrectPinException("pin is incorrect");
			
			
		}
	}
}