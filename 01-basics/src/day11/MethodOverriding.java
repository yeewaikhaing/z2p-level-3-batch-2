package day11;

public class MethodOverriding {

	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.work();
		
		developer = new FrondEndDeveloper();
		developer.work(); // child's work method
		
		developer = new BackendDeveoper();
		developer.work(); // child's work method
	}
}
class Developer {
	void work() {
		System.out.println("Some work");
	}
	
}
class FrondEndDeveloper extends Developer {
	
	@Override
	void work() {
		System.out.println("doing frontend technologies");
	}
}
class BackendDeveoper extends Developer {

	@Override
	void work() {
		System.out.println("doing backend technologies");
	}
	
}
