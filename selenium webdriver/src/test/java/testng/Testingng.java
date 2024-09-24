package testng;
import org.testng.annotations.Test;
/*open the app
 * login
 * logout
 */

public class Testingng 
{
	@Test(priority=1)
	void openapp()        //testng methods won't return anything
	{
		System.out.println("opening the application...");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from application...");
	}
	
	@Test(priority=-1)
	void login()
	{
		System.out.println("login to application...");
	}
	
	
	

}
