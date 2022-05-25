package day8;

public class Static_Fields {

	public static void main(String[] args) {
		try {
			// create obj and initialize
			Employee emp1 = new Employee();
			emp1.initData("Aung Aung", 500000);
			emp1.viewInformation();
			Employee emp2 = new Employee();
			emp2.initData("Su Su", 600000);
			Employee emp3 = new Employee();
			emp3.initData("Cherry", 300000);
			// display
			emp1.showData();
			System.out.println("-------");
			emp2.showData();
			System.out.println("------");
			emp3.showData();
			
			emp3.changeData("Cherry", 350000);
			System.out.println("After change salary: " + emp3.salary);
			emp3.name = "Hla Hla";
			System.out.println("AFter change name: " + emp3.name);
			//emp3.empId = 5;
			
			Employee.changeNoOfEmployee(5);
			
			Employee emp4 = new Employee();
			emp4.initData("Naung Naung", 450000);
		} catch (AppException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
class Employee {
	static int no_of_employee = 3;
	static int next_id = 1;
	static final float bonus = 2.5f;
	
	final int empId;
	String name;
	int salary;
	
	Employee() throws AppException {
		if(next_id > no_of_employee) { // 4 > 3
			throw new AppException("Sorry!Limited number has been reached");
		}
		this.empId = next_id;
		next_id++;
		
	}
	void initData(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	void changeData(String edit_name, int edit_salary) {
		if(!name.equalsIgnoreCase(edit_name))
			this.name = edit_name;
		if(salary != edit_salary)
			this.salary = edit_salary;
	}
	void showData() {
		System.out.println("Id: " + this.empId);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}
	static void changeNoOfEmployee(int no) {
		no_of_employee = no;
		//this.name = "abc";
		//salary = 10000;
		//showData();
		//test();
	}
	void viewInformation() {
		System.out.println("Total Employee: " + no_of_employee);
		System.out.println("Current Information");
		showData();
		System.out.println("Next employee no: " + next_id);
	}
	static void test() {
		
	}
}
class AppException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppException(String msg) {
		super(msg);
	}
}
