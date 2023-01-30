package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultDetailPage {
    private WebDriver driver;
    private By resulttitle= By.xpath("//div[@class=\"result-title\"]");
    private By resulttype=By.xpath("(//div[@class=\"text-xs leading-5 text-[#001E2D]\"]//p//span)[1]");
    private By resultaggregation=By.xpath("(//div[@class=\"text-xs leading-5 text-[#001E2D]\"]//p//span)[2]");
    public ResultDetailPage(WebDriver driver){
        this.driver=driver;
    }
    public void getresulttitle(){
       System.out.println(driver.findElement(resulttitle).getText());
    }
    public boolean resulttypedisplayed(){

        return driver.findElement(resulttype).isDisplayed();
    }
    public String getresultaggregation(){
       WebElement agg= driver.findElement(resultaggregation);
              String aggregation= agg.getText();
       return aggregation;
    }
}
