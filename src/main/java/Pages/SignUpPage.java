package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	
	WebDriver driver;
    WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//input[@placeholder='Enter Your Full Name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@placeholder='example@gmail.com']")
    WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Enter Your Password']")
    WebElement passwordField;

  
    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement togglePasswordIcon;

    @FindBy(xpath = "//button[.='Signup']")
    WebElement signUpButton;

    @FindBy(xpath = "//span[.='Login']")
    WebElement loginLink;

    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOf(nameField)).sendKeys(name);
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }


    public void togglePasswordVisibility() {
        wait.until(ExpectedConditions.elementToBeClickable(togglePasswordIcon)).click();
    }

    public void clickSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void clickLoginLink() {
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
