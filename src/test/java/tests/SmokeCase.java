package tests;

import method.HomePageMethod;
import method.LessonMethod;
import method.LoginMethod;
import method.ProfileMethod;
import method.menuTab.ClassMethod;
import method.menuTab.DcpMethod;
import method.menuTab.MenuTabMethod;
import method.menuTab.OneToOneMeetMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class SmokeCase extends BaseTest {

    MenuTabMethod menuTabMethod;
    LoginMethod loginMethod;
    HomePageMethod homePageMethod;
    OneToOneMeetMethod oneToOneMeetMethod;
    LessonMethod lessonMethod;
    ProfileMethod profileMethod;
    ClassMethod classMethod;
    DcpMethod dcpMethod;

    // **************  Start - Login Case **************** //

    @Test(groups = {"login"})
    public void firstPageLogin() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
    }

    @Test(groups = {"login"})
    public void verifyLogin() throws Exception {
        loginMethod = new LoginMethod(driver);
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
    public void minPasswordMethod() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.minPassword();
    }
    // **************  End - Login Case **************** //

    // **************   Start - Menu Tab Case **************** //

    @Test(groups = {"menu","smoke"})
    public void menuTabClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        homePageMethod.notificationControl();
    }

    @Test(groups = {"menu"})
    public void todayLessonControl() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        homePageMethod.dailyLessonControl();

    }
    @Test(groups = {"menu"})
    public void todayTaskControl() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        homePageMethod.dailyTaskControl();

    }

    @Test(groups = {"menu"})
    public void noticeControl() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        homePageMethod.noticeControl();
    }

    @Test(groups = {"menu"})
    public void lastActivityControl() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        homePageMethod.lastActivityControl();
    }

    @Test(groups = {"menu"})
    public void lessonControl() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        homePageMethod.lessonControl();
    }

    @Test(groups = {"profile"})
    public void profileVGBSTeacher() throws Exception
    {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        profileMethod = new ProfileMethod(driver);
        profileMethod.profileVGBSTeachers();

    }

    @Test(groups = {"profile"})
    public void profileVGBSGuardian() throws Exception
    {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        profileMethod = new ProfileMethod(driver);
        profileMethod.profileVGBSGuardian();

    }

    @Test(groups = {"profile"})
    public void profileEditUsername() throws Exception
    {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        profileMethod = new ProfileMethod(driver);
        profileMethod.moreEditUserDetails("Test","Deneme");
    }

    @Test(groups = {"menu"})
    public void studyWorkingClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.studyWorkingClick();
    }

    @Test(groups = {"menu"})
    public void gradeChangeControl() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange11();
    }

    @Test(groups = {"menu"})
    public void guidingVideosClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.guidingVideosClick();
    }

    @Test(groups = {"menu"})
    public void careerTabClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
    }

    @Test(groups = {"menu"})
    public void surveyTabClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();

    }

    @Test(groups = {"menu"})
    public void meetTabClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        oneToOneMeetMethod = new OneToOneMeetMethod(driver);

    }



    @Test(groups = {"menu"})
    public void lesson() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        lessonMethod= new LessonMethod(driver);
        lessonMethod.clickLessonStart();
        Thread.sleep(5000);

    }

    @Test(groups = {"oneToOneMeet"})
    public void instantQuestionSolutionClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        oneToOneMeetMethod = new OneToOneMeetMethod(driver);
        oneToOneMeetMethod.instantQuestionSolutionClick();
    }

    @Test(groups = {"oneToOneMeet"})
    public void oneOnOnePrivateLessonsClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        oneToOneMeetMethod = new OneToOneMeetMethod(driver);
        oneToOneMeetMethod.oneOnOnePrivateLessonsClick();
    }

    @Test(groups = {"oneToOneMeet"})
    public void oneOnOneGuidanceCoachingClick() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        oneToOneMeetMethod = new OneToOneMeetMethod(driver);
        oneToOneMeetMethod.oneOnOneGuidanceCoachingClick();
    }

    @Test(groups = {"oneToOneMeet"})
    public void myCouponsClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        oneToOneMeetMethod = new OneToOneMeetMethod(driver);
        oneToOneMeetMethod.myCouponsClick();
    }
    @Test(groups = {"menu","smoke"})
    public void dcpZeroCreateClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        dcpMethod = new DcpMethod(driver);
        dcpMethod.dcpZeroCreateClick();
    }
    @Test(groups = {"menu","smoke"})
    public void dcpEditClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        dcpMethod = new DcpMethod(driver);
        dcpMethod.editDcpClick();
    }
    @Test(groups = {"menu","smoke"})
    public void dcpStopClick()throws Exception  {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        dcpMethod = new DcpMethod(driver);
        dcpMethod.stopDcpClick();
    }

    // **************   End - Menu Tab Case **************** //
}
