package Seleniumpractice.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.get("https://www.makemytrip.com");
     //driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser ']")).click();
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc");
     //driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vaibhav.kr1707");
    // driver.findElement(By.xpath("//span[contains( text(),'Next')]")).click();
    // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
     //driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
     
	}

}
