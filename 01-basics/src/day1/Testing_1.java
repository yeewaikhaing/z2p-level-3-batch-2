package day1;

public class Testing_1 {
	int rno;
	static float bonus;
	void display() {
		int barCode = 1001;
		String name = "Coffee";
		
		System.out.println("Barcode: " + barCode);
		System.out.println("Name: " + name);
		
		var price = "Su Su";
	}
	public void addNumbers(int a, int b) {
		System.out.println(a + " + " + b + " = "+ (a+b));
	}
	
	public static void main(String[] args) {
		
		Testing_1 obj = new Testing_1();
		obj.addNumbers(100, 200);
		

	}

}
