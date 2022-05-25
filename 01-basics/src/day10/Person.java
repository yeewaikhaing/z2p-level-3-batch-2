package day10;

public class Person {

	private String name;
	protected String phone;
	
	
	public Person(String name, String phone) {//"Aung Aung", "09123456789"
		super();
		this.name = name; // Aung Aung
		this.phone = phone; // 09123456789
	}
	
	void display() {
		System.out.println("Name - " + name);
		System.out.println("Phone - " + phone);
	}
}
