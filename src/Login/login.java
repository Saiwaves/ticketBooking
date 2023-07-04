package Login;
import java.sql.*;
import JdbcConnection.DatabaseConnection;
import java.util.Scanner;

public class login {
	private String userId;
	private String Password;
	 
	
	public Boolean Authenticate()
	{
		System.out.println("in the authenticator");
		Scanner inp=new Scanner(System.in);
		System.out.println("UserName : ");
		int a=0;
		while(inp.hasNextLine()){
			if(a==0)
			{
				userId=inp.nextLine();
				System.out.println("Password : ");
				a++;				
			}
			else
			{
				Password=inp.nextLine();
				break;
			}		
		}	
		
		inp.close();
		System.out.println(userId+Password);
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection c= DriverManager.getConnection("Jdbc:mysql://localhost:3306/mydb","root","nikhil2001");
		Connection con=new DatabaseConnection().connect();
		Statement s= con.createStatement();
		String Query="select password from passenger where gmail like '"+userId+"';";
		//System.out.println("select password from passenger where gmail like '"+userId+"';");
		ResultSet r=s.executeQuery(Query);
		
		r.next();
		if(r.getString(1).equals(Password))
			{
				System.out.println("Authentication successs");
				return true;
			}
			else
			{
				System.out.println("authentication failed");
				return false;
			}
		//return true;
		
		}
		catch(Exception e)
		{
			System.out.println("connection fail");
			return false;
		}	
	
		
		
		
	}
	

}
