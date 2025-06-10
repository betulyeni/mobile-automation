package method;


import utilities.BasePage;
import io.appium.java_client.AppiumDriver;
import constants.LoginConstants;
import static constants.LoginConstants.*;
import static constants.StringConstants.*;


public class LoginMethod extends BasePage {


    public LoginMethod(AppiumDriver driver) {
        super(driver);
    }
    public LoginMethod() {
        super(null);
    }

    public void login() throws Exception {
        boolean loginButtonControl = isElementDisplayed(LOGIN_BUTTON);
        if (loginButtonControl) {
            clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
            clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
            sendKeys(USERNAME, USERNAME_LOCATOR);
            clickClickableElement(PASSWORD_LOCATOR, ERROR_MSG);
            sendKeys(PASSWORD, PASSWORD_LOCATOR);
            toggleCheckbox(EULA_CHECKBOX_LOCATOR);
            clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
        } else {
            clickClickableElement(ADD_USER, ERROR_MSG);
            clickClickableElement(LOG_OUT_OK, ERROR_MSG);
            clickClickableElement(NEW_USER, ERROR_MSG);
            clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
            sendKeys(USERNAME, USERNAME_LOCATOR);
            clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
            sendKeys(PASSWORD, LoginConstants.PASSWORD_LOCATOR);
            toggleCheckbox(EULA_CHECKBOX_LOCATOR);
            clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);

        }
    }


    public void verifyLoginMethod() {
        waitUntilElementIsVisible(MENU_BUTTON);
        clickClickableElement(MENU_BUTTON, ERROR_MSG);
    }

    public void verifyUsernameAndPasswordError() {
        verifyPopupMessage(USER_ERROR_MSG, USERNAME_AND_PASSWORD_MSG);
    }

    public void verifyMinPasswordError() {
        verifyPopupMessage(MIN_PASSWORD_ERROR_MSG, MIN_PASSWORD_MSG);
    }

    public void verifyMinUsernameError() {
        verifyPopupMessage(MIN_USERNAME_ERROR_MSG, MIN_USERNAME_MSG);
    }

    public void logout() throws Exception {
        clickClickableElement(NEW_USER, ERROR_MSG);
        clickClickableElement(LOG_OUT_OK, ERROR_MSG);
        post();
    }

    public void incorrectPassword() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(INCORRECT_PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
    }

    public void incorrectUsername() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(INCORRECT_USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
    }

    public void emptyUsername() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(EMPTY_USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
    }

    public void emptyPassword() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(EMPTY_PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
    }

    public void emptyUsernameAndEmptyPassword() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(EMPTY_USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(EMPTY_PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);

    }

    public void unRegister() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(UN_REGISTER_USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(UN_REGISTER_PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
    }

    public void onlyNumberUsername() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(ONLY_NUMBER_USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
    }

    public void capitalLetters() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(CAPITAL_LETTER, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
    }

    public void invalidCharacters() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(INVALID_CHARACTER_USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);

    }

    public void minPassword() {
        clickClickableElement(LOGIN_BUTTON, ERROR_MSG);
        clickClickableElement(USERNAME_LOCATOR, ERROR_MSG);
        sendKeys(USERNAME, USERNAME_LOCATOR);
        clickClickableElement(LoginConstants.PASSWORD_LOCATOR, ERROR_MSG);
        sendKeys(MIN_PASSWORD, LoginConstants.PASSWORD_LOCATOR);
        toggleCheckbox(EULA_CHECKBOX_LOCATOR);
        clickClickableElement(LOGIN_BUTTON_LOCATOR, ERROR_MSG);
    }

    public void userChangeLogin() throws Exception {
        login();
        clickClickableElement(NEW_USER, ERROR_MSG);
        clickClickableElement(LOG_OUT_OK, ERROR_MSG);
        clickClickableElement(USERNAME_ADD, ERROR_MSG);

    }

    public void loginWithSameUser() throws Exception{
        login();
        clickClickableElement(NEW_USER, ERROR_MSG);
        clickClickableElement(LOG_OUT_OK, ERROR_MSG);
        clickClickableElement(SAME_USERNAME, ERROR_MSG);

    }

}
