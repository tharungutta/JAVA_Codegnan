package Control_Statements;

public class Switch_Enum {
  public static void main(String[] args) {
	enum Days{                                              // Enum is used from java 1.5 version
		MONDAY,                                             // enum - enumeration
		TUESDAY,
		WEDNESDAY
	}
	Days d1 = Days.MONDAY;
	switch(d1) {
	case MONDAY:
	{
		System.out.println("This case is MONDAY");
		break;
	}
	case TUESDAY:
	{
		System.out.println("This case is TUESDAY");
		break;
	}
	default:
		System.out.println("default block");
		break;
	}
}
}
