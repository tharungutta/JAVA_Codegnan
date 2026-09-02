package Static_and_NonStatic;

public class Staticex_Main {
   public static void main(String[] args) {
	
	Static_Ex e1 = new Static_Ex();
	e1.display();
	Static_Ex.show();
	System.out.println(e1.num2);
	System.out.println(Static_Ex.num2);
	
}
}
