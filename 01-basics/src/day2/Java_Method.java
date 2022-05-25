package day2;

public class Java_Method {

	int num1 = 10;// instance field
	static int num2 = 20;// static field
	
	public void instatnce_method() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		//static_method();
	}
	
	public static void static_method() {
		// can's access because num1 is instance data
		//System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		//Java_Method obj = new Java_Method();
		//obj.instatnce_method();
	}
	public static void main(String[] args) {
		Java_Method obj = new Java_Method();
		
		obj.instatnce_method();
		
		static_method();
		//Java_Method.static_method();
	}
}
