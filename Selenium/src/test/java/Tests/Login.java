package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BusinessLogic.Login_Page;
import Common.Common;
import Common.Excel;

public class Login {
	
	public static WebDriver driver;
	
	@Test
	
	public void application_login() throws Exception
	{
		
		driver=new ChromeDriver();
		Excel e=new Excel();
		Login_Page lp=PageFactory.initElements(driver,Login_Page.class);
		Common cm=new Common(driver);
		
		cm.logger("Login");
		System.out.println("Max");
		
		String url=e.getData(0,1,1);
		String username=e.getData(0,1,2);
		String password=e.getData(0,1,3);
	
		System.out.println("URL:" +url);
		cm.maximize_browser();
		//lp.url(url);
		
		driver.get("https://www.makemytrip.com");
		lp.login(username, password);
		
		//cm.explicit_wait("//div[@class='today']");
	}
	
	@AfterMethod
	public void close()
	{
		//driver.close();
	}

}
