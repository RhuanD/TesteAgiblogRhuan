package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAppObjects {
    private final WebDriver driver;

    public SearchAppObjects(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSearchButton(){
        return driver.findElement(By.className("ast-search-icon"));
    }

    public WebElement getSearchTextField(){
        return driver.findElement(By.id("search-field"));
    }

    public WebElement getMainContent(){
        return driver.findElement(By.id("primary"));
    }

    public WebElement getHomeLogo(){
        return driver.findElement(By.className("site-branding"));
    }

    public WebElement getSiteContent(){
        return driver.findElement(By.id("content"));
    }

    public WebElement getReadTextButton(){
        return driver.findElement(By.linkText("Ler texto"));
    }




}
