package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://file-sharing-application.netlify.app/login");
		
		loginpage = new LoginPage(driver, driver);
		
	}
	
	@Test (priority = 1)
	public void ValidLoginTest() {
	
		loginpage.enterEmail("Vishal@gmail.com");  //use  registered email
		loginpage.enterPassword("Vishal@123");     // use registered passsword
		loginpage.clickLogin();
	}
	@Test(priority = 2)
	public void InvalidLoginTest() {
		
		loginpage.enterEmail("Vi shal@gmail.com");
		loginpage.enterPassword("test123456");
		loginpage.clickLogin();
		
	}
	@AfterMethod
	public void tearDown() {
		
	driver.quit();
	}
	
	

}
