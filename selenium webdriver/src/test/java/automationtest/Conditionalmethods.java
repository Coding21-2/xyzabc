package automationtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//isDisplayed()
		//eg-1
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopcommerce demo stroe']"));
		System.out.println(logo.isDisplayed());           //true
		//eg-2
		boolean status=driver.findElement(By.xpath("//img[@alt='nopcommerce demo stroe']")).isDisplayed();
		System.out.println(status);           //true
		
		//isenabled()
		boolean enable=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(enable);            //true
		
		//isselected
	    WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		System.out.println("before selection");
		System.out.println(male.isSelected());   //false
		System.out.println(female.isSelected());   //false
		
		System.out.println("after slecting male...");
		male.click();
		System.out.println(male.isSelected());   //true
		System.out.println(female.isSelected());  //false
		
		
		System.out.println("after slecting female...");
		female.click();
	    System.out.println(male.isSelected());   //false
		System.out.println(female.isSelected());  //true
		
		boolean selected=driver.findElement(By.xpath("//input[@id='FirstName']")).isSelected();
		System.out.println("checkbox status:"+selected);
		
		//browser methods
		//close();
		//Thread.sleep(5000);    //when we use thread we have to insert throws exception in public static
		driver.close();
		
		//quit();
		 driver.quit();
		 
		
		
		
		
		
	}

}
