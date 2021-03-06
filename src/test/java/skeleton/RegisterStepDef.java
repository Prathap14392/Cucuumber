package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import TestMeApp.TestMeApp.DriverUtility;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

public class RegisterStepDef {
	
	WebDriver driver;
	@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("url of DemoWebShop")
	public void url_of_DemoWebShop() {
		driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() {
		RegisterPage.gender.click();
		   RegisterPage.firstname.sendKeys("Prathap");
		   RegisterPage.lastname.sendKeys("Kothakota");
		   RegisterPage.email.sendKeys("prathapk@test.com");
		   RegisterPage.password.sendKeys("abc123");
		   RegisterPage.confirmpassword.sendKeys("abc123");
		   RegisterPage.registerbutton.click();
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
	    
	}

}
