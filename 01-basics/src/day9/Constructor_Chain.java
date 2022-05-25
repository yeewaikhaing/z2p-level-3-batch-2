package day9;

public class Constructor_Chain {

	public Constructor_Chain() {
		this(7);
		System.out.println("This is default constructor");
		
	}
	public Constructor_Chain(int i) {
		this(100, 200);
		System.out.println("This is one argument constructor");
	}
	public Constructor_Chain(int i, int j) {
		System.out.println("i = " + i + ",j = " + j);
	}
	public static void main(String[] args) {
		Constructor_Chain obj = new Constructor_Chain();
		
	}
}
class Employee {
	private String name;
	Employee() {
		
	}
	Employee(String name) {
		this.name = name;
	}
}
class Teacher extends Employee {
	private String position;
	
	Teacher(String name, String pos) {
		super(name);
		this.position = pos;
	}
}
