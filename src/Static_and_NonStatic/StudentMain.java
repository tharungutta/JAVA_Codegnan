package Static_and_NonStatic;

public class StudentMain {
   public static void main(String[] args) {
	Student s1 = new Student();
	s1.setStuno(100);
	s1.setStumarks(500);
	System.out.println(s1.getStuno());
	System.out.println(s1.getStumarks());
}
}
