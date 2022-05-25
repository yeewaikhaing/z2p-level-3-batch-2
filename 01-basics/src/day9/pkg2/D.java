package day9.pkg2;

import day9.pkg1.A;

public class D {

	void test() {
		A obj = new A();
		//obj.number = 100;// different package
		//obj.emp_id = 101; // different package
		obj.name = "Hla"; // public
	}
}
