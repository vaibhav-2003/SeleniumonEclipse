package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown {

	WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		
		@Test(priority =1)
		
		public void olivegreen() throws InterruptedException
		{
			driver.manage().window().maximize();
			driver.get("https://www.olivegarden.com/home");
			driver.findElement(By.xpath("//*[@id='header']/div[2]/section/nav/ul[1]/li[2]/a")).click();
			Thread.sleep(10000);
			//driver.findElement(By.xpath("//div/h4[starts-with(text(),'CARSIDE PICKUP')]")).click();
			//driver.findElement(By.xpath("//div/img[@alt='Order food to go with pickup from your local Olive Garden Restaurant']")).click();
			//driver.findElement(By.xpath("//div/button[starts-with(text(),'Order Now')]")).click();
		}
	}


