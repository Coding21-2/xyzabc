package automationtest;import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathaxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//self-->selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'zomato')/self::a")).getText();
		System.out.println("self: "+text);            //zomato
		
		//parent-->selects the parent of the current node(always one)
	    text=driver.findElement(By.xpath("//a[contains(text(),'zomato')/parent::td")).getText();
		System.out.println("parent: "+text);           //zomato
		
		//child-->selects all children of the current node(one or many)
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'zomato')/ancestor::tr/child::td"));
		System.out.println("no of child elements: "+childs.size());            //5
		
		//ancestor-->selects all ancestors(parent,grandparent,etc..)
	    text=driver.findElement(By.xpath("//a[contains(text(),'zomato')/ancestor::tr")).getText();
		System.out.println("ancestor: "+text); 
		
		//descendent-->selects all descendents(parent, grandparent, etc..)of the current node
		List<WebElement> descendents=driver.findElements(By.xpath("//a[contains(text(),'zomato')/ancestor::tr/descendent::*"));
		System.out.println("no of descendent nodes: "+descendents.size());    //7
		
		//following-->selects everything in the document after the closing tag of the current node
		List<WebElement> following=driver.findElements(By.xpath("//a[contains(text(),'zomato')/ancestor::tr/following::tr"));
		System.out.println("no of following nodes: "+following.size());        //267
		
		//preceding-->selects all nodes that appear before the current node in the document
		List<WebElement> preceding=driver.findElements(By.xpath("//a[contains(text(),'zomato')/ancestor::tr/preceding::tr"));
		System.out.println("no of preceding nodes: "+preceding.size());
		
		//following-sibling-->selects all siblings after the current node
		List<WebElement> fsibling=driver.findElements(By.xpath("//a[contains(text(),'zomato')/ancestor::tr/following-sibling::td"));
		System.out.println("no of following sibling: "+fsibling.size());
		
		//preceding-sibling-->selects all siblings after the current node
		List<WebElement> psibling=driver.findElements(By.xpath("//a[contains(text(),'zomato')/ancestor::tr/preceding-sibling::td"));
		System.out.println("no of preceding sibling: "+psibling.size());
		
		driver.quit();
		
		

	}

}
