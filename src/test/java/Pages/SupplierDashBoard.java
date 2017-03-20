package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Sajitha on 8/16/2016.
 */
public class SupplierDashBoard {

    //static String Url="http://52.24.76.254/#!/login";
    static WebDriver driver;
    public static WebElement newPrdts(WebDriver driver){
        WebElement ele=driver.findElement(By.id("new-prod"));
        return  ele;
    }
public static WebElement loggedUser(WebDriver driver){
    WebElement ele=driver.findElement(By.id("logged_user"));
    return ele;

}
public static WebElement selectAll(WebDriver driver){
    WebElement ele= driver.findElement(By.className(""));
    return ele;
}


}
