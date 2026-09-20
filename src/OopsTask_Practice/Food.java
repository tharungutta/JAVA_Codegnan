package OopsTask_Practice;

public class Food {
    void prepare() {
	   System.out.println("Food is preparing");
   }
}
class Pizza extends Food{
	@Override
	 void prepare() {
		System.out.println("Pizza is preparing..");
	}
}
class Burger extends Food{
	@Override
	void prepare() {
		System.out.println("Burger is preparing...");
	}
}
class Biryani extends Food{
	@Override
	void prepare() {
		System.out.println("Biryani is preparing..");
	}
	public static void main(String[] args) {
		Food f1 = new Pizza();
		f1.prepare();
		Food f2 = new Burger();
		f2.prepare();
		Food f3 = new Biryani();
		f3.prepare();
	}
}
