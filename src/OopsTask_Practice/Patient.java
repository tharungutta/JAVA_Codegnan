package OopsTask_Practice;

public class Patient {
  private String patientName;
  private int age;
  private int bp;
  
  public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}

public void setAge(int age) {
	if(age>0) {
		this.age = age;
	}else {
		System.out.println("Invalid age");
	}
}
public int getAge() {
	return age;
}
public void updatebp(int bp) {
	if(bp>0) {
		this.bp = bp;
	}else {
		System.out.println("Inavalid bp");
	}
}
public int getBp() {
	return bp;
}
    public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.setPatientName("Tharun");
		p1.setAge(20);
		p1.updatebp(120);
		System.out.println(p1.getPatientName());
		System.out.println(p1.getAge());
		System.out.println(p1.getBp());
	}
 
}
