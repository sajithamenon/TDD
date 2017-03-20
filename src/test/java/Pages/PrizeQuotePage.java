package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sajitha on 8/23/2016.
 */
public class PrizeQuotePage {
    public static WebElement pdtNameToClick (WebDriver driver){

        WebElement ele=driver.findElement(By.id("show-detail-p-tag-0"));


        return ele;}
    public static  WebElement priceQt(WebDriver driver){
        WebElement ele=driver.findElement(By.id("create-price-quote-button"));
        return ele;

    }



}
