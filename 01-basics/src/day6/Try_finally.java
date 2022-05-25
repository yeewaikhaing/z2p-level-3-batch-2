package day6;

import java.util.Scanner;

public class Try_finally {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		try {
//			
//			System.out.println("Enter salary: ");
//			int salary = Integer.parseInt(sc.nextLine());
//			if(salary == 0) {
//				return;
//			}
//			System.out.println("Your salary is " + salary);
//		}
//		finally {
//			sc.close();
//			System.out.println("It is always executed");
//		}
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter salary: ");
			int salary = Integer.parseInt(sc.nextLine());
			if(salary == 0) {
				return;
			}
			System.out.println("Your salary is " + salary);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			String name = null;
			System.out.println("Len: " + name.length());
		} catch (Exception e) {
			System.err.println("It does not allocate");
		} finally {
			System.out.println("always exected");
		}
		System.out.println("Outside try catch block");
		
	}
}
