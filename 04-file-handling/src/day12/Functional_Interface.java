package day12;


public class Functional_Interface {
	public static void main(String[] args) {
		
		Interface1 test1 = new Interface1() {
			
			@Override
			public void display(String name) {
				System.out.println(name);
				
			}
		};
		
		test1.display("Aung Aung");
		
		Interface1 test2 = (str) -> System.out.println(str);
		test2.display("Cherry");
		
		Interface3 test3 = (name, pass) -> {
			if(name.equals("jeon") && pass.equals("123"))
				return true;
			else
				return false;
		};
		
		System.out.println((test3.checkLogin("jeon", "123")) ? "Login Success" : "Invalid Login");
		System.out.println((test3.checkLogin("mmit", "123")) ? "Login Success" : "Invalid Login");
		
		Interface2 sum = (a, b) -> a + b;
		Interface2 mul = (a, b) -> a * b;
		Interface2 div = (a, b) -> a / b;
		
		System.out.println("sum: " + sum.operate(100, 50));
		System.out.println("mul: " + mul.operate(100, 50));
		System.out.println("div: " + div.operate(100, 50));
	}
}
