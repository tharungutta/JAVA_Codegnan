package Userdefined;

import java.util.Objects;

public class Student {	
	private int stuNo;
	private double stuMarks;
	   
   public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public double getStuMarks() {
		return stuMarks;
	}
	public void setStuMarks(double stuMarks) {
		this.stuMarks = stuMarks;
	}
	@Override
	public String toString() {
//		return "Student [stuNo=" + stuNo + ", stuMarks=" + stuMarks + "]";    // to print our own values, we are overriding toString method
		return "welcome to java";
	}
	@Override
	public int hashCode() {
		return Objects.hash(stuMarks, stuNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(stuMarks) == Double.doubleToLongBits(other.stuMarks) && stuNo == other.stuNo;
	}

}
