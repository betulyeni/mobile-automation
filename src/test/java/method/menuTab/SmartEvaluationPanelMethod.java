package method.menuTab;

import utilities.BasePage;
import io.appium.java_client.AppiumDriver;

import static constants.StringConstants.*;
import static constants.menuTab.SmartEvaluationPanelConstants.*;

public class SmartEvaluationPanelMethod extends BasePage {
    public SmartEvaluationPanelMethod(AppiumDriver driver) {
        super(driver);
    }
    public SmartEvaluationPanelMethod() {
        super(null);
    }

    public void clickSmartEvaluation() {
        clickClickableElement(SMART_EVALUATION_BUTTON, ERROR_MSG);
        clickClickableElement(SMART_EVALUATION_GIVE_UP, ERROR_MSG);
    }

    public void lessonMatch() {
        clickClickableElement(SMART_EVALUATION_BUTTON, ERROR_MSG);
        clickClickableElement(SYLLABUS_BUTTON_ONE, ERROR_MSG);
        verifyTextControl(SUBJECT_NAME, ERROR_MSG, SUBJECTNAME);
        clickClickableElement(SYLLABUS_BUTTON_ONE, ERROR_MSG);
        clickClickableElement(SMART_EVALUATION_GIVE_UP, ERROR_MSG);
    }

    public void lessonScience() {
        clickClickableElement(SMART_EVALUATION_BUTTON, ERROR_MSG);
        clickClickableElement(SYLLABUS_BUTTON_TWO, ERROR_MSG);
        verifyTextControl(SUBJECT_NAME, ERROR_MSG, SUBJECTNAME);
        clickClickableElement(SYLLABUS_BUTTON_TWO, ERROR_MSG);
        clickClickableElement(SMART_EVALUATION_GIVE_UP, ERROR_MSG);
    }

    public void lessonSocial() {
        clickClickableElement(SMART_EVALUATION_BUTTON, ERROR_MSG);
        scroll(SCROLL, ScrollDirection.DOWN, 0.9);
        clickClickableElement(SYLLABUS_BUTTON_THREE, ERROR_MSG);
        verifyTextControl(SUBJECT_NAME, ERROR_MSG, SUBJECTNAME);
        clickClickableElement(SYLLABUS_BUTTON_THREE, ERROR_MSG);
    }

    public void lessonTurkish() {
        clickClickableElement(SMART_EVALUATION_BUTTON, ERROR_MSG);
        waitUntilAllElementsAreVisible(SYLLABUS_BUTTON_FOUR);
        scrollClick();
        waitUntilAllElementsAreVisible(SYLLABUS_BUTTON_FOUR);
        clickClickableElement(SYLLABUS_BUTTON);
        verifyTextControl(SUBJECT_NAME, ERROR_MSG, SUBJECTNAME);
    }

    public void lessonEnglish() {
        clickClickableElement(SMART_EVALUATION_BUTTON, ERROR_MSG);
        waitUntilAllElementsAreVisible(SYLLABUS_BUTTON_FOUR);
        scrollClick();
        clickClickableElement(SYLLABUS_BUTTON_ENG);
        scrollClick();
        verifyTextControl(SUBJECT_NAME, ERROR_MSG, SUBJECTNAME);
    }

}
