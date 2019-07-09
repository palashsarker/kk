package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	static WebDriver driver;

@Given("^user able to open browser$")
public void user_able_to_open_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\palsa\\eclipse-workspaceNew\\com.usa.libraryone\\AllDriver\\chromedriver.exe" );
	driver = new ChromeDriver();
}

@Given("^user enter url$")
public void user_enter_url() throws Throwable {
	driver.get("https://www.fedex.com/en-us/home.html");
}

@Given("^user able to click login button$")
public void user_able_to_click_login_button() throws Throwable {
  driver.findElement(By.className("fxg-user-options__sign-in-text")).click();
}

@When("^user able to enter username and password$")
public void user_able_to_enter_username_and_password() throws Throwable {
    driver.findElement(By.id("NavLoginUserId")).sendKeys("psarker77");
    driver.findElement(By.id("NavLoginPassword")).sendKeys("Jayeeta11");
}

@Then("^user able to successfully account page after click submit button$")
public void user_able_to_successfully_account_page_after_click_submit_button() throws Throwable {
	driver.findElement(By.cssSelector(".fxg-button.fxg-button--orange.fdx-login_error-label-change")).click();
}



}
