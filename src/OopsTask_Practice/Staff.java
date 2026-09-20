package OopsTask_Practice;

public class Staff {
  String name;
  int age;
}
class Doctor extends Staff{
	String spec;
	Doctor(String name,int age,String spec){
		this.name = name;
		this.age = age;
		this.spec = spec;
	}
	void display() {
		System.out.println("Doctor Name:"+name);
		System.out.println("Doctor Age:"+age);
		System.out.println("Specilization:"+spec);
	}
}
class Nurse extends Staff{
	String shift;
	Nurse(String name,int age,String shift){
		this.name = name;
		this.age = age;
		this.shift = shift;
	}
	void display() {
		System.out.println("Doctor Name:"+name);
		System.out.println("Doctor Age:"+age);
		System.out.println("Shift:"+shift);
	}
	public static void main(String[] args) {
		Doctor d1 = new Doctor("Tharun",22,"ENT");
		Nurse n1 = new Nurse("Jyothi",21,"Mrng");
		d1.display();
		n1.display();
	}
}
