package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;
import java.util.Random;

/**
 * Created by Sajitha on 8/16/2016.
 */
public class NewPrdtPage {

    public static void createPrdtTextPresnt(WebDriver driver){
        String ActualText=driver.findElement(By.xpath(".//*[@id='content']/h2")).getText();

        Assert.assertEquals(ActualText,"Create Product");

    }
public static void selVendrOfRecord(WebDriver driver){
    WebElement vendrOfPdtRcrd = driver.findElement(By.id("prd_vendor"));
    Select dropdown=new Select(vendrOfPdtRcrd);
    Random rand=new Random();
    int index=rand.nextInt(2)+1;
    dropdown.selectByIndex(index);

}




public static WebElement pdtName(WebDriver driver){
    WebElement ele=driver.findElement(By.id("prd_name"));
    return ele;
}
    public static Select  selBevrgType(WebDriver driver){
        WebElement beverageType = driver.findElement(By.name("prd_bev_type"));
        Select dropdown=new Select(beverageType);
        Random rand=new Random();
        int index=rand.nextInt(3)+1;
        dropdown.selectByIndex(index);
        //dropdown.selectByValue("NON-ALCOHOLIC");
return dropdown;
    }
    public static void selectClass(WebDriver driver){
        WebElement Class=driver.findElement(By.name("prd_class"));
        Select dropdown =new Select(Class);
        Random rand= new Random();
        int index=rand.nextInt(8)+1;
        // dropdown.selectByIndex(index);
        dropdown.selectByIndex(1);
    }
    public static void ClassType(WebDriver driver){
        WebElement Class=driver.findElement(By.name("prd_class_type"));
        Select dropdown =new Select(Class);
        Random rand= new Random();
        int index=rand.nextInt(6)+1;
        //dropdown.selectByIndex(index);
        dropdown.selectByIndex(1);
    }

public static WebElement proof(WebDriver driver)
{
WebElement ele=driver.findElement(By.id("prd_proof"));
    return ele;
}
    public static WebElement age(WebDriver driver){
        WebElement ele=driver.findElement(By.id("prd_age_number"));
        return ele;
    }
    public static void selChooseOne(WebDriver driver){
        WebElement ageType = driver.findElement(By.name("prd_age_type"));
        Select dropdown=new Select(ageType);
        dropdown.selectByValue("Day(s)");

    }

public static void radiobtn(WebDriver driver){
    List<WebElement> RadioGroup1 = driver.findElements(By.className("css-radio"));
    //for (int i=0;i<RadioGroup1.size();i++){
       // System.out.println(RadioGroup1.get(i).isSelected());
        RadioGroup1.get(1).click();
    }

public static WebElement formula(WebDriver driver){
    WebElement frmla=driver.findElement(By.id("prd_formula"));
    return frmla;
}
    public static WebElement dislrName(WebDriver driver){
        WebElement dstlrName=driver.findElement(By.id("prd_dist_name"));
        return dstlrName;
    }
    public static WebElement streetName(WebDriver driver){
        WebElement strt=driver.findElement(By.id("prd_dist_add1"));
        return strt;
    }
    public static WebElement street2(WebDriver driver ){
        WebElement strtName2=driver.findElement(By.id("prd_dist_add2"));
        return strtName2;
    }
     public static WebElement cityname(WebDriver driver){
         WebElement city=driver.findElement(By.id("prd_dist_city"));
         return city;

     }
    public static void countryName(WebDriver driver){
WebElement cntry =driver.findElement(By.id("prd_dist_country"));
        Select dropDown=new Select(cntry);
        dropDown.selectByValue("USA");

    }
public static void stateName(WebDriver driver){
    WebElement state=driver.findElement(By.id("prd_dist_state"));
    Select dropDown=new Select(state);
    dropDown.selectByValue("CO");
}
    public static WebElement zipCode(WebDriver driver){
        WebElement zip=driver.findElement(By.id("prd_dist_zip"));
        System.out.println(zip);
        return zip;
    }

    public static void checkBoxForAddress(WebDriver driver){
        driver.findElement(By.className("checkbox"));
        if( !driver.findElement(By.className("checkbox")).isSelected() )
        {
            driver.findElement(By.className("checkbox")).click();
        }


    }
    public static WebElement saveBtn(WebDriver driver){
        WebElement save=driver.findElement(By.id("save-product-button"));
        return save;
    }
}



