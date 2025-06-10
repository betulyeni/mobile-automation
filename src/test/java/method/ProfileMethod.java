package method;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import utilities.BasePage;

import static constants.GoalsConstants.CREATE_GOALS;
import static constants.ProfileConstants.*;
import static constants.StringConstants.*;
import static constants.menuTab.MenuTabConstants.USER_ID;

@Slf4j
public class ProfileMethod extends BasePage {
    public ProfileMethod(AppiumDriver driver) {
        super(driver);
    }
    public ProfileMethod() {
        super(null);
    }

    public void profileVGBSTeachers()
    {
        clickClickableElement(USER_ID, ERROR_MSG);
        findElement(USER_DETAILS);
        scrollClick();
        findElement(VGBS_BUTTON);
        clickClickableElement(VGBS_BUTTON,ERROR_MSG);
        clickClickableElement(VGBS_TEACHER,ERROR_MSG);
        sendKeys("betul.yeni@dopingtech.net",VGBS_EMAIL);
        scrollClick();
        clickClickableElement(SEND_BUTTON,ERROR_MSG);


    }
    public void moreEditUserDetails(String name, String lastName){
        clickClickableElement(USER_ID, ERROR_MSG);
        clickClickableElement(MORE_BUTTON,ERROR_MSG);
        clickClickableElement(EDIT_USERNAME_BUTTON,ERROR_MSG);
        clickClickableElement(NAME_DETAILS,ERROR_MSG);
        clickClearElement(NAME_DETAILS);
        sendKeys(name,NAME_DETAILS);
        clickClearElement(LAST_NAME_DETAILS);
        sendKeys(lastName,LAST_NAME_DETAILS);
        clickClickableElement(SAVE_BUTTON,ERROR_MSG);

    }

    public void profileVGBSGuardian()
    {
        clickClickableElement(USER_ID, ERROR_MSG);
        findElement(USER_DETAILS);
        scrollClick();
        findElement(VGBS_BUTTON);
        clickClickableElement(VGBS_BUTTON,ERROR_MSG);
        clickClickableElement(VGBS_GUARDIAN,ERROR_MSG);
        sendKeys("betul.yeni@dopingtech.net",VGBS_EMAIL);
        scrollClick();
        clickClickableElement(SEND_BUTTON,ERROR_MSG);

    }

    public void profilePackageReviewer()
    {
        clickClickableElement(USER_ID, ERROR_MSG);
        findElement(USER_DETAILS);
        scrollClick();
        findElement(PACKAGE_REVIEWER_BUTTON);
        clickClickableElement(PACKAGE_REVIEWER_BUTTON,ERROR_MSG);

        boolean PopupButtonControl = isElementDisplayed(NEGATIVE_BUTTON);
        if (PopupButtonControl) {
            clickClickableElement(ACCOUNT_WITHOUT_BUTTON);
            clickClickableElement(NEGATIVE_BUTTON,ERROR_MSG);
            findElement(PACKAGE_TITLE_BUTTON);
            verifyTextControl(PACKAGE_TITLE_BUTTON,ERROR_MSG,WELCOME_TEXT_MSG);
            log.info("Verify is title");
        }

        findElement(PACKAGE_TITLE_BUTTON);
        verifyTextControl(PACKAGE_TITLE_BUTTON,ERROR_MSG,WELCOME_TEXT_MSG);
        log.info("Verify is title");


    }

    public void profileUserDetailsVerify(){
        clickClickableElement(USER_ID, ERROR_MSG);
        findElement(USER_DETAILS);
        findElement(PHONE_DETAILS);
        verifyTextControl(PHONE_DETAILS,ERROR_MSG,PHONE_MSG);
        log.info("Phone number is true");
        findElement(SCHOOL_DETAILS);
        verifyTextControl(SCHOOL_DETAILS,ERROR_MSG,SCHOOL_MSG);
        log.info("School name is true");
        findElement(CITY_DETAILS);
        verifyTextControl(CITY_DETAILS,ERROR_MSG,CITY_MSG);
        log.info("City is true");
        scrollClick();
        findElement(VGBS_BUTTON);
    }
    public void profileGoals(){
        clickClickableElement(USER_ID, ERROR_MSG);
        findElement(USER_DETAILS);
        clickClickableElement(GOALS_BUTTON,ERROR_MSG);
        clickClickableElement(CREATE_GOALS,ERROR_MSG);


    }

}
