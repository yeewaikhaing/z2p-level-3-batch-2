package day10;

public class Student extends Person{

	private int rno;
	// private String name
	// protected String phone
	public Student(int rno, String name, String phone) {//1, "Aung Aung", "09123456789"
		super(name, phone);
		this.rno = rno;//1
	}
	
	public int getRno() {
		return rno;
	}
	
	// void display()
}
