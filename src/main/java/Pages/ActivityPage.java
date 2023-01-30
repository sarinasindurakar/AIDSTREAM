package Pages;

import Utils.ActionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    private WebDriver driver;
    private By addactivity=By.xpath("//span[text()='Add New Activity']");
    private By activitymanually=By.xpath("//a[.='Add a New Activity Manually']");
    private By activityidentifier=By.id("activity_identifier");
    private By createbutton=By.xpath("//button[@class=\"activity-save-btn \"]");
    private By result=By.xpath("//a[.='Result']");
    public ActionUtils actionutils;
    public ActivityPage(WebDriver driver){
        this.driver=driver;
        actionutils=new ActionUtils(driver);
    }
    public void clickactivity(){
        actionutils.movingtoelement(addactivity);
        actionutils.movingtoelement(activitymanually);

    }
    public void fillform(String identifier){
        driver.findElement(activityidentifier).sendKeys(identifier);
    }
    public void clickcreate(){
        driver.findElement(createbutton).click();

    }
    public ResultPage clickresult(){
        driver.findElement(result).click();
        return new ResultPage(driver);
    }

}
