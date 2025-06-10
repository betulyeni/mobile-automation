package method.menuTab;
import utilities.BasePage;
import io.appium.java_client.AppiumDriver;

import static constants.StringConstants.ERROR_MSG;
import static constants.menuTab.MenuTabConstants.STATISTICS;
import static constants.menuTab.StatisticConstants.*;


public class StatisticMethod extends BasePage {
    public StatisticMethod(AppiumDriver driver) {
        super(driver);
    }
    public StatisticMethod() {
        super(null);
    }
    public void checkSeeVideos() {
        clickClickableElement(STATISTICS, ERROR_MSG);
        findElement(STATISTIC);
        scrollClick();
        findElement(SEE_VIDEO_BUTTON);
        clickClickableElement(SEE_VIDEO_BUTTON,ERROR_MSG);
        findElement(SEE_VIDEO_BUTTON);
    }
    public void checkSolvingQuestion() {
        clickClickableElement(STATISTICS, ERROR_MSG);
        findElement(STATISTIC);
        scrollClick();
        findElement(QUESTION_SOLVING_BUTTON);
        clickClickableElement(QUESTION_SOLVING_BUTTON,ERROR_MSG);
        findElement(QUESTION_SOLVING_BUTTON);
    }

}
