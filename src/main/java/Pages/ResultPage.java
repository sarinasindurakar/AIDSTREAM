package Pages;

import Utils.RadiobuttonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage {
    private WebDriver driver;
    private By addresult=By.xpath("//button[@class=\"button relative primary-btn w-[200px] py-4 rounded-lg space-x-2\"]");
    private By resulttitle=By.xpath("(//textarea[@class=\"form-control\"])[1]");
    private By res_description=By.xpath("(//textarea[@name=\"narrative[0][narrative]\"])[2]");
    private By type=By.xpath("/html/body/div[8]/div/div/div[2]/form/div[1]/div[2]/div[1]/div/div[2]/label[1]");
    private By savebutton=By.xpath("//button[@class=\"result_submit--btn primary-btn\"]");
    public RadiobuttonUtils radiobuttonUtils;
    public ResultPage(WebDriver driver){

        this.driver=driver;
        radiobuttonUtils=new RadiobuttonUtils(driver);

    }
    public void clickaddresult(){
        driver.findElement(addresult).click();
    }
    public void fillresultform(String title,String description){
        driver.findElement(resulttitle).sendKeys(title);
        driver.findElement(res_description).sendKeys(description);
        //driver.findElement(type).click();

    }
    public void selecttype() {
        radiobuttonUtils.clickradiobutton(2);
    }
    public void selectaggregation(){
        radiobuttonUtils.clickradiobutton(5);
        }
        public ResultDetailPage clicksave(){
            driver.findElement(savebutton).click();
            return new ResultDetailPage(driver);

        }

    }


