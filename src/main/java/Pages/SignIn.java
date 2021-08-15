package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    private WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }
    private By getRegistartionPage= By.cssSelector(".bCrcRb");

    public Registration getRegistrationPage(){
         driver.findElement(getRegistartionPage).click();
         return new Registration(driver);
    }
}
