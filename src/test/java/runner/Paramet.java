package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Paramet {
	WebDriver driver=null;
	@Given("User opens the application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.10\\Desktop\\Browser & Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		  driver.get(url);
		  driver.manage().window().maximize();
	 
	}

	@When("user click on the signin link")
	public void user_click_on_the_signin_link() {
		 driver.findElement(By.linkText("SignIn")).click();
		 System.out.println("title of the page is " +driver.getTitle());
	  
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	   
	}

	@Then("message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		 System.out.println("title of the page is " +driver.getTitle());
	    throw new cucumber.api.PendingException();
	}



}
