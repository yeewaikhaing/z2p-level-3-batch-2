package day20;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseHandler {

	public static boolean promoteSalary(double salary) {
		boolean result = false;
		try(Connection conn = MyConnection.createConnection()) {
			String query = "UPDATE employees SET salary = salary + ?";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setDouble(1, salary);
			
			int i = pstm.executeUpdate();
			if(i > 0)
				result = true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

	public static void deleteByCity(String city) {
		
		try(Connection con = MyConnection.createConnection()) {
			String query = "DELETE FROM employees WHERE city = ?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, city);
			
			pstm.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
