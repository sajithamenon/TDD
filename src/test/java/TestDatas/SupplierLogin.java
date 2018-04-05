package TestDatas;

import org.testng.annotations.DataProvider;

/**
 * Created by Sajitha on 8/26/2016.
 *
 * /Users/sajitha/IdeaProjects/QA-Nabca/PQRS
 */
public class SupplierLogin {

    @DataProvider(name = "SupplierLogin")
    public static Object[][] adminLoginData() {
        return new Object[][]{
                {"", ""},//empty login
                {"@gmail.com", "in"},//wrong credentials
                {"sajitha.r+s@303software.com", "sajiraj123"},//currect credentials
                {"sajitha.r+supplier@303software.com", "ic"},//correct email,incorrect password
                {"sajitha", "sajiraj123"},//incorrect email,correct password
                {" ","sajiraj123"},//empty email and correct password
                {"sajitha.r+supplier@303software.com",""}//empty password and correct email

        };

    }



}


