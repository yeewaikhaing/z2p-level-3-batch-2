package day10;

public class Method_Overriding {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.show();
		
		cat.sound();
		
		cat.display();
		cat.display("Shwe War");
		
	}
}

class Animal {
	void show() {
		System.out.println("This is show method");
	}
	void sound() {
		System.out.println("Some sound");
	}
}

class Cat extends Animal {
	
	@Override
	void sound() { // overriding method
		System.out.println("Myaung");
	}
	
	void display() {
		System.out.println("This is display with 0 parameter");
	}
	void display(String name) {
		System.out.println("This is display with 2 parameters");
	}
}
