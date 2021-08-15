package Base;

import Data.RegistrationData;
import Pages.HomePage;
import Pages.SignIn;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import static org.testng.Assert.assertEquals;

public class BaseTests {
    private WebDriver driver;
    protected SignIn signIn;
    private final String baseUrl ="https://tauria.com/signin";


    //This sets up an optional configuration to run the test(s) within the class
    @BeforeTest
    @Parameters({"browser", "url"})
    public void setup(@Optional("chrome")String browser, @Optional(baseUrl)String url) throws MalformedURLException {
        TestDriverSetUp testDriverSetUp = new TestDriverSetUp(browser, url);
        driver = testDriverSetUp.getDriver();
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        signIn = new SignIn(driver);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
