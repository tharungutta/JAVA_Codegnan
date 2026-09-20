package OopsTask_Practice;
import java.util.*;
public class Student1 {
   private int marks;
   public void setmarks(int marks) {
	   if(marks>=0 && marks<=100) {
		   this.marks = marks;
	   }else {
		   System.out.println("Invalid marks");
	   }
   }
   public int getmarks() {
	   return marks;
   }
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student1 s1 = new Student1();
	System.out.println("Enter the marks");
	s1.setmarks(sc.nextInt());
	System.out.println(s1.getmarks());
}
}
