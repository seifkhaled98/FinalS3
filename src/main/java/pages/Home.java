package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home extends BaseClass{
    public Home(WebDriver driver){
        super(driver);
    }
    WebElement signUpButton = driver.findElement(By.partialLinkText("Login"));
    public void clickSignup(){
        signUpButton.click();
    }
}
