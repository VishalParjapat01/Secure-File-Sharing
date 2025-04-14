package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoutTest {
	

    WebDriver driver;
    LogoutPage logoutPage;

    @BeforeTest
    public void setup() {
     
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     // Implicit wait
        driver.manage().window().maximize();
        driver.get("https://file-sharing-application.netlify.app/login");
        
        logoutPage = new LogoutPage(driver);   // Initialize Page Object
    }

    @Test
    public void LogoutTestdata() throws InterruptedException {
        

    	logoutPage = new LogoutPage(driver);
        logoutPage.clickProfile();     
        logoutPage.clickLogout();      

       
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
