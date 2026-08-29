package Practice_self;
// to check given number is spy number or not
public class Example_3 {
  public static void main(String[] args) {
	int num = 132;
	int lastDigit = 0;
	int sum = 0, product =1;
	while(num>0) {
		lastDigit = num%10;
		sum = sum+lastDigit;
		product = sum*lastDigit;
		num = num/10;
	}
	if(sum == product) {
		System.out.println("It is a spy number");
	}else {
		System.out.println("It is not a spy number");
	}
}
}
