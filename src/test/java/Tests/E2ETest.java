package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.SignUpPage;

public class E2ETest {
	
	WebDriver driver;
	DashboardPage dashboardpage;
	LoginPage loginPage;
	SignUpPage signUpPage;
	LogoutPage logoutPage;

	@BeforeTest
	public void setup() {
		
		driver= new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://file-sharing-application.netlify.app/signup");
		
		// Initialize Page Object
		dashboardpage = new DashboardPage(driver);       
		loginPage = new LoginPage(driver, driver);
		signUpPage = new SignUpPage(driver);
		logoutPage = new LogoutPage(driver);
	}
	@Test(priority = 1)
	public void ValidSignUpTest() {
		
		signUpPage.enterName("Vishal QA");
		signUpPage.enterEmail("vishal@gmail.com");
		signUpPage.enterPassword("Vishal@123");
		signUpPage.clickSignUp();
	        
		signUpPage.clickLoginLink();
		
		
	}
	
	@Test (priority = 2)
	public void ValidLoginTest() {
	
		loginPage.enterEmail("vishal@gmail.com");  //use  registered email
		loginPage.enterPassword("Vishal@123");     // use registered passsword
		loginPage.clickLogin();
	}
	
	@Test(priority = 3)
	public void ValidDashboardTest() throws InterruptedException {
	        // Dashboard actions
        
			Thread.sleep(3000);

	        dashboardpage.uploadFile("C:\\Users\\parja\\Pictures\\Screenshots\\Screenshot 2025-04-12 185800.png");
	        dashboardpage.enablePassword("FilePass123");
	        dashboardpage.clickUploadButton();
   
	    }
	 @Test(priority = 4)
	    public void LogoutTestdata() throws InterruptedException {
	        

	        // Logout
	        logoutPage.clickProfile();     
	        logoutPage.clickLogout();      

	    }
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
