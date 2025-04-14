package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	
    WebDriver driver;
    WebDriverWait wait;

    
    @FindBy(xpath = "(//button[@type=\"button\"])[1]")
    WebElement profileIcon;

    
    @FindBy(xpath = "//button[.=' LOGOUT ']")
    WebElement logoutBtn;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickProfile() {
        wait.until(ExpectedConditions.elementToBeClickable(profileIcon)).click();
    }

    public void clickLogout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
    }

    
}
