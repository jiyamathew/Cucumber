package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class step {

	WebDriver driver;


@Given("user must be on homepage clicking on url {string}")
public void user_must_be_on_homepage_clicking_on_url(String url) {
	System.setProperty("webdriver.geckodriver", "geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
}

@When("user clicks on signup button")
public void user_clicks_on_signup_button() {
	 driver.findElement(By.id("signin2")).click();
}

@Then("Signup dialogbox should be displayed")
public void signup_dialogbox_should_be_displayed() {
	driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
//	boolean actual=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	/*
	 * String actual=driver.findElement(By.id("signInModalLabel")).getText();
	 * 
	 * Assert.assertEquals(true, actual);
	 */
    
}




	
}
