package Practice_Oops_Scenario;

public class Bike extends Vehicle {
	String regNo;
	String Name;
	double duration;
    Bike(String a, String b, double c){
    	this.regNo = a;
    	this.Name = b;
    	this.duration = c;
    }
    @Override
    void parkingCharge() {
    	System.out.println(" Bike Owners Name :"+Name);
    	System.out.println("Bike Registration Number :"+regNo);
    	System.out.println("Parking Duration:"+duration);
    	double fee = duration*Bcost;
    	System.out.println("Parking fee:"+fee);
    }
}
