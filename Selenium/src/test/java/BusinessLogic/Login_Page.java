package BusinessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.Common;

public class Login_Page {
	
	public WebDriver driver;
	public Common cm;
	
	public Login_Page(WebDriver Driver)
	{
		this.driver=driver;
		cm=new Common(driver);
	}
	
	@FindBy(xpath="//div[@class='makeFlex column flexOne whiteText latoBold']")
	WebElement Mylogin;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='capText font16']")
	WebElement login_button;
	
	@FindBy(xpath="//li[@class='makeFlex hrtlCenter lhMyTrips']")
	WebElement homepage; // to check assert after login
	
	public void url(String url)
	{
		try
		{
			driver.get(url);
			System.out.println(this.getClass().getSimpleName() +":url :- Passed");
		}
		
		catch(Exception e)
		{
			System.out.println(this.getClass().getSimpleName() +":url :- Failed");
			e.printStackTrace();
		}
	}
	
	public void login(String uname,String pwd) throws Exception
	{
		try {
			
			Mylogin.click();
			Thread.sleep(3000);
			username.sendKeys(uname);
			System.out.println(this.getClass().getSimpleName() +":Enter Username :- Passed");
			Thread.sleep(1000);
			password.sendKeys(pwd);
			System.out.println(this.getClass().getSimpleName() +":Enter Password :- Passed");
			//new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("")));
			
			login_button.click();
			System.out.println(this.getClass().getSimpleName() +":Click Login :- Passed");
			//cm.explicit_wait("");
			//cm.screenshot("Login_Passed", this.getClass().getSimpleName());
		}
		
		catch(Exception e)
		{
			System.out.println(this.getClass().getSimpleName() +": Login :- Login Failed");
			e.printStackTrace();
			//cm.screenshot("Login_Failed", this.getClass().getSimpleName());
		}
	}
	
	public String assert_afterlogin()
	{
		String x= homepage.getText();
		return x;
	}

}
