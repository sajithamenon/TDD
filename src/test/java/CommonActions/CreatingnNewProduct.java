package CommonActions;

import CommonActions.CommonPages;
import CommonActions.GenerateData;
import Pages.NewPrdtPage;
import Pages.SavedProductsPage;
import Pages.SupplierDashBoard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Created by Sajitha on 8/21/2016.
 */
public class CreatingnNewProduct {
    static CommonPages c=new CommonPages();
    //static SupplierDashBoard sdb=new SupplierDashBoard();
    static GenerateData gendata = new GenerateData();
    public static void create(WebDriver driver) throws InterruptedException {
        SupplierDashBoard.newPrdts(driver).click();
        Thread.sleep(1000);
        NewPrdtPage.createPrdtTextPresnt(driver);
        System.out.println("The Create product page is opened");
        //NewPrdtPage.selVendrOfRecord(driver);
        NewPrdtPage.pdtName(driver).sendKeys(gendata.generateRandomString(9));
        String ele= NewPrdtPage.selBevrgType(driver).getFirstSelectedOption().getText();
        if (ele.equalsIgnoreCase("Non-alcoholic")){

        //NewPrdtPage.age(driver).sendKeys(gendata.generateRandomNumber(1));
       // NewPrdtPage.selChooseOne(driver);
        NewPrdtPage.radiobtn(driver);
        NewPrdtPage.formula(driver).sendKeys(gendata.generateRandomString(10));
        NewPrdtPage.dislrName(driver).sendKeys(gendata.generateRandomString(7));
        NewPrdtPage.streetName(driver).sendKeys(gendata.generateRandomNumber(4));
        NewPrdtPage.street2(driver).sendKeys(gendata.generateRandomString(9));
        NewPrdtPage.cityname(driver).sendKeys(gendata.generateRandomString(5));
        NewPrdtPage.countryName(driver);
        NewPrdtPage.zipCode(driver).sendKeys(gendata.generateRandomNumber(5));
        //NewPrdtPage.zipCode(driver).sendKeys(gendata.generateRandomNumber(5));
        NewPrdtPage.stateName(driver);
        NewPrdtPage.checkBoxForAddress(driver);

        WebDriverWait wait = new WebDriverWait(driver, 20);
                Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("save-product-button"))).click();
        SavedProductsPage.EditDetailsTabPresent(driver);}
        else //if(ele.equalsIgnoreCase("Spirit"))
             {
            NewPrdtPage.selectClass(driver);
            NewPrdtPage.ClassType(driver);
            NewPrdtPage.proof(driver).sendKeys("1");
            NewPrdtPage.age(driver).sendKeys(gendata.generateRandomNumber(1));
             NewPrdtPage.selChooseOne(driver);
            NewPrdtPage.radiobtn(driver);
            NewPrdtPage.formula(driver).sendKeys(gendata.generateRandomString(10));
            NewPrdtPage.dislrName(driver).sendKeys(gendata.generateRandomString(7));
            NewPrdtPage.streetName(driver).sendKeys(gendata.generateRandomNumber(4));
            NewPrdtPage.street2(driver).sendKeys(gendata.generateRandomString(9));
            NewPrdtPage.cityname(driver).sendKeys(gendata.generateRandomString(5));
            NewPrdtPage.countryName(driver);
            NewPrdtPage.zipCode(driver).sendKeys(gendata.generateRandomNumber(5));

            NewPrdtPage.stateName(driver);
            NewPrdtPage.checkBoxForAddress(driver);

            WebDriverWait wait = new WebDriverWait(driver, 20);
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("save-product-button"))).click();
            SavedProductsPage.EditDetailsTabPresent(driver);

        }



    }

}
