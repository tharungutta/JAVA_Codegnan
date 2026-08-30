package Practice_self;
// To check it is a perfect number
public class Perfect_number {
  public static void main(String[] args) {
	int num = 6;
	int sum = 0;
	for(int i=0; i<num;i++) {
		if(num%i ==0) {
			sum = sum+i;
		}
	}
	if(sum == num) {
		System.out.println("It is a perfect number");
	}else {
		System.out.println("Not a perfect number");
	}
}
}
