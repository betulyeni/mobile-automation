package method.menuTab;
import utilities.BasePage;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;

import static constants.LoginConstants.*;
import static constants.StringConstants.*;
import static constants.menuTab.MenuTabConstants.*;


@Slf4j
public class MenuTabMethod extends BasePage {

    public MenuTabMethod(AppiumDriver driver) {
        super(driver);
    }
    public MenuTabMethod() {
        super(null);
    }

    public void menuTabClick() {
        clickClickableElement(MENU_BUTTON, ERROR_MSG);
        verifyTextControl(USER_ID, ERROR_MSG, USER_ID_MSG);
    }



    public void studyWorkingClick() {
        clickClickableElement(STUDY_WORKING, ERROR_MSG);
        verifyTextControl(STUDY_WORKING_TEXT, ERROR_MSG, STUDY_WORKING_MSG);
        clickClickableElement(STUDY_WORKING_GIVE_UP, ERROR_MSG);

    }

    public void gradeChangeControl() {
        clickClickableElement(CHANGE_CLASS, ERROR_MSG);
        boolean checkControl = isElementDisplayed(CHANGE_CLASS_SELECTION);
        if (checkControl) {
            log.info("first class seen");
        } else {
            log.error("Error Locator");
        }
    }

    public void guidingVideosClick() {
        clickClickableElement(GUIDING_VIDEOS, ERROR_MSG);
        verifyTextControl(GUIDING_VIDEOS, ERROR_MSG, GUIDING_VIDEOS_MSG);
        clickClickableElement(GUIDING_VIDEOS_GIVE_UP, ERROR_MSG);

    }

    public void smartEvaluationPanelClick() {
        clickClickableElement(SMART_EVALUATION_PANEL, ERROR_MSG);
        verifyTextControl(SMART_EVALUATION_PANEL, ERROR_MSG, SMART_EVALUATION_PANEL_MSG);
        clickClickableElement(SMART_EVALUATION_PANEL_GIVE_UP, ERROR_MSG);

    }


    public void goalsClick() {
        clickClickableElement(GOALS, ERROR_MSG);
        verifyTextControl(GOALS_TEXT, ERROR_MSG, GOALS_MSG);
        clickClickableElement(GOALS_GIVE_UP, ERROR_MSG);

    }

    public void statisticsClick() {
        clickClickableElement(STATISTICS, ERROR_MSG);
        verifyTextControl(STATISTICS, ERROR_MSG, STATISTICS_MSG);
        clickClickableElement(STATISTICS_GIVE_UP, ERROR_MSG);

    }


    public void settingClick() {
        clickClickableElement(SETTINGS, ERROR_MSG);
        verifyTextControl(SETTINGS_TEXT, ERROR_MSG, SETTINGS_MSG);
        clickClickableElement(SETTINGS_GIVE_UP, ERROR_MSG);
    }

    public void feedbackClick() {
        clickClickableElement(FEEDBACK, ERROR_MSG);
        verifyTextControl(FEEDBACK_TEXT, ERROR_MSG, FEEDBACK_MSG);
        clickClickableElement(FEEDBACK_GIVE_UP, ERROR_MSG);
    }

    public void oneToOneMeetClick() {
        clickClickableElement(ONE_TO_ONE_BUTTON, ERROR_MSG);
        verifyTextControl(ONE_TO_ONE_TEXT, ERROR_MSG, ONE_TO_ONE_CONTROL_MSG);
        clickClickableElement(ONE_TO_ONE_BUTTON, ERROR_MSG);
    }

    public void rosetteClick() {
        clickClickableElement(ROSETTE, ERROR_MSG);
        verifyTextControl(ROSETTE_TEXT, ERROR_MSG, USERNAME_TEXT_MSG);
        clickClickableElement(ROSETTE_GIVE_UP, ERROR_MSG);
    }

    public void userChangeClick() {
        clickClickableElement(NEW_USER, ERROR_MSG);
        clickClickableElement(LOG_OUT_OK, ERROR_MSG);
        verifyTextControl(USER_LOGIN_TEXT, ERROR_MSG, WELCOME_TEXT_MSG);

    }

    public void userIdClick() {
        clickClickableElement(USER_ID, ERROR_MSG);
        verifyTextControl(USER_DETAILS_TEXT, ERROR_MSG, USER_INFORMATION_MSG);
        clickClickableElement(USER_DETAILS_GIVE_UP, ERROR_MSG);
    }


}


