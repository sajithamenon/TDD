package CommonActions;

import Pages.PqSubitPage;
import Pages.PrizeQuotePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sajitha on 8/25/2016.
 */
public class PqSubit {
    static GenerateData gendata=new GenerateData();
    public static void submittingPq(WebDriver driver)  {
        PqSubitPage.splPrchsOdrPln(driver);

        PqSubitPage.inbond(driver);
        PqSubitPage.stateBlmnt(driver);
        PqSubitPage.effDte(driver);
        PqSubitPage.rsnFrChng(driver);

        PqSubitPage.ntCstFobSpPnt(driver).sendKeys(gendata.generateIntegers(3,"123456789"));
        PqSubitPage.shpngPtAdd1(driver).sendKeys(gendata.generateRandomString(7));
        PqSubitPage.spngPtAdd2(driver).sendKeys(gendata.generateRandomString(9));
        PqSubitPage.city(driver).sendKeys(gendata.generateRandomString(5));
        PqSubitPage.state(driver);
        PqSubitPage.shpngPtZip(driver).sendKeys(gendata.generateIntegers(5,"123456789"));
        PqSubitPage.shpngCountry(driver);
        //PqSubitPage.fobStAdrs(driver).sendKeys(gendata.generateRandomString(5));
       // PqSubitPage.fobCity(driver).sendKeys(gendata.generateRandomString(8));
        //PqSubitPage.fobState(driver);
        //PqSubitPage.fobZip(driver).sendKeys(gendata.generateIntegers(5,"123456789"));
        PqSubitPage.stateRepName(driver).sendKeys(gendata.generateRandomString(5));
        PqSubitPage.cmpnyName(driver).sendKeys(gendata.generateRandomString(6));
        PqSubitPage.stateAdrs1(driver).sendKeys(gendata.generateRandomString(7));
        PqSubitPage.stateRepCity(driver).sendKeys(gendata.generateRandomString(5));
        PqSubitPage.stateRepState(driver);
        PqSubitPage.stateRepZip(driver).sendKeys(gendata.generateIntegers(5,"123456789"));
        PqSubitPage.phNbr(driver).sendKeys(gendata.generateIntegers(10,"123456789"));
        PqSubitPage.emai(driver).sendKeys("a@b.com");
        PqSubitPage.splrNmame(driver).sendKeys(gendata.generateRandomString(6));
        PqSubitPage.splrAdrs1(driver).sendKeys(gendata.generateRandomString(5));
        PqSubitPage.splrCity(driver).sendKeys(gendata.generateRandomString(5));
        PqSubitPage.country(driver);
        PqSubitPage.splrState(driver);
        PqSubitPage.suplrZip(driver).sendKeys(gendata.generateIntegers(5,"123456789"));
        PqSubitPage.licNo(driver).sendKeys(gendata.generateRandomNumber(10));
        PqSubitPage.fedId(driver).sendKeys(gendata.generateRandomNumber(10));
        PqSubitPage.complnceOffce(driver).sendKeys(gendata.generateRandomString(7));
        PqSubitPage.complnceOffcePhNum(driver).sendKeys(gendata.generateIntegers(10,"123456789)"));
        PqSubitPage.complnceOffceEmail(driver).sendKeys("a@v.com");
       // PqSubitPage.sbmt(driver).click();
       // PqSubitPage.submit(driver);
       // PqSubitPage.yes(driver);
        //PqSubitPage.confirmn(driver);



    }
}




