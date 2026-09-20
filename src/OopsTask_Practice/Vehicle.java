package OopsTask_Practice;

abstract public class Vehicle {
   abstract void start();
   void end() {
	   System.out.println("Vehicle is end");
   }
}
class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Start with key");
	}
}
class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike starts with self-start");
	}
}
class Bus extends Vehicle{
	@Override
	void start() {
		System.out.println("Start with iginition");
	}
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		v1.end();
		Vehicle v2 = new Bike();
		v2.start();
		v2.end();
		Vehicle v3 = new Bus();
		v3.start();
		v3.end();
	}
}