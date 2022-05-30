package day20;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {

		// save_with_statement();
		//save_with_prepareStatement();
		//saveEmployee();
		//login();
		viewAll();
	}

	private static void viewAll() {
		try(Connection con = MyConnection.createConnection()) {
			
			String query = "SELECT * FROM employees ORDER BY salary";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("empNo") + "\t");
				System.out.print(rs.getString("password") + "\t");
				System.out.print(rs.getString("email") + "\t");
				System.out.print(rs.getDouble("salary") + "\t");
				System.out.print(rs.getDate("birthday") + "\n");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void login() {
		
		try(Scanner sc = new Scanner(System.in);
				Connection con = MyConnection.createConnection()) {
			
			System.out.print("Enter email: ");
			String email = sc.nextLine();
			System.out.print("Enter password: ");
			String pass = sc.nextLine();
			
			String query = "SELECT empNo,email FROM employees WHERE email = ? AND password = ?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, email);
			pstm.setString(2, pass);
			
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) 
				System.out.println("login Success");
			else
				System.out.println("Login fail");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void saveEmployee() {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			Employee emp = new Employee();
			
			System.out.println("Enter data for employee");
			
			System.out.print("emp no: ");
			emp.setEmpId(Integer.parseInt(sc.nextLine()));
			
			System.out.print("email: ");
			emp.setEmail(sc.nextLine());
			
			System.out.print("password: ");
			emp.setPassword(sc.nextLine());
			
			System.out.print("city: ");
			emp.setCity(sc.nextLine());
			
			System.out.print("salary: ");
			emp.setSalary(Double.parseDouble(sc.nextLine()));
			
			System.out.print("birthday(yyyy-mm-dd): ");
			emp.setBirthday(LocalDate.parse(sc.nextLine()));
			
			//save_with_statement(emp);
			save_wth_prepareStatement(emp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void save_wth_prepareStatement(Employee emp) {
		
		try(Connection conn = MyConnection.createConnection()) {
			
			// query
			String query = "INSERT INTO employees(empNo,email,password,salary,city,birthday)"
							+ "VALUES(?,?,?,?,?,?)";
			
			// prepare
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, emp.getEmpId());
			pstm.setString(2, emp.getEmail());
			pstm.setString(3, emp.getPassword());
			pstm.setDouble(4, emp.getSalary());
			pstm.setString(5, emp.getCity());
			pstm.setDate(6, Date.valueOf(emp.getBirthday()));
			

			pstm.executeUpdate();
			System.out.println("success");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void save_with_statement(Employee emp) {
		try(Connection con = MyConnection.createConnection()) {
			
			// statement
			Statement stm = con.createStatement();
			
			String insert = "INSERT INTO employees(empNo,email,password,city,salary,birthday)"
					+ "VALUES(" + emp.getEmpId() + ",'" 
					+ emp.getEmail() + "','" 
					+ emp.getPassword() + "','"
					+ emp.getCity() + "',"
					+ emp.getSalary() + ",'"
					+ emp.getBirthday() + "')";
		
			System.out.println("query: " + insert);
			
			stm.executeUpdate(insert);
			System.out.println("success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void save_with_statement() {
		try (Connection con = MyConnection.createConnection()) {
			// create statement
			Statement stm = con.createStatement();

			// query
			String query = "INSERT INTO employees(empNo,email,password,salary,city,birthday)"
					+ "VALUES(1002,'may@gmail.com','may',500000,'Yangon','1999-12-12')";

			// execute query
			int result = stm.executeUpdate(query);

			System.out.println((result > 0) ? "success" : "fail");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void save_with_prepareStatement() {

		try(Connection con = MyConnection.createConnection()) {
			
			// query
			String query = "INSERT INTO employees(empNo,email,password,salary,city,birthday)"
					+ "VALUES(?,?,?,?,?,?)";
			
			// create statement
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, 1004);
			pstm.setString(2, "hla@gmail.com");
			pstm.setString(3, "hla");
			pstm.setDouble(4, 1000000);
			pstm.setString(5, "Mandalay");
			pstm.setDate(6, Date.valueOf("1995-09-31"));
			
			// execute query
			int result = pstm.executeUpdate();
			
			System.out.println((result > 0) ? "success" : "fail");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
