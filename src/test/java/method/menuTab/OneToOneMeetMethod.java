package method.menuTab;
import utilities.BasePage;

import io.appium.java_client.AppiumDriver;
import static constants.StringConstants.*;
import static constants.menuTab.MenuTabConstants.ONE_TO_ONE_BUTTON;
import static constants.menuTab.OneToOneMeetConstants.*;

public class OneToOneMeetMethod extends BasePage {
    public OneToOneMeetMethod(AppiumDriver driver) {
        super(driver);
    }
    public OneToOneMeetMethod() {
        super(null);
    }

    public void instantQuestionSolutionClick() {
        clickClickableElement(ONE_TO_ONE_BUTTON, ERROR_MSG);
        clickClickableElement(INSTANT_QUESTION_SOLUTION, ERROR_MSG);
        verifyTextControl(SOLVENT, ERROR_MSG, SOLVENT_TEXT);

    }

    public void oneOnOnePrivateLessonsClick() {
        clickClickableElement(ONE_TO_ONE_BUTTON, ERROR_MSG);
        clickClickableElement(PRIVATE_LESSON, ERROR_MSG);
        verifyTextControl(NOW_UNDERSTAND, ERROR_MSG, NOW_UNDERSTAND_TEXT);
    }

    public void oneOnOneGuidanceCoachingClick() {
        clickClickableElement(ONE_TO_ONE_BUTTON, ERROR_MSG);
        clickClickableElement(GUIDANCE_COACHING, ERROR_MSG);
        verifyTextControl(WITH_ME_COACHING, ERROR_MSG, WITH_ME_COACHING_TEXT);
    }

    public void myCouponsClick() {
        clickClickableElement(ONE_TO_ONE_BUTTON, ERROR_MSG);
        clickClickableElement(MY_COUPONS, ERROR_MSG);
        verifyTextControl(COUPONS, ERROR_MSG, COUPON_TEXT);
        clickClickableElement(COUPONS_ACTIVITY, ERROR_MSG);
        verifyTextControl(COUPONS, ERROR_MSG, COUPON_DETAILS_TEXT);
        clickClickableElement(COUPONS_DE_ACTIVITY, ERROR_MSG);
        verifyTextControl(COUPONS, ERROR_MSG, COUPON_DETAILS_TEXT);
        clickClickableElement(COUPONS_ALL, ERROR_MSG);
        verifyTextControl(COUPONS, ERROR_MSG, COUPON_DETAILS_TEXT);

    }
}
