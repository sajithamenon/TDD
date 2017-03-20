package Testcases;

        import CommonActions.CommonPages;
        import CommonActions.CreatingnNewProduct;
        import CommonActions.GenerateData;
        import Pages.CreatePrizeQuotePage;
        import Pages.NewPrdtPage;
        import Pages.SavedProductsPage;

        import Pages.SupplierDashBoard;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Reporter;
        import org.testng.annotations.*;
        import org.testng.annotations.Test;

/**
 * Created by Sajitha on 8/17/2016.
 */
public class NewProductFormationTest {

    public CommonPages c = new CommonPages();
    GenerateData gendata = new GenerateData();

    public WebDriver driver;

    @BeforeClass
    public void loginAsSupplier() {
       // System.setProperty("webdriver.ie.driver","C:\\Users\\Sajitha\\IdeaProjects\\Nabca\\src\\test\\java\\resource2\\IEDriverServer.exe");
        //driver=new InternetExplorerDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Sajitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
       // driver=new ChromeDriver();
        driver = new FirefoxDriver();
        c.openBrowser(driver);
        c.supplierLogin(driver);}


    @Test(priority = 0)
    public void newPrdctFormation ()throws InterruptedException {
        CreatingnNewProduct.create(driver);}
    /*@AfterClass
    public void quitin(){
        c.closingThePage(driver);
    }*/


}




