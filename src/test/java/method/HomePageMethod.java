package method;

import utilities.BasePage;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;

import static constants.HomePageConstants.*;
import static constants.StringConstants.*;

@Slf4j
public class HomePageMethod extends BasePage {
    public HomePageMethod(AppiumDriver driver) {
        super(driver);
    }
    public HomePageMethod() {
        super(null);
    }


    public void notificationControl() {
        clickClickableElement(NOTIFICATION, ERROR_MSG);
        verifyTextControl(NOTIFICATION_TEXT, ERROR_MSG, NOTIFICATION_MSG);
        clickClickableElement(EVERYDAY_DOPING, ERROR_MSG);
        clickClickableElement(BACK_BUTTON, ERROR_MSG);
        verifyTextControl(SEARCH_BUTTON, ERROR_MSG, HOME_PAGE_MSG);

    }
    public void dailyLessonControl() {
        verifyTextControl(TODAY_LESSON, ERROR_MSG, TODAY_LESSON_MSG);
    }
    public void dailyTaskControl() {
        verifyTextControl(DAILY_TASK, ERROR_MSG, DAILY_TASK_MSG);
    }

    public void searchControl() {
        clickClickableElement(SEARCH_BUTTON, ERROR_MSG);
        clickClickableElement(GET_SEARCH_BUTTON, ERROR_MSG);
        sendKeys(SEARCH_MSG, GET_SEARCH_BUTTON);
        verifyTextControl(SEARCH_RESULT_TEXT, ERROR_MSG, RESULT_MSG);
        clickClickableElement(GIVE_UP, ERROR_MSG);
        clickClickableElement(GIVE_UP, ERROR_MSG);
        verifyTextControl(SEARCH_BUTTON, ERROR_MSG, HOME_PAGE_MSG);

    }

    public void lessonControl() {
        scroll(NOTICE, ScrollDirection.DOWN, 0.2);
        clickClickableElement(VERBAL, ERROR_MSG);
        verifyTextControl(LESSON_TEXT_VERBAL, ERROR_MSG, VERBAL_MSG);
        clickClickableElement(NUMERICAL, ERROR_MSG);
        verifyTextControl(LESSON_TEXT_NUMERICAL, ERROR_MSG, NUMERICAL_MSG);
    }


    public void noticeControl() {
        scrollClick();
        verifyTextControl(NOTICE, ERROR_MSG, NOTICE_MSG);
        clickClickableElement(ALL_SEE_BUTTON, ERROR_MSG);
        verifyTextControl(NOTICE, ERROR_MSG, NOTICE_MSG);


    }

    public void checkProgrammingSelection() {
        findElement(PROGRAM_SELECTION_CREATE);
        clickClickableElement(PROGRAM_SELECTION_CREATE, ERROR_MSG);
        verifyTextControl(DAY_TASK_TEXT, ERROR_MSG, STUDY_WORKING_MSG);
        clickClickableElement(STUDY_SCHEDULE, ERROR_MSG);
        verifyTextControl(PROGRAM_SELECTION, ERROR_MSG, PROGRAM_SELECTION_MSG);
        clickClickableElement(LESSON_PLANNING_GIVE_UP, ERROR_MSG);
        clickClickableElement(HOME_PAGE_MENU, ERROR_MSG);
        verifyTextControl(SEARCH_BUTTON, ERROR_MSG, HOME_PAGE_MSG);
    }

    public void dailyTask() {

        clickClickableElement(ALL_SEE_BUTTON, ERROR_MSG);
        verifyTextControl(ALL_SEE_USER, ERROR_MSG, USER_DETAILS_MSG);
        clickClickableElement(DAY_LESSON_GIVE_UP, ERROR_MSG);
        verifyTextControl(SEARCH_BUTTON, ERROR_MSG, HOME_PAGE_MSG);


    }

    public void noticeAllSeeButtonControl() {
        scroll(NOTICE_ALL_BUTTON, ScrollDirection.DOWN, 0.5);
        clickClickableElement(NOTICE_ALL_BUTTON, ERROR_MSG);
        clickClickableElement(NOTICE_GIVE_UP, ERROR_MSG);
        verifyTextControl(LAST_ACTIVITY_TEXT, ERROR_MSG, LAST_ACTIVITY_MSG);
    }

    public void lastActivityControl() {
        scrollClick();
        verifyTextControl(LAST_ACTIVITY_TEXT, ERROR_MSG, LAST_ACTIVITY_MSG);

    }

    public void allowPopupControl() {
        if (isElementDisplayed(GET_NOTIFICATION_ALLOW_GET)) {
            clickClickableElement(GET_NOTIFICATION_ALLOW_GET, ERROR_MSG);
            clickClickableElement(POP_UP_ALLOW, ERROR_MSG);
        } else {
            log.info("Popup Not Displayed");
        }
    }


}
