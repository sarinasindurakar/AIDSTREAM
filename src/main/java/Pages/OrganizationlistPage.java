package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationlistPage {
    private WebDriver driver;
    private By searchbar= By.name("organization");
    private By searchbutton=By.xpath("//input[@value=\"Search\"]");
    private By masqueardebutton=By.xpath("(//a[@class=\"org-masquerade\"])[2]");
    public OrganizationlistPage(WebDriver driver){
        this.driver=driver;
    }
    public void setsearchkeys(String name){
        driver.findElement(searchbar).sendKeys(name);
    }
    public void clicksearchbutton(){
        driver.findElement(searchbutton).click();
    }
    public ActivityPage clickmasquerade(){
        driver.findElement(masqueardebutton).click();
        return new ActivityPage(driver);
    }
}
