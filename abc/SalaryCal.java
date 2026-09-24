package Interface;

interface  SalaryCal {
  abstract void calSal();
  
}
class Developer implements SalaryCal{
	double basic;
	public Developer(double basic) {
		this.basic = basic;
	}
	@Override
	public void calSal() {
		System.out.println(basic+1000);
	}
}
class Tester implements SalaryCal{
	double sal;
	public Tester(double sal) {
		this.sal = sal;
	}
	@Override
	public void calSal() {
		System.out.println(sal+500);
	}
}
class MainClass{
	public static void main(String[] args) {
		SalaryCal s1 = new Developer(20000);
		SalaryCal s2 = new Tester(10000);
		s1.calSal();
		s2.calSal();
	}
}