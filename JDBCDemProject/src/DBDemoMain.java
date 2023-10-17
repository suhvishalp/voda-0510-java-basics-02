import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statement statement = null;
		
		
		try {
			//1. Load the DB Driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//2. Create the Connection
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root123123")) {
			
			
//			//3. create the Statement object 
//			statement = connection.createStatement();
//			
//			//4. submit the sql queries / execute the sql command 
//			String insertQuery = "INSERT INTO employee_tb values(102, 'Vaibhav', 'Pune', 5000)";
			
			
			
			String insertQuery = "INSERT INTO employee_tb values(?, ?, ?, ?)";
 			
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, 106);
			preparedStatement.setString(2, "Mohit");
			preparedStatement.setString(3, "Pune");
			preparedStatement.setInt(4, 3000);
			
			
			int rowsAffected = preparedStatement.executeUpdate();		
			
			if(rowsAffected > 0)
				System.out.println("Record is inserted");
			else 
				System.out.println("Record not inserted");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			//5.close the connection 
//			
//				try {
//					if(connection!=null)
//						connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
		
		
	}

}
