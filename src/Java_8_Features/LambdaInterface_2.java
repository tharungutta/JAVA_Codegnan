package Java_8_Features;

@FunctionalInterface
public interface LambdaInterface_2 {
   public void add(int num1, int num2);
}

class Test1{
	public static void main(String[] args) {
		
		LambdaInterface_2 d = (a,b) -> System.out.println(a+b);  
		d.add(10,20);
	}
}