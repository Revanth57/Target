package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_obj {
	public static void main(String args[])
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\Browser & Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  String url="http://demowebshop.tricentis.com/";
		  driver.get(url);
		  driver.manage().window().maximize();
		  page Pobject=new page(driver);
		  Pobject.clicklink();
		  String username="";
		  Pobject.typename(username);
		  String password="";
		  Pobject.password(password);
		  Pobject.clicklogin();
		  System.out.println("title of the page is " +driver.getTitle());
	}  
	
	

}
