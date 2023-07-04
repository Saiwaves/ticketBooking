package JdbcConnection;
import java.sql.*;

public class DatabaseConnection {
	
	public Connection connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("Jdbc:mysql://localhost:3306/mydb","root","nikhil2001");
			return c;
		}
		catch(Exception e)
		{
			System.out.println("failed in connection");
			return null;
		}
	
	}

}
