package Practice_self;

public class Example_4 {
   public static void main(String[] args) {
	int num = 9;
	int square = num*num ;
	int sum = 0, lastDigit = 0;
	while(square>0) {
		lastDigit = square%10;
		sum = sum+lastDigit;
		square = square/10;
	}
	if(sum == num) {
		System.out.println("It is neon number");
	}else {
		System.out.println("Not an neon number");
	}
}
}
