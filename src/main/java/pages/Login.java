package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends BaseClass{
    public Login (WebDriver driver){
        super(driver);
    }

    WebElement name = driver.findElement(By.name("name"));
    WebElement signUpEmail = driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]"));
    WebElement signUpButton = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
    WebElement newUser = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"));
    public void submitRegister(String username , String email){
        name.sendKeys(username);
        signUpEmail.sendKeys(email);
        signUpButton.click();
    }
    public String getNewUser(){
        return newUser.getText();
    }


}
