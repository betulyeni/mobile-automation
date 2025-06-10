package tests;


import method.HomePageMethod;
import method.LoginMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class HomePageTests extends BaseTest {
    HomePageMethod homePageMethod;
    LoginMethod loginMethod;

   @Test(groups = {"homePage"})
    public void checkHomePageTitles() throws Exception{
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod.allowPopupControl();
        homePageMethod.notificationControl();
        homePageMethod.searchControl();
        homePageMethod.lessonControl();
        homePageMethod.dailyTask();

    }

   @Test(groups = {"homePage"})
    public void checkCreateProgramModal() throws Exception{
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod.allowPopupControl();
        homePageMethod.checkProgrammingSelection();
    }

   @Test(groups = {"homePage"})
    public void allowPopupControl() throws Exception{
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod.allowPopupControl();

    }

   @Test(groups = {"homePage"})
    public void noticeAllSeeButtonControl()throws Exception {
        homePageMethod = new HomePageMethod(driver);
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
        homePageMethod.noticeAllSeeButtonControl();

    }

   @Test(groups = {"homePage"})
    public void lastActivityControl() throws Exception{
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod.allowPopupControl();
       homePageMethod.lastActivityControl();
    }
}
