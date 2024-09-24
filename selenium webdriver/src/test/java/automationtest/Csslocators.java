package automationtest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Csslocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com");
		driver.manage().window().maximize();  //better to use everytime
		
		
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");      //tag-input is optional but # is important
		
		
		//tag class  tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");           //. is important
		
		//tag  attribute                inside double quotes another double quotes is not allowed use single quote'' or slash \   
		//driver.findElement(By.cssSelector("input[placeholder='search store']")).sendKeys("T.shirts");
		//driver.findElement(By.cssSelector("[placeholder=\"search store"]")).sendKeys("T.shirts");
		
		//tag class attribute
		//driver.findElement(By.cssSelector("input.class[placeholder='search store']")).sendKeys("T.shirts");
		
		
		
		
		
		
	}

}
