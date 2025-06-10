package tests.menuTab;

import lombok.SneakyThrows;
import method.HomePageMethod;
import method.LoginMethod;
import method.menuTab.MenuTabMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class MenuTabTest extends BaseTest {
    MenuTabMethod menuTabMethod;
    LoginMethod loginMethod;
    HomePageMethod homePageMethod;



    @Test(groups = {"menu","smoke"})
    public void menuTabClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod.menuTabClick();

    }


    @Test(groups = {"menu"})
    public void studyWorkingClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod.menuTabClick();
        menuTabMethod.studyWorkingClick();
    }

    @Test(groups = {"menu"})
    public void gradeChangeControl()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();

    }


    @Test(groups = {"menu"})
    public void guidingVideosClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod.menuTabClick();
        menuTabMethod.guidingVideosClick();

    }


    @Test(groups = {"menu"})
    public void smartEvaluationPanelClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod.menuTabClick();
        menuTabMethod.smartEvaluationPanelClick();
    }


    @Test(groups = {"menu"})
    public void statisticsClick() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.statisticsClick();
    }


    @Test(groups = {"menu"})
    public void goalsClick() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.goalsClick();
    }


    @Test(groups = {"menu"})
    public void settingClick()throws Exception  {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.settingClick();
    }


    @Test(groups = {"menu"})
    public void feedbackClick() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.feedbackClick();
    }


    @Test(groups = {"menu"})
    public void oneToOneMeetClick() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.oneToOneMeetClick();
    }

    @SneakyThrows
    @Test(groups = {"menu"})
    public void rosetteClick() {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.rosetteClick();

    }


    @Test(groups = {"menu"})
    public void userChangeClick()throws Exception  {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       menuTabMethod.userChangeClick();
    }


    @Test(groups = {"menu"})
    public void userIdClick()throws Exception  {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       menuTabMethod = new MenuTabMethod(driver);
       menuTabMethod.menuTabClick();
       menuTabMethod.userIdClick();

    }
}
