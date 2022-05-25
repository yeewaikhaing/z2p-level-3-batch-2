package day7;

public class Demo {

	public static void main(String[] args) {
		
		Phone p1 = new Phone("iPhone", "pink", 1800000);
		Phone p2 = new Phone("Samsung", "purple", 3800000);
		Phone p3 = new Phone("Vivo", "Black", 1000000);
		
		System.out.println("------ Phone1's Data ------");
		System.out.println("Brand: " + p1.brand + ",Color: " + p1.color + ",Price: " + p1.price);
		p1.call();
		p1.sendSms();
		System.out.println("------ Phone2's Data -------");
		System.out.format("Brand: %s,Colr: %s,Pirce: %d\n", p2.brand, p2.color, p2.price);
		System.out.println("------ Phone3's Data -------");
		System.out.format("Brand: %s,Colr: %s,Pirce: %d\n", p3.brand, p3.color, p3.price);
	}
}
