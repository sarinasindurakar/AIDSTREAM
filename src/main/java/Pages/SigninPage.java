package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
    private WebDriver driver;
    private By usernamefield=By.name("login");
    private By Passwordfield=By.name("password");
    private By login=By.xpath("//button[contains(@class,'w-[180px] mx-auto block ') ]");
    public SigninPage(WebDriver driver){
        this.driver=driver;
    }
    public void setusernamepassword(String username,String password){
        driver.findElement(usernamefield).sendKeys(username);
        driver.findElement(Passwordfield).sendKeys(password);

    }
    public OrganizationlistPage clicklogin(){
        driver.findElement(login).click();
        return new OrganizationlistPage(driver);
    }

}
