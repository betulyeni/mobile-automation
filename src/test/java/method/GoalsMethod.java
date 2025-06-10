package method;

import io.appium.java_client.AppiumDriver;
import utilities.BasePage;

import static constants.GoalsConstants.*;
import static constants.StringConstants.*;

public class GoalsMethod extends BasePage {
    public GoalsMethod(AppiumDriver driver) {
        super(driver);
    }
    public GoalsMethod() {
        super(null);
    }
    public void goalsCreate() {
    clickClickableElement(CREATE_GOALS,ERROR_MSG);
    isElementClickable(GOALS_TITLE);

    }
}
