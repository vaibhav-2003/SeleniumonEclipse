package Seleniumpractice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello");
		driver.get("http://www.siddhivinayak.org/virtual_darshan.asp");
		
	}

}
