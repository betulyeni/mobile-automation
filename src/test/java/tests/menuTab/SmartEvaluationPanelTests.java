package tests.menuTab;

import method.HomePageMethod;
import method.LoginMethod;
import method.menuTab.MenuTabMethod;
import method.menuTab.SmartEvaluationPanelMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class SmartEvaluationPanelTests extends BaseTest {
    SmartEvaluationPanelMethod smartEvaluationPanelMethod;
    MenuTabMethod menuTabMethod;
    LoginMethod loginMethod;
    HomePageMethod homePageMethod;

    @Test(groups = {"smartEvaluationPanel"})
    public void clickSmartEvaluation() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        homePageMethod = new HomePageMethod(driver);
        homePageMethod.allowPopupControl();
        menuTabMethod.menuTabClick();
        smartEvaluationPanelMethod.clickSmartEvaluation();

    }

   @Test(groups = {"smartEvaluationPanel"})
    public void clickLessonMatch() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       smartEvaluationPanelMethod.lessonMatch();

    }

   @Test(groups = {"smartEvaluationPanel"})
    public void clickLessonScience() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       smartEvaluationPanelMethod.lessonScience();

    }

   @Test(groups = {"smartEvaluationPanel"})
    public void clickLessonSocial() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       smartEvaluationPanelMethod.lessonSocial();

    }

   @Test(groups = {"smartEvaluationPanel"})
    public void clickLessonTurkish() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       smartEvaluationPanelMethod.lessonTurkish();

    }

   @Test(groups = {"smartEvaluationPanel"})
    public void clickLessonEnglish() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       smartEvaluationPanelMethod.lessonEnglish();

    }



}
