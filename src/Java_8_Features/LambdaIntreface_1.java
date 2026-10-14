package Java_8_Features;

@FunctionalInterface                                    // if we use this annotation -> only one abstract methods is allowed , to use lambda Expression.
public interface LambdaIntreface_1 {
    public void displayText();
}
//class DemoImpl implements LambdaIntreface_1{
//	@Override
//	public void displayText() {
//		System.out.println("Hello world");
//	}
//}

class Test{
	public static void main(String[] args) {
//		DemoImpl d = new DemoImpl();
//		d.displayText();
			
		// to implement the functional interface using lambda Expression
		  
		LambdaIntreface_1 d = () -> System.out.println("Hello world"); 
		d.displayText();
		
		LambdaIntreface_1 d1 = ()->{ System.out.println("Statement1");
		                             System.out.println("Statement2");
		};
		d1.displayText();
		
	}
}