package Testcases;

import CommonActions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sajitha on 8/21/2016.
 */
public class PqSubmn {

    public CommonPages c = new CommonPages();


    public WebDriver driver;

    @BeforeClass
    public void loginAsSupplier() {
   System.setProperty("webdriver.ie.driver","C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\IEDriverServer.exe");
driver=new InternetExplorerDriver();
      // System.setProperty("webdriver.chrome.driver","C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\chromedriver.exe");
      //driver=new ChromeDriver();
     // driver = new FirefoxDriver();
        c.openBrowser(driver);
        c.supplierLogin(driver);




    }
    @Test
    public void priceQuotesubmisn() throws InterruptedException {
        CreatingnNewProduct.create(driver);
        AddSize.addingSize(driver);

       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);

        AddState.addingState(driver);
        PrizeQuote.createPq(driver);

        PqSubit.submittingPq(driver);

    }

}
