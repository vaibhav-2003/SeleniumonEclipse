package Seleniumpractice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.get("https://www.goibibo.com");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
	    // driver.findElement(By.xpath("//div[@id='fare_20190817']")).click();
	     /*Boolean flag=driver.findElement(By.xpath("//div[contains(text(),'August 2019')]")).getText().contains("August");
	     
	     while(!flag)
	     {
	    	 
	    	driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	     }*/
	     
	     
	     
	     
	     
	     
		

	}

}
