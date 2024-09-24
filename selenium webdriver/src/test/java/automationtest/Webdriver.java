package automationtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
automation Test case
 ---------
 
 1)launch browser(chrome)
 2)open url https://demo.opencart.com/
 3)validate title should be "your store"
 4)close browser
 */

public class Webdriver {

	public static void main(String[] args) {
		
		//automation test scripts
		
		//1)launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//2)open url https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3)validate title should be "your store"
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
			
		//4)close browser
		//driver.close();     //or //driver.quit();
		
	}

}
