package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import TestMeApp.TestMeApp.DriverUtility;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;

public class TestMeLogin {
	WebDriver driver;
	@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, LoginPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("the URL of TestMeApp")
	public void the_URL_of_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters the data for login")
	public void user_enters_the_data_for_login() {
	   LoginPage.username.sendKeys("Lalitha");
	   LoginPage.password.sendKeys("Password123");
	   LoginPage.loginbutton.click();
	}

	@Then("user login successfully")
	public void user_login_successfully() {
	    
	}


}
