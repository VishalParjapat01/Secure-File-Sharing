package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//input[@type='file']")
    WebElement fileUpload;

    @FindBy(xpath = "//span[@class='chakra-checkbox__control css-1yld03o']")
    WebElement setPasswordCheckbox;

    @FindBy(xpath = "//input[@placeholder='Set Password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Upload File']")
    WebElement uploadBtn;

    public void uploadFile(String path) {
        wait.until(ExpectedConditions.visibilityOf(fileUpload)).sendKeys(path);
    }

    public void enablePassword(String password) {
        setPasswordCheckbox.click();
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password);
    }

    public void clickUploadButton() {
        wait.until(ExpectedConditions.elementToBeClickable(uploadBtn)).click();
    }

    public boolean isUploadButtonVisible() {
        return uploadBtn.isDisplayed();
    }

}
