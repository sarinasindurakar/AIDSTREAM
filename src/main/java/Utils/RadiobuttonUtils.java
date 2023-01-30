package Utils;

import io.netty.util.internal.ThreadLocalRandom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadiobuttonUtils {
    private WebDriver driver;
    public RadiobuttonUtils(WebDriver driver){
        this.driver=driver;
    }


    public void clickradiobutton(int number){
        List<WebElement> itemsinType = driver
                .findElements(By.xpath("//div[@class=\"multi-checkbox__group\"]//label//span"));
        int size = itemsinType.size();
        //int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
        // Selecting random value
        itemsinType.get(number).click();
    }

}
