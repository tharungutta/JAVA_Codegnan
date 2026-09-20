package OopsTask_Practice;

public class AreaCalculator {
	double area = 0;
  public void area(int side) {
	  area = side*side;
	  System.out.println("Area of square:"+area);
  }
  public void area(int len, int bre) {
	  area = len*bre;
	  System.out.println("Area of Rec:"+area);
  }
  public void area(double radius) {
	  area = 3.14*radius*radius;
	  System.out.printf("Area of circle:%.2f",+area);
	  System.out.println();
  }
  public static void main(String[] args) {
	AreaCalculator a1 = new AreaCalculator();
	a1.area(2);
	a1.area(12.0);
	a1.area(10, 20);
}
}
