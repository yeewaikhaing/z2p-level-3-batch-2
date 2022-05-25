package day11.abstraction;

public class InterfacePolymophism {

	public static void main(String[] args) {
		Flying[] data = new Flying[3];
		
		data[0] = new Bird();
		data[1] = new Airplane();
		data[2] = new Human();
		
		for(var i = 0; i < data.length;i++)
			data[i].fly();//[2].fly()
	}
}
