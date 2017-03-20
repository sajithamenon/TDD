package CommonActions;

import Pages.RequestAcessPage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sajitha on 3/20/2017.
 */
public class RequestingAccess {
    static GenerateData g=new GenerateData();
    public static void requestAnAcces(WebDriver driver){
        RequestAcessPage.firstNameForRegsn(driver,g.generateRandomString(5));

    }

}
