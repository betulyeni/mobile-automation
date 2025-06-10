package method;

import utilities.BasePage;
import io.appium.java_client.AppiumDriver;

import static constants.LessonConstants.*;
import static constants.StringConstants.ERROR_MSG;

public class LessonMethod extends BasePage {
    public LessonMethod(AppiumDriver driver) {
        super();
    }
    public LessonMethod() {
        super(null);
    }

    public void clickLessonScience() {
        clickClickableElement(LESSON_BUTTON,ERROR_MSG);
        clickClickableElement(NUMERIC,ERROR_MSG);
        clickClickableElement(ALL_LESSON,ERROR_MSG);
        clickClickableElement(LESSON_SCIENCE,ERROR_MSG);
    }
    public void clickLessonMatch() {
        clickClickableElement(LESSON_BUTTON,ERROR_MSG);
        clickClickableElement(NUMERIC,ERROR_MSG);
        clickClickableElement(ALL_LESSON,ERROR_MSG);
        clickClickableElement(LESSON_MATCH,ERROR_MSG);
    }
    public void clickLessonSociety() {
        clickClickableElement(LESSON_BUTTON,ERROR_MSG);
        clickClickableElement(VERBAL,ERROR_MSG);
        clickClickableElement(ALL_LESSON,ERROR_MSG);
        clickClickableElement(LESSON_SOCIETY,ERROR_MSG);
    }

    public void clickLessonTurkish() {
        clickClickableElement(LESSON_BUTTON,ERROR_MSG);
        clickClickableElement(VERBAL,ERROR_MSG);
        clickClickableElement(ALL_LESSON,ERROR_MSG);
        clickClickableElement(LESSON_TURKISH,ERROR_MSG);
    }

    public void clickLessonEnglish() {
        clickClickableElement(LESSON_BUTTON,ERROR_MSG);
        clickClickableElement(VERBAL,ERROR_MSG);
        clickClickableElement(ALL_LESSON,ERROR_MSG);
        clickClickableElement(LESSON_ENGLISH,ERROR_MSG);
    }

    public void clickLessonStart() {
        clickClickableElement(LESSON_BUTTON,ERROR_MSG);
        clickClickableElement(LESSON_SCIENCE,ERROR_MSG);
        clickClickableElement(LESSON_START_BUTTON,ERROR_MSG);

    }

}
