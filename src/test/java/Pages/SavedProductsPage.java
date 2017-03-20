package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * Created by Sajitha on 8/17/2016.
 */
public class SavedProductsPage {
    static WebDriver driver;
    public static WebElement addSizeTab(WebDriver driver){
        WebElement ele=driver.findElement(By.id("sizes-prod-state-code"));
    return ele;
    }

public static void EditDetailsTabPresent(WebDriver driver){
String edit=driver.findElement(By.id("edit-product-details-button")).getText();
driver.findElement(By.id("edit-product-details-button")).getText().contains("EDIT DETAILS");

}
    public static WebElement addSize(WebDriver driver){
       WebElement ele= driver.findElement(By.id("add-size"));
    return ele;
    }
    public static void sizesAndPsc(WebDriver driver){
        driver.findElement(By.id("sizes-prod-state-code")).click();
    }

}
