package Seleniumpractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlAltDelSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Test");
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Dimension h=driver.findElement(By.xpath("//img[@id='hplogo']")).getSize();//.getHeight();
		String s1=driver.findElement(By.xpath("//img[@id='hplogo']")).getCssValue("font-size");
		String s2=driver.findElement(By.xpath("//img[@id='hplogo']")).getCssValue("font-colour");
		String s3=driver.findElement(By.xpath("//img[@id='hplogo']")).getCssValue("font-type");
		String s4=driver.findElement(By.xpath("//img[@id='hplogo']")).getCssValue("background-colour");
		System.out.println(h);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.chord(Keys.ENTER));
		//action.sendKeys(Keys.chord(Keys.LEFT_CONTROL));
		//action.sendKeys(Keys.chord(Keys.LEFT_ALT));
	//	action.sendKeys(Keys.chord(Keys.DELETE));
		//action.build().perform();
		
		//action.sendKeys(Keys.chord(Keys.LEFT_CONTROL));
		//action.sendKeys(Keys.chord(Keys.LEFT_ALT));
		//action.sendKeys(Keys.chord(Keys.DELETE)).build().perform();
		
		

	}

}
