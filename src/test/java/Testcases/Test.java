package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.TestInstance;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sajitha on 3/14/2017.
 */
public class Test {
    WebDriver driver;

    @org.testng.annotations.Test
    public void dropdown() throws InterruptedException {

        // driver= new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://52.24.76.254/#!/login");
        driver.findElement(By.linkText("Request an account")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("first-name")).sendKeys("Rajesh");
        driver.findElement(By.id("last-name")).sendKeys("rr");
        driver.findElement(By.id("email")).sendKeys("Sa@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("1234567890");
        List<WebElement> radio = driver.findElements(By.xpath("html/body/div[1]/section/section/section/form/fieldset/div[1]/div[1]/div[8]/label[3]"));
        WebDriverWait wait =new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(radio.get(0)));
        radio.get(0).click();
        WebElement checkbox1 = driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[3]/label"));
        WebElement checkbox2=driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[5]/label"));
WebElement checkbox3=driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[8]/label"));
        checkbox3.click();
checkbox1.click();;
        checkbox2.click();

    }






    }
