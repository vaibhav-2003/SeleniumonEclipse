package Seleniumpractice.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Dropdowns {
	
	  @FindBy(xpath="//select[@id='selecttype']")
	//@FindBy(xpath="//div[@class='mainbody']/p[3]/select")
    public static WebElement d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\workspace\\Selenium\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     driver.get("http://book.theautomatedtester.co.uk/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[contains(text(),'Chapter1')]")).click();
	     WebElement w=driver.findElement(By.xpath("//select[@id='selecttype']"));
	     List<WebElement> l=w.findElements(By.tagName("option"));
	     System.out.println(l.size());
	     
	}

}
