package Userdefined;

public class Student_Main {
   public static void main(String[] args) {
	Student s1 = new Student();
	System.out.println(s1);
	
	Student s2 = new Student();
	System.out.println("comparision of two objects:"+(s1.equals(s2)));  // equals is to compare the hashcode of two objects. 
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
}
}
