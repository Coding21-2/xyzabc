package automationtest;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Project {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login the web page
		WebElement txt=driver.findElement(By.name("username"));
		txt.clear();
		txt.sendKeys("Admin");
		WebElement txtid=driver.findElement(By.name("password"));
		txt.clear();
		txtid.sendKeys("admin123");
		WebElement tx=driver.findElement(By.tagName("button"));
		tx.click();	
		
		//title
		String act_title=driver.getTitle();
		if(act_title.equals("OrangeHRM"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		//finding the size of the menu
		List<WebElement> headerlinks=driver.findElements(By.className("oxd-main-menu-item-wrapper"));
		System.out.println(headerlinks.size());	
		
		//clicking the my info button
		driver.findElement(By.linkText("My Info")).click();
		
		//clicking the personal details option
		driver.findElement(By.linkText("Personal Details")).click();
		
		//clicking the firstname option
		/*driver.findElement(By.name("firstName")).click();
		driver.findElement(By.name("firstName")).clear();
		WebElement er=driver.findElement(By.name("firstName"));
		er.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
		er.sendKeys("mikey");*/
		
		//clicking and entering the firstname
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
		firstname.sendKeys("mikey");
		
		//clicking and entering the middlename
		WebElement middlename=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));
		middlename.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
		middlename.sendKeys("takemichi");
		
		//clicking and entering the lastname
	    WebElement lastname=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));
	    lastname.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	    lastname.sendKeys("hinna");
	    
	    //clicking and entering the employee ID
	    WebElement emp=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
	    emp.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	    emp.sendKeys("software");
	    
	    //clicking and entering other ID
	    WebElement id=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
	    id.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	    id.sendKeys("02032004");
	    
	   //clicking and entering the driver's license number
	    WebElement license=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
	    license.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	    license.sendKeys("13456728");
	    
	   //saving the personal details using cssselector-->button1
	   WebElement btn= driver.findElement(By.cssSelector("button[type ='submit']"));
	   btn.click();		
	   
	   //clicking and entering the test_field
	  WebElement test=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input"));
	   test.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	   test.sendKeys("134");
	  
	   //button2-->save
	  //WebElement btn2= driver.findElement(By.cssSelector("button[type='submit']"));
	  // btn2.click();	
	   
	   //clicking the contact details
	   //driver.findElement(By.linkText("Contact Details")).click();
	        
	    
	    //https://automationexercise.com/
	   
	}
	
	

}
