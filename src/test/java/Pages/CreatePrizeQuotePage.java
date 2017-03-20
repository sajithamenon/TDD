package Pages;

import CommonActions.CommonPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by Sajitha on 8/17/2016.
 */
public class CreatePrizeQuotePage {
    //static CommonPages c=new CommonPages();AddSize page


    public static void  selVolume(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("size_id"));
        Select dropdown=new Select(ele);
       // dropdown.selectByVisibleText("50.00ML");
        Random rand = new Random();
        int randIndex = rand.nextInt(15)+1;
        dropdown.selectByIndex(randIndex);
    }

    public static WebElement botlDimsnD(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("bottle_depth"));
        return ele;
    }

    public static WebElement botlDimsnL(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("bottle_length"));
        return ele;
    }

    public static WebElement botlDimsnH(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("bottle_height"));
        return ele;
    }

    public static WebElement unitsPrCase(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("units_per_case"));
        return ele;
    }

    public static WebElement unitsPeSleeve(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("units_per_sleeve"));
        return ele;

    }
    public static WebElement caseWt(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("case_weight"));
        return ele;}
    public static WebElement caseDimsnL(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("case_length"));
        return ele;}
    public static WebElement caseDimsnW(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("case_width"));
        return ele;}
    public static WebElement caseDimsnH(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("case_height"));
        return ele;}
    public static WebElement paltDimsnL(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("pallet_length"));
        return ele;}
    public static WebElement paltW(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("pallet_width"));
        return ele;}
    public static WebElement paltH(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("pallet_height"));
        return ele;}
    public static WebElement casesPrPlt(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("cases_per_pallet"));
        return ele;}
    public static WebElement casesPrPltLyr(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("cases_per_pallet_layer"));
        return ele;}
    public static WebElement crntUpcEan(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("current_gtin"));
        return ele;}
    public static WebElement cseScc(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("sscc_number"));
        return ele;}
    public static void checkBx(WebDriver driver) {

        if( !driver.findElement(By.className("checkbox")).isSelected() )
        {
            driver.findElement(By.className("checkbox")).click();
        }

        }
    public static WebElement chekdVapUpc(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("vap_gtin"));
        return ele;}
    public static WebElement chekdVapDescpn(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("vap_notes"));
        return ele;}
    public static WebElement saveDeatils(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("save-size-details"));
        return ele;}






}
