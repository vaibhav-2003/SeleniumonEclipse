package Seleniumpractice.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Verifydropdownvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		 String[] exp = {"Pizza","Donut","Burger","Bonda"};
		   
		 Select select = new Select(driver.findElement(By.xpath("//select[@id='second']")));  

		 List<WebElement> options = select.getOptions();  
		 for(WebElement we:options)  
		 {  
		  boolean match = false;
		  for (int i=0; i<exp.length; i++){
		      if (we.getText().equals(exp[i])){
		        match = true;
		      }
		    }
		 // Assert.assertTrue(match);
		  System.out.print(match);
		 }  

	}

}
