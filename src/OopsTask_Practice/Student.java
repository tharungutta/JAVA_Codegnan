package OopsTask_Practice;

public class Student {
    int stuId;
    String Name;
    int marks;
    Student(int stuId, String Name, int marks){
    	this.stuId = stuId;
    	this.Name = Name;
    	this.marks = marks;
    }
    void display() {
    	System.out.println("StudentId:"+stuId);
    	System.out.println("StudentName:"+Name);
    	System.out.println("marks:"+marks);
    }
}

class CollegeStudent extends Student{
	String course ;
	String collegeName;
	CollegeStudent(String course, String collegeName){
		super(100,"Tharun",6000);
		this.course = course;
		this.collegeName = collegeName;
	}
	void show() {
		System.out.println("Course:"+course);
		System.out.println("collegeName:"+collegeName);
	}
	public static void main(String[] args) {
//		CollegeStudent c1 = new CollegeStudent("ECE","SRM");
//		c1.display();
//		c1.show();
		Student s1 = new CollegeStudent("ECE","SRM");   // upcasting     , once the reference is upcasted we can't access child class properties
		s1.display();
		CollegeStudent c1 = (CollegeStudent)s1;    // downcasting        , to access child class properties we are doing downcasting
		c1.display();
		c1.show();
		
	}
}