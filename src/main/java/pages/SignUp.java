package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp extends BaseClass{
    public  SignUp(WebDriver driver){
        super(driver);
    }
    WebElement gender =  driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
    WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    WebElement days = driver.findElement(By.xpath("//*[@id=\"days\"]/option[13]"));
    WebElement months = driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]"));
    WebElement years = driver.findElement(By.xpath("//*[@id=\"years\"]/option[24]"));
    WebElement first_name = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
    WebElement last_name = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
    WebElement Company  = driver.findElement(By.xpath("//*[@id=\"company\"]"));
    WebElement adress1 = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
    WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]"));
    WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]"));
    WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
    WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
    WebElement mobile_number = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
    WebElement submit = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));

    public void SetAll(){
        gender.click();
        password.sendKeys("123");
        days.click();
        months.click();
        years.click();
        first_name.sendKeys("saif");
        last_name.sendKeys("khaled");
        Company.sendKeys("BDF");
        adress1.sendKeys("emtdad ramsis");
        country.click();
        state.sendKeys("cairo");
        city.sendKeys("cairo");
        Zipcode.sendKeys("45678");
        mobile_number.sendKeys("01095557940");
        submit.click();
    }

}
