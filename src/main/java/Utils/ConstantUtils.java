package Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class ConstantUtils {
    private WebDriver driver;

    //private static Faker fakerdata;


    public ConstantUtils(WebDriver driver) {

        this.driver = driver;
        //fakerdata=new Faker();
    }
    public static final String resulttype="Impact";
}
