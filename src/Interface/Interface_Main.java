package Interface;

public class Interface_Main {
  public static void main(String[] args) {
	Manager m1 = new Manager();
	m1.display();
	m1.calSal();
	Employee e1;                     // Reference variable
	e1 = m1;
	e1.display();
	e1.calSal();
}
}
