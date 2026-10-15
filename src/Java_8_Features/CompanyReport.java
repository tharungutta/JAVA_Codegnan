package Java_8_Features;

interface ReportGenerator{
	public void generateReport();
	default void printHeader() {
		System.out.println("======================");
		System.out.println("======My Logo==========");
		System.out.println("=======================");
	}
}
class Sales implements ReportGenerator{

	@Override
	public void generateReport() {
		printHeader();
		System.out.println("Sales report is : 900");
	}
}
class attendence implements ReportGenerator{

	@Override
	public void generateReport() {
		printHeader();
		System.out.println("No of students present is : 69");
	}
	
}
public class CompanyReport {
     public static void main(String[] args) {
		ReportGenerator sales = new Sales();
		sales.generateReport();
		ReportGenerator att = new attendence();
		att.generateReport();
	}
}
