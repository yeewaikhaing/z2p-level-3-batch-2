package day10.inheritance;

public class Person {

	private String name;
	
	public Person(String name) { // David
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("Name - " + name);
	}
	
//	public void test() {
//		System.out.println("This is test method");
//	}
}
