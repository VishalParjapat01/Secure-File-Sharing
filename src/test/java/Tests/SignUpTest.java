package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	
	WebDriver driver;
    SignUpPage signuppage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
        driver.manage().window().maximize();
        driver.get("https://file-sharing-application.netlify.app/signup");
        
        signuppage = new SignUpPage(driver); // Initialize Page Object
    }

    @Test(priority = 1)
    public void validSignUpTest() throws InterruptedException {
    	signuppage.enterName("Vishal QA");
    	signuppage.enterEmail("vishal" + System.currentTimeMillis() + "@test.com");
    	signuppage.enterPassword("Test@123");
    	signuppage.clickSignUp();
        
    	signuppage.clickLoginLink();
        Assert.assertTrue(signuppage.getCurrentUrl().contains("login"));  // Expected to redirect
        
    }

    @Test (priority = 2)
    public void InvalidSignUpTest() {
    	signuppage.enterName("Admin User");
    	signuppage.enterEmail("Admin@test.com");
    	signuppage.enterPassword("admin@123");
    	signuppage.clickSignUp();
        // Add asserts based on error message if needed
    }

    @Test
    public void navigateToLoginTest() {
    	signuppage.clickLoginLink();
        Assert.assertTrue(signuppage.getCurrentUrl().contains("login"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
	


}
