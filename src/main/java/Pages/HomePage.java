package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By signin=By.xpath("//a[@title=\"Sign In\"]");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public SigninPage clicksignin(){
        driver.findElement(signin).click();
        return new SigninPage(driver);

    }

}
