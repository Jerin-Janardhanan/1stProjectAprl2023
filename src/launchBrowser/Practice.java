package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.yahoo.com/");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("ybar-sbq")).sendKeys("Selenium");
	driver.findElement(By.className("_yb_fdfpr")).click();
//	driver.findElement(By.className("td-n d-ib pt-9 pb-10 plr-12")).click();
			
	driver.close();
	}
}


//question- clicking on image is not working. (line 18)
//with driver.close, it is not going to search page.