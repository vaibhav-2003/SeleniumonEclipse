package Seleniumpractice.Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='second']")));
		s1.deselectAll();
		List<WebElement> l=s1.getOptions();
		
		for(WebElement options:l )
		{
			//s1.equals(options.getText());
			options.click();
		
		}
		
		driver.navigate().refresh();
		
		Select s2=new Select(driver.findElement(By.xpath("//select[@id='second']")));
		s2.selectByVisibleText("Donut");
		s2.selectByVisibleText("Bonda");
		
		
		

	}

}
