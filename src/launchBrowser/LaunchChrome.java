package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	//variable/property/field
	//method- statements
	
	public static void main(String[] args) {
		//Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		//go to web browser
		driver.get("https://www.google.com/");
		//maximize
		driver.manage().window().maximize();
		
		//identify element and insert text
		
		 driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		 //identify element and click
		 driver.findElement(By.className("MV3Tnb")).click();
		 //Close
		 driver.close();
		 
	
	}
	
}
