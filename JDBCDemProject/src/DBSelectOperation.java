import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelectOperation {

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
			
			
			//3. create the Statement object 
			statement = connection.createStatement();
			
			
			//4. submit the sql queries / execute the sql command 
			String selectQuery = "SELECT empId, empName, city, salary FROM employee_tb WHERE city='Pune'";
			
			ResultSet resultSet =  statement.executeQuery(selectQuery);

			while(resultSet.next()) {
				
				int id = resultSet.getInt("empId");
				String eName = resultSet.getString("empName");
				String city = resultSet.getString("city");
				int salary = resultSet.getInt("salary");
								
				System.out.println(id + "\t" + eName + "\t" + city + "\t" + salary);
			}
			
			resultSet.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
