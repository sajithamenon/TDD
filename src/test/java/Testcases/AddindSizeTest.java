package Testcases;

import CommonActions.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

/**
 * Created by Sajitha on 1/26/2017.
 */
public class AddindSizeTest {
    public CommonPages c = new CommonPages();
    GenerateData gendata = new GenerateData();

    public WebDriver driver;

    @BeforeClass
    public void loginAsSupplier() {
        // System.setProperty("webdriver.ie.driver","C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\IEDriverServer.exe");
        //driver=new InternetExplorerDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\chromedriver.exe");
         driver=new ChromeDriver();
       // driver = new FirefoxDriver();
        c.openBrowser(driver);
        c.supplierLogin(driver);
    }


  @org.testng.annotations.Test
    public void adingSize() throws InterruptedException {
        CreatingnNewProduct.create(driver);
      AddSize.addingSize(driver);
      AddState.addingState(driver);


    }
}