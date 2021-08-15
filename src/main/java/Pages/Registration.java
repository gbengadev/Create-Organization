package Pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
    private WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }
    private By businessName= By.id("name");
    private By nextButton1=By.cssSelector(".dfxLti");
    private By firstName=By.id("first");
    private By lastName=By.id("last");
    private By emailAddress=By.id("email");
    private By nextButton2=By.cssSelector(".sc-AxirZ");
    private By passwordField=By.id("password");
    private By passwordConfirmation=By.id("confirm");
    private By nextButton3=By.cssSelector(".sc-AxirZ");
    private By welcomeDialog= By.xpath("//div[@class='OnboardingChoice-title']");

    public String registerBusiness(String businessname,String firstname,String lastname,String emailaddress,String password){
        driver.findElement(businessName).sendKeys(businessname);
        driver.findElement(nextButton1).click();
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(emailAddress).sendKeys(emailaddress);
        driver.findElement(nextButton2).click();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(passwordConfirmation).sendKeys(password);
        driver.findElement(nextButton3).click();

        //Return welcome text
        return driver.findElement(welcomeDialog).getText();
    }


}
