package Testcases;

import CommonActions.CommonPages;
import TestDatas.SupplierLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Sajitha on 8/26/2016.
 */
public class SupplierLoginTest extends SupplierLogin {

public WebDriver driver;
    public CommonPages b=new CommonPages();
    @BeforeMethod
        public void browseropen() {
       // System.setProperty("webdriver.ie.driver","C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\IEDriverServer.exe");
        //driver=new InternetExplorerDriver();
        // driver=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\chromedriver.exe");
       driver = new ChromeDriver();
        b.openBrowser(driver);
        System.out.println("website launched");

    }
    @Test(dataProvider = "SupplierLogin")
    public void adminLoginTest(String Userid, String Password) throws InterruptedException {
        b.supEmail(driver).sendKeys(Userid);
        b.supPass(driver).sendKeys(Password);
        b.login(driver).click();
        //********1.correct credentials*******
        Thread.sleep(1000);
        String actalTitle = driver.getTitle();
        System.out.println(actalTitle);
        String expectedTitle ="Dashboard";
        if(actalTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("login is success");
        }
        else if(driver.findElement(By.xpath("html/body/div[1]/div[1]/ul/li/div")).isDisplayed())
        {System.out.println("missing credential");}
        b.closingThePage(driver);

    }}

