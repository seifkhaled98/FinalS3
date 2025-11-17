import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class register {
    WebDriver driver;
    Home home;
    Login login;
    SignUp signup;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        home = new Home(driver);

    }
    @Test(description = "Verify that home page is visible successfully" , priority = 0)
    public void homepage() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Automation Exercise");
    }
    @Test(description = "Verify 'New User Signup!' is visible" , priority = 1)
    public void textvisible(){
        home.clickSignup();
        login = new Login(driver);
        Assert.assertEquals(login.getNewUser(),"New User Signup!");
        login.submitRegister("saif","Saif@gmail.com");

    }
    @Test(description = "success register" , priority = 2)
    public void registeration(){
        signup = new SignUp(driver);
        signup.SetAll();
    }


}
