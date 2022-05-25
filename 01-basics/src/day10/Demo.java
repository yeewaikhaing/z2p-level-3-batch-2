package day10;

public class Demo {

	public static void main(String[] args) {
		Student std = new Student(1, "Aung Aung", "09123456789");
		std.display();// super class's method
		System.out.println("Rno - " + std.getRno());
	}
}
