package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
    private WebDriver driver;

    public ElementUtils(WebDriver driver){
        this.driver=driver;

    }
    public WebElement getelement(By locator){
        WebElement elements=driver.findElement(locator);
        return elements;
    }

}
