package BaseTest;

import DriverFactory.DriverFactory;
import Pages.HomePage;
import Pages.SigninPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Properties;

public class BaseTest {
    public DriverFactory driverFactory;
    public Properties properties;
    public WebDriver driver;
    public HomePage homePage;
    public SigninPage signinPage;
    public Faker faker;

    @BeforeSuite
    public void setUp() {

        driverFactory = new DriverFactory();
        properties = driverFactory.initProperties();
        driver = driverFactory.initDriver(properties);
        driver.manage().window().maximize();
         faker=new Faker();
        homePage=new HomePage(driver);
        signinPage=new SigninPage(driver);

    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }



}