package automationtest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//get (url)
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//thread.sleep(5000);   for the purpose of getwindowhandles
		//get title()-->returns the title of the page
		System.out.println(driver.getTitle());        //orangehrm
		
		//get current url()-->returns the current url
		System.out.println(driver.getCurrentUrl());       //https://opensource-demo.orangehrmlive.com/
		
		//getpagesource()-->returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getwindowhandle()-->returns the id of the single browser window
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);                  //2c1432eshs56gdbdh78dtwhsf7c
		
		//getwindowhandles()-->returns the id of the multiple browser window
		driver.findElement(By.linkText("OrangeHrm, Inc")).click();            //this will opens new browser window
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		
		
		
		
		

	}

}
