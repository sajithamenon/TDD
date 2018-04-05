package CommonActions;

import Pages.AddStatePage;
import Pages.PrizeQuotePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sajitha on 8/23/2016.
 */
public class PrizeQuote {

    public static void createPq(WebDriver driver) throws InterruptedException {
       // WebDriverWait wait=new WebDriverWait(driver,30);
      // wait.until(ExpectedConditions.elementToBeClickable(By.id("show-detail-p-tag-0"))).click();
       // driver.findElement(By.id("show-detail-p-tag-0")).click();
       //PrizeQuotePage.pdtNameToClick(driver).click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PrizeQuotePage.priceQt(driver).click();

    }}

