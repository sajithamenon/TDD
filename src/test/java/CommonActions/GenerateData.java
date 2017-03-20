package CommonActions;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by Sajitha on 8/16/2016.
 */
public class GenerateData {



        public String generateRandomString(int length){
            return RandomStringUtils.randomAlphabetic(length);
        }

        public String generateRandomNumber(int length){
            return RandomStringUtils.randomNumeric(length);
        }

        public String generateRandomAlphaNumeric(int length){
            return RandomStringUtils.randomAlphanumeric(length);
        }

        public String generateStringWithAllobedSplChars(int length,String allowed){



           // String allowedChars="A";  //+numbers
                   String allowedInts="1234567890"; //allowdSplChrs;

           // String value= allowedChars + RandomStringUtils.random(length, allowedInts);
            return RandomStringUtils.random(length,allowedInts);
        }



        public String generateEmail(int length) {
            String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                    "1234567890" +   //numbers
                    "_-.";   //special characters
            String email="";
            String temp=RandomStringUtils.random(length,allowedChars);
            email=temp.substring(0,temp.length()-9)+"@test.org";
            return email;
        }

public String generateIntegers(int length,String integer){
    String integers="123456789";
    return RandomStringUtils.random(length,integers);
}
        public String generateUrl(int length) {
            String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
                    "1234567890" +   //numbers
                    "_-.";   //special characters
            String url="";
            String temp=RandomStringUtils.random(length,allowedChars);
            url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
            return url;
        }
    }


