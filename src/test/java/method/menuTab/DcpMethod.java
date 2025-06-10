package method.menuTab;

import io.appium.java_client.AppiumDriver;
import utilities.BasePage;

import static constants.StringConstants.ERROR_MSG;
import static constants.menuTab.DcpConstants.*;

public class DcpMethod extends BasePage {

    public DcpMethod(AppiumDriver driver) {
        super(driver);
    }
    public DcpMethod() {
        super(null);
    }

    public void dcpZeroCreateClick() {
        clickClickableElement(DCP_NAVIGATION_BUTTON,ERROR_MSG);
        clickClickableElement(CREATE_DCP,ERROR_MSG);
        clickClickableElement(CREATE_PRIVATE_DCP,ERROR_MSG);
        clickClickableElement(MONDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(TUESDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(WEDNESDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(THURSDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(FRIDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(CONTINUE_BUTTON,ERROR_MSG);
        clickClickableElement(LESSON_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(TEST_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(VIDEO_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_CREATE_LAST_BUTTON,ERROR_MSG);

    }
    public void dcpCreateClick() throws InterruptedException {
        clickClickableElement(DCP_NAVIGATION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_ALL_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_NEW_CREATE_BUTTON,ERROR_MSG);
        clickClickableElement(CREATE_DCP,ERROR_MSG);
        clickClickableElement(CREATE_PRIVATE_DCP,ERROR_MSG);
        clickClickableElement(MONDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(TUESDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(WEDNESDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(THURSDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(FRIDAY_SCHEDULE,ERROR_MSG);
        clickClickableElement(CONTINUE_BUTTON,ERROR_MSG);
        clickClickableElement(LESSON_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(TEST_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(VIDEO_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_CREATE_LAST_BUTTON,ERROR_MSG);

    }
    public void editDcpClick() {
        clickClickableElement(DCP_NAVIGATION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_ALL_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_EDIT_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_SCHEDULE_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_EDIT_CLOSE_BUTTON,ERROR_MSG);
    }
    public void stopDcpClick() {
        clickClickableElement(DCP_NAVIGATION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_ALL_SELECTION_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_STOP_BUTTON,ERROR_MSG);
        clickClickableElement(DCP_STOP_QUESTION_BUTTON,ERROR_MSG);
    }
}
