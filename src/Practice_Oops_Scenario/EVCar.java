package Practice_Oops_Scenario;

public class EVCar extends Vehicle{
	String regNo;
	String Name;
	double duration;
    EVCar(String a, String b, double c){
    	this.regNo = a;
    	this.Name = b;
    	this.duration = c;
    }
    @Override
    void parkingCharge() {
    	System.out.println(" Bike Owners Name :"+Name);
    	System.out.println("Bike Registration Number :"+regNo);
    	System.out.println("Parking Duration:"+duration);
    	double fee = duration*EVcost;
    	System.out.println("Parking fee:"+fee);
}
}