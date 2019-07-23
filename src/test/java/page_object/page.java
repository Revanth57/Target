package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page {
	WebDriver driver=null;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("//input[@value='Log in']");
	
	public page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void clicklink()
	{
		driver.findElement(lnc).click();
	}
	public void typename(String username)
	{
		driver.findElement(uname).sendKeys("reva77@gmail.com");;
	}
	public void password(String password)
	{
		driver.findElement(pwd).sendKeys("reva77");
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
}