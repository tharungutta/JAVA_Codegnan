package Practice_If_Else_Scenario_Questions;
// Hotel Room Booking
import java.util.Scanner;

public class Example_L3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days : ");
        int days = sc.nextInt();
        System.out.println("Enter the Room type (Standard/Deluxe/Suite) : ");
        String type = sc.next();
        double bill = 0; 
        if(type.equalsIgnoreCase("Standard")) {
            bill = 500 * days;
        } else if(type.equalsIgnoreCase("Deluxe")) {
            bill = 1500 * days;
        } else if(type.equalsIgnoreCase("Suite")) {
            bill = 3000 * days;
        } else {
            System.out.println("Enter the correct details");
        }
        System.out.println("Bill amount : " + bill);

        sc.close();
    }
}

