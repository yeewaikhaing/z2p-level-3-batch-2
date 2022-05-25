package day10.inheritance;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("James");
		p1.showInfo(); // call its method
		
		Teacher t1 = new Teacher("Jeon", "Tutor");
		t1.showInfo(); // call its' method
		
		Person p2 = new Teacher("David", "Lecturer");
		p2.showInfo(); // call child's override method
		//p2.test();
		//p2.display();
		
		// data type casting
		int a = 100;
		long b = a; // implicit casting
		
		int c = (int) b;
		
		Person p3 = t1; // implicit casting
		
		Teacher t2 = (Teacher) p2;  //explicit casting/ new Teacher()
			}
}
