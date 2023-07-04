package ticketBooking;
import Login.login;

public class MainClass {

	public static void main(String[] args) {
		
		while(true)
		{
		if(new login().Authenticate())
		{
			System.out.println("go for booking");
			break;
		}
		else
		{
			System.out.println("Please enter correct credentials");
			
		}
		}
			
		

	}

}
