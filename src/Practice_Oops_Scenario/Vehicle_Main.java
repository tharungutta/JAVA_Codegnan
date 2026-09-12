package Practice_Oops_Scenario;
import java.util.Scanner;
public class Vehicle_Main {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the vehicle type : ");
	String type = sc.nextLine();
	type = type.toLowerCase();
	switch(type) {
	case "bike":{
		System.out.println("Enter the Bike Owners name :");
		String name = sc.nextLine();
		System.out.println("Enter the bike registration number :");
		String reg = sc.next();
		System.out.println("Enter the parking duration :");
		double duration = sc.nextDouble();
		Bike b1 = new Bike(reg, name,duration);
		b1.parkingCharge();
		break;
	}
	case "car":{
		System.out.println("Enter the Car Owners name :");
		String name = sc.nextLine();
		System.out.println("Enter the Car registration number :");
		String reg = sc.next();
		System.out.println("Enter the parking duration :");
		double duration = sc.nextDouble();
		Car c1 = new Car(reg, name,duration);
		c1.parkingCharge();
		break;
	}
	case "evcar":{
		System.out.println("Enter the EV Car Owners name :");
		String name = sc.nextLine();
		System.out.println("Enter the EV Car registration number :");
		String reg = sc.next();
		System.out.println("Enter the parking duration :");
		double duration = sc.nextDouble();
		EVCar e1 = new EVCar(reg, name,duration);
		e1.parkingCharge();
		break;
	}
	default:
		System.out.println("Enter correct details");
		
	}
	sc.close();
}
}
