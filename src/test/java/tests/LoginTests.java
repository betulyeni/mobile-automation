
package tests;


import method.LoginMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class LoginTests extends BaseTest {
    LoginMethod loginMethod;

   @Test(groups = {"login"})
    public void firstPageLogin() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
    }

   @Test(groups = {"login"})
    public void verifyLogin() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        loginMethod.verifyLoginMethod();
        loginMethod.logout();

    }

   @Test(groups = {"login"})
    public void verifyUsernameAndPasswordError() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.verifyUsernameAndPasswordError();
    }

   @Test(groups = {"login"})
    public void verifyMinPasswordError() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.verifyMinPasswordError();
    }

   @Test(groups = {"login"})
    public void verifyMinUsernameError() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.verifyMinUsernameError();
    }

   @Test(groups = {"login"})
    public void incorrectPassword() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.incorrectPassword();

    }

   @Test(groups = {"login"})
    public void emptyPasswordMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.emptyPassword();
    }


   @Test(groups = {"login"})
    public void minPasswordMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.minPassword();
    }

   @Test(groups = {"login"})
    public void invalidUserNameMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.incorrectUsername();
    }

   @Test(groups = {"login"})
    public void invalidCharactersMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.invalidCharacters();
    }

   @Test(groups = {"login"})
    public void emptyUsernameMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.emptyUsername();
    }

   @Test(groups = {"login"})
    public void capitalLettersMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.capitalLetters();
    }

   @Test(groups = {"login"})
    public void onlyNumberUsernameMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.onlyNumberUsername();
    }

   @Test(groups = {"login"})
    public void unRegisterMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.unRegister();
    }

   @Test(groups = {"login"})
    public void emptyUsernameAndPasswordMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.emptyUsernameAndEmptyPassword();

    }


   @Test(groups = {"login"})
    public void userChangeLogin() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.userChangeLogin();
    }

   @Test(groups = {"login"})
    public void loginWithSameUser() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.loginWithSameUser();
    }

}

