package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinitionrework {
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;

	@Given("open broeser and navigate to login page")
	public void open_broeser_and_navigate_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("Enter username {string}")
	public void enter_username(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(string);
	}

	@And("Enter password {string}")
	public void enter_password(String string) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@And("Click on login")
	public void click_on_login() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("Redirect in homepage of orangehrm")
	public void redirect_in_homepage_of_orangehrm() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}

}
