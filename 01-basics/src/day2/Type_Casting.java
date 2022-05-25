package day2;

public class Type_Casting {

	public static void main(String[] args) {
		int a = 200;
		long b = a;// implicit casting
		double c = b; // implicit casting
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("---- explicit casting -----");
		double d = 57.17;
		int i = (int) d; // decimal -> whole number
		
		System.out.println("d = " + d);
		System.out.println("i = " + i);
		
	}
}
