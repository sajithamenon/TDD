import CommonActions.GenerateData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sajitha on 6/16/2016.
 */
public class LoginPage {
GenerateData gendata=new GenerateData()
;    @Test
    public void openurl() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Sajitha\\Downloads\\chromedriver_win32\\chromedriver.exe");

    //WebDriver driver=new ChromeDriver();
       WebDriver driver=new FirefoxDriver();
        Reporter.log(("opening the NABCA Web Page"));
        driver.get("http://52.24.76.254/#!/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Reporter.log("Entering the User Name");
        driver.findElement(By.id("username")).sendKeys("sajitha.r+supplier@303software.com");
        driver.findElement(By.id("password")).sendKeys("sajiraj123");
        //driver.findElement(By.xpath("//form[@id='user_login']//fieldset//button[@class='btn']")).click();
        driver.findElement(By.className("btn")).click();
WebDriverWait wait =new WebDriverWait(driver,10);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/header/nav/ul/li[6]/a"))).click();
        String ele=driver.findElement(By.xpath(".//*[@id='content']/h2")).getText();
        System.out.println(ele);
        Assert.assertEquals("Create Product",ele);
        WebElement bvrg =driver.findElement(By.name("prd_bev_type"));
        Select dropdown=new Select(bvrg);
        dropdown.selectByValue("NON-ALCOHOLIC");
        driver.findElement(By.id("prd_name")).sendKeys("wwwww");
        driver.findElement(By.id("prd_age_number"));
        driver.findElement(By.id("prd_age_number")).sendKeys(gendata.generateRandomNumber(2));
        List<WebElement> RadioGroup1 = driver.findElements(By.className("css-radio"));
        for (int i=0;i<RadioGroup1.size();i++){
            System.out.println(RadioGroup1.get(i).isSelected());
            RadioGroup1.get(1).click();
        }
driver.findElement(By.className("checkbox"));
        if( !driver.findElement(By.className("checkbox")).isSelected() )
        {
            driver.findElement(By.className("checkbox")).click();
        }
driver.findElement(By.id("save-product-button")).click();
        Thread.sleep(1000);
       System.out.println( driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div[1]/div/div[3]/button")).getText());
        Thread.sleep(1000);









       /* WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='user_login']//fieldset//button[@class='btn']")));
        Reporter.log("Login is Success");*/



    }




}
