package Sealed_class;

sealed  public  class Vehicle permits Car, Bus, Bike {    // if the class sealed it should use the keyword permit
    void start() {
    	System.out.println("Vehicle started.....");
    }
}

final class Car extends Vehicle{                           // if we inherit sealed class it should be again either final , sealed , non- sealed
	
}

sealed class Bus extends Vehicle permits volvoBus,sleeperbus {
	
}
non-sealed class Bike extends Vehicle{
	
}

//class EvCAr extends Car{                           // we can't inherit because car is final class
//	 
//}
final class volvoBus extends Bus{                         // if we inherit sealed class it should be again either final , sealed , non- sealed
	
}
final class sleeperbus extends Bus{
	
}

class evBike extends Bike{                    // we can inherit non-sealed class as many no of times 
	
}
class sportsBike extends Bike{
	
}
 class Main{
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		Bus b1 = new Bus();

		c.start();
		b.start();
		b1.start();
	
	}
}
