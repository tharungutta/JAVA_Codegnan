package Control_Statements;
import java.util.Scanner;
public class Continue_Example {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i =0;
	while(i<=n) {
		System.out.println("The value of i is"+i);
		i++;
		if(i==5) {
			i++;
			continue;
		}
	}
	sc.close();
}
}
