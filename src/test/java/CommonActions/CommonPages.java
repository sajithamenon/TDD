package CommonActions;

import Pages.SupplierDashBoard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sajitha on 8/16/2016.
 */
public class CommonPages {
    static String Url="http://52.24.76.254/#!/login";
    static WebDriver driver;


    public static void openBrowser(WebDriver driver)
    {
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public static void closingThePage(WebDriver driver){
        driver.close();
        driver.quit();
    }
        public static void supplierLogin(WebDriver driver)  {
        driver.findElement(By.id("username")).sendKeys("sajitha.r+s@303software.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.className("btn")).click();

    }
    public static WebElement supEmail(WebDriver driver){
        WebElement ele=driver.findElement(By.id("username"));
        return ele;
    }
    public static WebElement supPass(WebDriver driver){
        WebElement ele=driver.findElement(By.id("password"));
        return ele;
    }
    public static WebElement login(WebDriver driver){

        WebElement ele=driver.findElement(By.className("btn"));
        return ele;}
    public static void requestAccess(WebDriver driver) {

        driver.findElement(By.linkText("Request an account")).click();

    }


}
