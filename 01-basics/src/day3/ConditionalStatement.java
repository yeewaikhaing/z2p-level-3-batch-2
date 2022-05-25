package day3;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter email: ");
//		String email = sc.nextLine();
//		System.out.print("Enter password: ");
//		String pass = sc.nextLine();
//		
//		if(email.equals("admin@gmail.com") && pass.equals("admin")) {
//			System.out.println("Login Success");
//		}
//		else {
//			System.out.println("Invalid Login");
//		}
//		sc.close();
		
		// if elseif
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter bmi value: ");
		float bmi = Float.parseFloat(sc.nextLine());
		
		if(bmi < 18.5)
				System.out.println("Underweigth");
		else if(bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Normal weight");
		else if(bmi >= 25 && bmi <= 29.9)
			System.out.println("Overweight");
		else
			System.out.println("Obesity");
		sc.close();
	}
}
