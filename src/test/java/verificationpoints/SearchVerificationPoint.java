package verificationpoints;

import appobjects.SearchAppObjects;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import reports.Reports;
import reports.ScreenShot;

public class SearchVerificationPoint {
    private final SearchAppObjects searchAppObjects;
    private final WebDriver driver;

    public SearchVerificationPoint(WebDriver driver){
        this.driver = driver;
        searchAppObjects = new SearchAppObjects(driver);
    }

    public void verifySearch() {
        Assert.assertTrue(searchAppObjects.getMainContent().getText().contains("Resultados encontrados para: lucra"));
        Reports.logPass("Retornou resultados à busca", ScreenShot.capture(driver));
    }

    public void verifyHome(){
        Assert.assertTrue(searchAppObjects.getSiteContent().getText().contains("Últimas"));
        Reports.logPass("Retornou para a home page", ScreenShot.capture(driver));
    }
}
