package automationtest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();  //for maximization
		
		//name
		//driver.findElement(By.name("Search")).sendKeys("Mac");
		
		//id
		//boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logodisplaystatus);
		
		//link text 
		//driver.findElement(By.linkText("Tablets")).click();     preferrable
		
		// partial link text
		//driver.findElement(By.partialLinkText("Tab")).click();        mostly not preferrable
		
		//findElements
		//List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerlinks.size());	
		
		//tag name
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total number of size: "+links.size());
		
		//images
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
		

	}

}
