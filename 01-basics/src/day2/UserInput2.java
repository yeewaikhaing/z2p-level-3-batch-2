package day2;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
		
		sc.close();
	}
}
