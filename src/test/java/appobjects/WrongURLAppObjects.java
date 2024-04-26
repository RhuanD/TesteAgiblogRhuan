package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WrongURLAppObjects {
    private final WebDriver driver;

    public WrongURLAppObjects (WebDriver driver){
        this.driver = driver;
    }

    public WebElement getContent(){
        return driver.findElement(By.className("content-area"));
    }
}
