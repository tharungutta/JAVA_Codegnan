package Java_8_Features;
interface EmployeeService{
	public void displayInfo(int empid, String empName);
	public static boolean isVaildEmployee(int empid) {
		return empid>=999 && empid<=9999;
	}
}
class HrService implements EmployeeService{

	@Override
	public void displayInfo(int empid, String empName) {
		System.out.println("EMployee id:"+empid);
		System.out.println("Employee Name:"+empName);
	}	
}

public class EmployeeDemo1 {
   public static void main(String[] args) {
	 int empid = 2222;
	 if(EmployeeService.isVaildEmployee(empid)) {
		  HrService hr = new HrService();
		  hr.displayInfo(empid, "Tharun");
	 }else {
		 System.out.println("Invalid input");
	 }
}
}
