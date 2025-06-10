package method.menuTab;

import io.appium.java_client.AppiumDriver;
import utilities.BasePage;

import static constants.StringConstants.ERROR_MSG;
import static constants.menuTab.ClassConstants.*;

public class ClassMethod extends BasePage {
    public ClassMethod(AppiumDriver driver) {
        super(driver);
    }
    public ClassMethod() {
        super(null);
    }

    public void classChange4(){
        clickClickableElement(CLASS_FOUR,ERROR_MSG);
    }
    public void classChange5(){
        clickClickableElement(CLASS_FIVE,ERROR_MSG);
    }
    public void classChange6(){

        clickClickableElement(CLASS_SIX,ERROR_MSG);
    }
    public void classChange7(){

        clickClickableElement(CLASS_SEVEN,ERROR_MSG);
    }
    public void classChange9(){

        clickClickableElement(CLASS_NINE,ERROR_MSG);
    }
    public void classChange10(){

        clickClickableElement(CLASS_TEN,ERROR_MSG);
    }
    public void classChange11(){
        clickClickableElement(CLASS_ELEVEN,ERROR_MSG);
    }

}
