package Java_8_Features;

 @FunctionalInterface
 interface Lamada_Demo_1 {
    public int add(int a, int b);
}
 
// class NormClass implements Lamada_Demo_1{           // Normal overriding by implements the interface method
//	 @Override
//	 public int add(int a, int b) {
//		 return a+b;
//	 }
// }
 
 class Demo{
	 public static void main(String[] args) {

		 
		 
//		Lamada_Demo_1 l1 = new Lamada_Demo_1() {             // using inner class
//			@Override  
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
//		int res = l1.add(20,30);
//		System.out.println(res);
		 
		 
		 Lamada_Demo_1 l2 = (a,b) -> a+b;         // using lamda Expression
		 System.out.println(l2.add(10, 20));
	}
 }
