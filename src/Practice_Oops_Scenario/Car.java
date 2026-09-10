package Practice_Oops_Scenario;

public class Car extends Vehicle {
	String regNo;
	String Name;
	double duration;
    Car(String a, String b, double c){
    	this.regNo = a;
    	this.Name = b;
    	this.duration = c;
    }
    @Override
    void parkingCharge() {
    	System.out.println(" Car Owners Name :"+Name);
    	System.out.println("Car Registration Number :"+regNo);
    	System.out.println("Parking Duration:"+duration);
    	double fee = duration*Ccost;
    	System.out.println("Parking fee:"+fee);
    
}
}
