package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

/**
 * Created by Sajitha on 8/25/2016.
 */
public class PqSubitPage {
    public static void splPrchsOdrPln(WebDriver driver){
        WebElement ele=driver.findElement(By.id("special_order_plan"));
        Select dropdown= new Select(ele);
        Random r=new Random();
        int index=r.nextInt(2);
        dropdown.selectByIndex(index);
    }
    public static void inbond(WebDriver driver){
WebElement inbon=driver.findElement(By.id("inbond_no"));
        Select dropdown=new Select(inbon);
        Random r=new Random();
       int index= r.nextInt(2)+1;
dropdown.selectByIndex(index);
    }
    public static void stateBlmnt(WebDriver driver){
        WebElement ele=driver.findElement(By.id("state_stock_bailment"));
        Select dropdown=new Select(ele);
        //Random r=new Random();
//int index=r.nextInt(3)+1;
        dropdown.selectByIndex(2);
    }
    public static void effDte(WebDriver driver){
       WebElement ele= driver.findElement(By.id("effective-date-select"));
        Select dropdown=new Select(ele);
        Random r=new Random();
        int index=r.nextInt(3)+1;

        dropdown.selectByIndex(index);
    }
    public static WebElement rsnFrChng(WebDriver driver){
        WebElement ele= driver.findElement(By.id("reason-for-change-checkbox[3]"));
        return ele;
    }

    public static WebElement ntCstFobSpPnt(WebDriver driver){
        WebElement ele= driver.findElement(By.id("net_cost_fob"));
        return ele;
    }
    public static WebElement shpngPtAdd1(WebDriver driver){
        WebElement ele= driver.findElement(By.id("shipping_point_address_1"));
        return ele;
    }
    public static WebElement spngPtAdd2(WebDriver driver){
        WebElement ele= driver.findElement(By.id("shipping_point_address_2"));
        return ele;
    }
    public static WebElement city(WebDriver driver){
        WebElement ele= driver.findElement(By.id("shipping_point_city"));
        return ele;
    }
    public static void state(WebDriver driver){
        WebElement ele= driver.findElement(By.id("shipping_point_state"));
        Select dropdwn=new Select(ele);
        Random r=new Random();
        int indx=r.nextInt(50)+1;
        dropdwn.selectByIndex(indx);

    }
    public static WebElement  shpngPtZip(WebDriver driver){
        WebElement ele= driver.findElement(By.id("shipping_point_zip"));
        return ele;
    }
    public static void shpngCountry(WebDriver driver){
        WebElement ele= driver.findElement(By.id("shipping_point_country"));
        Select dropdwn=new Select(ele);
        dropdwn.selectByValue("USA");}
    public static WebElement  fobStAdrs(WebDriver driver){
        WebElement ele= driver.findElement(By.id("fob_point_address_1"));
        return ele;
    }

    public static WebElement  fobCity(WebDriver driver){
        WebElement ele= driver.findElement(By.id("fob_point_city"));
        return ele;
    }

    public static void fobState(WebDriver driver) {
        WebElement ele = driver.findElement(By.id("fob_point_state"));
        Select dropdwn = new Select(ele);
        Random r = new Random();
        int indx = r.nextInt(50) + 1;
        dropdwn.selectByIndex(indx);
    }
    public static WebElement  fobZip(WebDriver driver){
        WebElement ele= driver.findElement(By.id("fob_point_zip"));
        return ele;
    }
    public static WebElement  stateRepName(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_name"));
        return ele;
    }
    public static WebElement  cmpnyName(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_company"));
        return ele;
    }
    public static WebElement  stateAdrs1(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_address_1"));
        return ele;
    }
    public static WebElement  stateRepCity(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_city"));
        return ele;
    }
    public static void stateRepState(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_state"));
        Select dropdwn=new Select(ele);
        Random r=new Random();
        int r3=r.nextInt(50)+1;
        dropdwn.selectByIndex(r3);

    }
    public static WebElement  stateRepZip(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_zip"));
        return ele;
    }


    public static WebElement  phNbr(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_phone"));
        return ele;
    }

    public static WebElement  emai(WebDriver driver){
        WebElement ele= driver.findElement(By.id("state_rep_email"));
        return ele;
    }
    public static WebElement  splrNmame(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_name"));
        return ele;
    }
    public static WebElement  splrAdrs1(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_address_1"));
        return ele;
    }
    public static WebElement  splrCity(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_city"));
        return ele;}
    public static void country(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_country"));
        Select dropdwn=new Select(ele);
        dropdwn.selectByValue("USA");

    }
    public static void splrState(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_state"));
        Select dropdwn=new Select(ele);
        Random r=new Random();
        int r2=r.nextInt(50)+1;
        dropdwn.selectByIndex(r2);

    }
    public static WebElement  suplrZip(WebDriver driver){
        WebElement ele= driver.findElement(By.name("supplier_zip"));
        return ele;}
    public static WebElement  licNo(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_license_permit_no"));
        return ele;}

    public static WebElement  fedId(WebDriver driver){
        WebElement ele= driver.findElement(By.id("supplier_federal_id"));
        return ele;}
    public static WebElement  sbmt(WebDriver driver){
        WebElement ele= driver.findElement(By.id("save-and-complete-pq-button"));
        return ele;}
    public static WebElement  complnceOffce(WebDriver driver){
        WebElement ele= driver.findElement(By.id("compliance_officer_name"));
        return ele;}

    public static WebElement  complnceOffcePhNum(WebDriver driver){
        WebElement ele= driver.findElement(By.id("compliance_officer_phone"));
        return ele;}
    public static WebElement  complnceOffceEmail(WebDriver driver){
        WebElement ele= driver.findElement(By.id("compliance_officer_email"));
        return ele;}
public static void submit(WebDriver driver){
    WebDriverWait wait =new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-draft-button"))).click();

}
    public static void yes(WebDriver driver){
        WebDriverWait wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("certify-modal-confirm-button"))).click();

    }
    public static void confirmn(WebDriver driver){
        WebDriverWait wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[3]/div/div/div/div[2]/p"))).isDisplayed();

    }



}

