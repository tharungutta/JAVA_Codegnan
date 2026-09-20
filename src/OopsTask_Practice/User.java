package OopsTask_Practice;

public class User {
    String name;
    String email;
}
class Customer extends User{
	String address;
	int orderCount;
	Customer(String name, String email, String address, int orderCount){
		this.name = name;
		this.email = email;
		this.address = address;
		this.orderCount = orderCount;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Address:"+address);
		System.out.println("Order Count:"+orderCount);
	}
}
class Admin extends User{
	String dept;
	int level;
	Admin(String name, String email, String dept, int level){
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.level = level;
	}
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Dept:"+dept);
		System.out.println("access level:"+level);
	}
	public static void main(String[] args) {
		Customer c1 = new Customer("Tharun","tharungutta123@gmail.com","Hyd",20);
		Admin a1 = new Admin("Jyothi","jyothibadisha@gmail.com","It",5);
		c1.display();
		a1.display();
	}
}
