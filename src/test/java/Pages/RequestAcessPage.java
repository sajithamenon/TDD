package Pages;

import CommonActions.GenerateData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Sajitha on 1/26/2017.
 */
public class RequestAcessPage {
static GenerateData g=new GenerateData();


    public static void firstNameForRegsn(WebDriver driver,String FirstName){

        driver.findElement(By.id("first-name")).sendKeys(FirstName);
    }
    public static void lastNameForRegsn(WebDriver driver,String LastName){
        driver.findElement(By.id("last-name")).sendKeys(LastName);
    }
public static void emailForRegsn(WebDriver driver,String email){
    driver.findElement(By.id("email")).sendKeys(email);

}
    public static void phoneForRegsn(WebDriver driver,int Number){
        driver.findElement(By.id(g.generateRandomNumber(10)));
    }
public static void radioBtn(WebDriver driver){
    List<WebElement> radio = driver.findElements(By.xpath("html/body/div[1]/section/section/section/form/fieldset/div[1]/div[1]/div[8]/label[3]"));
    WebDriverWait wait =new WebDriverWait(driver,15);
    wait.until(ExpectedConditions.elementToBeClickable(radio.get(0)));
    radio.get(0).click();
}
    public static void selectControleState(WebDriver driver){
        WebElement checkbox1 = driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[3]/label"));
        WebElement checkbox2=driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[5]/label"));
        WebElement checkbox3=driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/div[1]/div[9]/span[8]/label"));
        checkbox3.click();
        checkbox1.click();;
        checkbox2.click();
    }







}

