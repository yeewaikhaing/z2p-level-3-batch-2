package day10.inheritance;

public class Teacher extends Person{

	private String position;
	
	public Teacher(String name, String pos) {//"David", "Lecturer"
		super(name);
		this.position = pos; // Tutor
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Position - " + position);
		System.out.println("---------------------");
	}
	
	
	
}
