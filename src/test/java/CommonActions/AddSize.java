package CommonActions;

import Pages.CreatePrizeQuotePage;
import Pages.SavedProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

/**
 * Created by Sajitha on 8/21/2016.
 */
public class AddSize {
   // static CommonPages c=new CommonPages();
    //static SupplierDashBoard sdb=new SupplierDashBoard();
    static GenerateData gendata = new GenerateData();
    public static void  addingSize(WebDriver driver) throws InterruptedException {
        //CreatingnNewProduct.create(driver);

        SavedProductsPage.sizesAndPsc(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-size"))).click();

        CreatePrizeQuotePage.selVolume(driver);
        CreatePrizeQuotePage.botlDimsnD(driver).sendKeys("1");
        String length1 = gendata.generateRandomNumber(1);
        String length2 = gendata.generateRandomNumber(1);
        String length3 = gendata.generateRandomNumber(1);


        String Depth=gendata.generateRandomNumber(1);
        Random r=new Random();



        CreatePrizeQuotePage.botlDimsnL(driver).sendKeys("1");
        CreatePrizeQuotePage.botlDimsnH(driver).sendKeys("1");
        CreatePrizeQuotePage.unitsPrCase(driver).sendKeys(gendata.generateIntegers(1,("123456789")));
        CreatePrizeQuotePage.unitsPeSleeve(driver).sendKeys(gendata.generateRandomNumber(1));
        CreatePrizeQuotePage.caseWt(driver).sendKeys(gendata.generateRandomNumber(2));

        CreatePrizeQuotePage.caseDimsnL(driver).sendKeys("2");
        CreatePrizeQuotePage.caseDimsnW(driver).sendKeys("2");
        CreatePrizeQuotePage.caseDimsnH(driver).sendKeys("2");
        CreatePrizeQuotePage.paltDimsnL(driver).sendKeys("5");
        CreatePrizeQuotePage.paltW(driver).sendKeys("5");
        CreatePrizeQuotePage.paltH(driver).sendKeys("5");
        CreatePrizeQuotePage.casesPrPlt(driver).sendKeys("1");
        CreatePrizeQuotePage.casesPrPltLyr(driver).sendKeys("1");
        CreatePrizeQuotePage.crntUpcEan(driver).sendKeys(gendata.generateRandomNumber(14));
        CreatePrizeQuotePage.cseScc(driver).sendKeys(gendata.generateRandomNumber(14));
        CreatePrizeQuotePage.checkBx(driver);
        CreatePrizeQuotePage.chekdVapDescpn(driver).sendKeys(gendata.generateRandomString(10));
        Thread.sleep(1000);
        CreatePrizeQuotePage.chekdVapUpc(driver).sendKeys(gendata.generateRandomNumber(12));
        CreatePrizeQuotePage.saveDeatils(driver).click();




    }
}
