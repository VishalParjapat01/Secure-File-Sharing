package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardTest {
	WebDriver driver;
	DashboardPage dashboardpage;
	
	@BeforeTest
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://file-sharing-application.netlify.app/signup");
		
		dashboardpage = new DashboardPage(driver);       // Initialize Page Object
		
	}
	
	
	@Test
	public void ValidDashboardTest() throws InterruptedException {
	        // Dashboard actions
        
			Thread.sleep(3000);

	        dashboardpage.uploadFile("C:\\Users\\parja\\Pictures\\Screenshots\\Screenshot 2025-04-12 185800.png");
	        dashboardpage.enablePassword("FilePass123");
	        dashboardpage.clickUploadButton();

	        
	        
	    }
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
}
