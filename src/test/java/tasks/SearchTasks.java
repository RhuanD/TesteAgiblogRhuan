package tasks;

import appobjects.SearchAppObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchTasks {
    private final SearchAppObjects searchAppObjects;

    public SearchTasks(WebDriver driver){
        searchAppObjects = new SearchAppObjects(driver);
    }

    public void clickSearchButton(){
        searchAppObjects.getSearchButton().click();
    }

    public void typeSearchTextField(String text){
        searchAppObjects.getSearchTextField().sendKeys(text);
        searchAppObjects.getSearchTextField().sendKeys(Keys.ENTER);
    }

    public void clickLogoHome(){
        searchAppObjects.getHomeLogo().click();
    }

    public void clickReadTextButton(){
        searchAppObjects.getReadTextButton().click();
    }

}
