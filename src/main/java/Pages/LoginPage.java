package Pages;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver2, WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy (xpath = "//input[@placeholder='example@gmail.com']")
	WebElement emailfield;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Password']")
	WebElement passwordfield;
	
	@FindBy(xpath = "//button[text() = 'Login']")
	WebElement Loginbutton;
	
	public void enterEmail(String email) {
		
		wait.until(ExpectedConditions.visibilityOf(emailfield)).sendKeys(email);
	}
	
	public void enterPassword(CharSequence password) {
		
		wait.until(ExpectedConditions.visibilityOf(passwordfield)).sendKeys(password);
	}
	
	public void clickLogin() {
		
		wait.until(ExpectedConditions.visibilityOf(Loginbutton)).click();
		
	}
		
	
}
