package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Employee {

   private String empName;
   private int empSal;
   private String empAdd;
   private String empMail;
   
   public Employee() {
	
}
   public Employee(String empName, int empSal, String empAdd, String empMail) {
	super();
	this.empName = empName;
	this.empSal = empSal;
	this.empAdd = empAdd;
	this.empMail = empMail;
}
   
   public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
   
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + ", empMail=" + empMail + "]";
	}
}

class ClientClass{
	public static void main(String[] args) {
		
		//database 
		HashMap<Integer,Employee> hashMap = new HashMap();
		
		int empid = 100;
		while(true) {
			System.out.println("***Employee Menu***");
			System.out.println("1.Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3.Get employee by ID");
			System.out.println("4.get all Employeees");
			System.out.println("5.Delete Employee by ID");
			
			Scanner sc = new Scanner(System.in);
			int option  = sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Add Employee details");
				System.out.println("Enter employee name:");
				String empName = sc.next();
				System.out.println("Enter employee sal");
				int empSal = sc.nextInt();
				System.out.println("Enter employee Address");
				String empAdd = sc.next();
				System.out.println("Enter employee mail");
				String empMail = sc.next();
				
				Employee emp = new Employee(empName, empSal, empAdd, empMail);
				
				// Store into database
				hashMap.put(++empid, emp);
				System.out.println("Added Successfully:"+empid);
				
				break;
				
			case 2:
				System.out.println("Enter emp Id:");
				int id = sc.nextInt();
				
				System.out.println("Enter employee name:");
				String eName = sc.next();
				System.out.println("Enter employee sal");
				int eSal = sc.nextInt();
				System.out.println("Enter employee Address");
				String eAdd = sc.next();
				System.out.println("Enter employee mail");
				String eMail = sc.next();
				
				Employee updated = new Employee(eName,eSal,eAdd,eMail);
				hashMap.put(id, updated);
				System.out.println("Updated Successfully:"+id);
				
				break;
			case 3:
				System.out.println("***Get Employee Details***");
				System.out.println("Enter the employee id:");
				int id1 = sc.nextInt();
				Employee getEmp = hashMap.get(id1);
				System.out.println(getEmp);
				break;
			case 4:
			Set<Entry<Integer,Employee>>result =	hashMap.entrySet();
			   Iterator<Entry<Integer,Employee>> itr= result.iterator();
			   while(itr.hasNext()) {
				   Entry<Integer,Employee> finalRes= itr.next();
				   System.out.println(finalRes.getKey()+""+finalRes.getValue()+"");
			   }
			   break;
			case 5:
				System.out.println("****Delete Employee details****");
				System.out.println("Enter employeee id:");
				int id2 = sc.nextInt();
				hashMap.remove(id2);
				System.out.println("Employee deleted Sucessfully:"+id2);
				break;
			case 6:
				System.out.println("------Thank You--------");
				System.exit(0);
			default:
				System.out.println("Wrong Selection");
				break;
			}
			
			
		}
	}
}
