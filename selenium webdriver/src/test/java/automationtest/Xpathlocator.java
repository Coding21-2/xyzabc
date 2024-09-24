package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
		
		//xpath with multiple attribute
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='search']")).sendKeys("TShirts");
		
		//xpath with and , or operators              
		//and-->if both element should be true then only locate the element
		driver.findElement(By.xpath("//input[@name='search'and @placeholder='search']")).sendKeys("TShirts");
		
		//or-->in or opertaor atleast one element should be true then only it will locate the element
		driver.findElement(By.xpath("//input[@name='search'or @placeholder='search']")).sendKeys("TShirts");
		
		//xpath with text-innertext()-->without any attribute we can find element by using innertext
		driver.findElement(By.xpath("//*[text()='MacBook']"));
		
		boolean display=driver.findElement(By.xpath("//h3[text()='featured']")).isDisplayed();
		System.out.println(display);
		
		//getetxt()
		String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);                   //output:Featured
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'sea')]")).sendKeys("Tshirts");
		
		//starts-with -->another function
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'sea')]")).sendKeys("Tshirts");
		
		//chained xpath
		boolean chain=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(chain);
		
		
		
		
		
		
		
	}

}
