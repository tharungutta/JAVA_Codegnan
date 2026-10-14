package Java_8_Features;

@FunctionalInterface
public interface LambdaInterface_3 {
  // public void concat(String a, String b);
	public String concat(String a, String b);
}

class Test3{
	public static void main(String[] args) {
		//LambdaInterface_3 d = (a,b)-> System.out.println(a.concat(b));
		LambdaInterface_3 d = (a,b) -> a+b;
		String res = d.concat("Tharun", "Jyothi");
		System.out.println(res);
	}
}
