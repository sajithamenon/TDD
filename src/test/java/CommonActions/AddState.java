package CommonActions;

        import Pages.AddStatePage;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Sajitha on 8/22/2016.
 */
public class AddState {
    static GenerateData gendata=new GenerateData();

    public static void addingState(WebDriver driver) throws InterruptedException {
        AddStatePage.plusToaddPsc(driver).click();
        AddStatePage.addStateBtn(driver).click();

        Thread.sleep(1000);
        AddStatePage.addState(driver).sendKeys("AL");

String stateCode="W"+gendata.generateStringWithAllobedSplChars(4,"1234567890");
      // String stateCode=gendata.generateIntegers(4,"123456789");
        // AddStatePage.addState(driver).sendKeys("ID");
       AddStatePage.addStateCode(driver).sendKeys(stateCode);

        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-state-button-final"))).click();


    }
}
