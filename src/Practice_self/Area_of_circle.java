package Practice_self;
// Area of circle
import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("Area :"+area);
	}
}
