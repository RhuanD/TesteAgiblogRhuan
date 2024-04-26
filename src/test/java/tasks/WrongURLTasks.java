package tasks;

import appobjects.WrongURLAppObjects;
import org.openqa.selenium.WebDriver;

public class WrongURLTasks {
    private final WrongURLAppObjects wrongURLAppObjects;

    public WrongURLTasks(WebDriver driver){
        wrongURLAppObjects = new WrongURLAppObjects(driver);
    }

    public String getWrongURLContent(){
        return wrongURLAppObjects.getContent().getText();
    }




}
