package day3;

public class Array_1 {

	
	public static void main(String[] args) {
	
		String[] names = new String[3];
		
		names[0] = "Mg Mg";
		System.out.println("leng: " + names.length);
		System.out.println("item: " + names[0]);
		
		int[] a = new int[3];
		System.out.println("a[0] : " + a[0]);
		
		int[] b = new int[] {100, 200, 300};
		System.out.println("b[0]: " + b[0]);
		
		int[] c = {
				10, 20 , 30,10, 20 , 30,10, 20 , 30,10, 20 , 30
		};
		System.out.println("c[1]: " + c[1]);
		System.out.println("Leng of c: " + c.length);
	}
}
