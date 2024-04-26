package verificationpoints;

import appobjects.SearchAppObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import reports.Reports;
import reports.ScreenShot;

public class WrongURLVerificationPoint {
    WebDriver driver;

    public WrongURLVerificationPoint(WebDriver driver){
        this.driver = driver;
    }

    public void verifyWrongURL(String content, String pageNotFound){
        Assert.assertTrue(content.contains(pageNotFound));
        Reports.logPass("Retornou para a Page Not Found", ScreenShot.capture(driver));
    }
}
