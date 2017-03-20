package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by Sajitha on 8/21/2016.
 */
public class AddStatePage {

    public static WebElement plusToaddPsc (WebDriver driver){
        WebElement ele=driver.findElement(By.id("show-detail-p-tag-0"));
        return ele;

    }
    public static WebElement addStateBtn (WebDriver driver){

                      WebElement ele=driver.findElement(By.id("add-state-button"));


        return ele;
    }
    public static WebElement addState (WebDriver driver){

        WebElement ele=driver.findElement(By.id("state-abbv-select"));


        return ele;
    }
    public static WebElement addStateCode (WebDriver driver){

        WebElement ele=driver.findElement(By.id("pcscode"));

        return ele;
    }
    public static WebElement addStateSbmt (WebDriver driver){

        WebElement ele=driver.findElement(By.id("add-state-button-final"));

        return ele;
    }


}