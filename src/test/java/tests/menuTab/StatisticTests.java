package tests.menuTab;


import method.HomePageMethod;
import method.LoginMethod;
import method.menuTab.MenuTabMethod;
import method.menuTab.StatisticMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class StatisticTests extends BaseTest {

    StatisticMethod statisticMethod;
    MenuTabMethod menuTabMethod;
    LoginMethod loginMethod;
    HomePageMethod homePageMethod;

   @Test(groups = {"statistic"})
    public void checkVideosControl() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       statisticMethod.checkSeeVideos();

    }

   @Test(groups = {"statistic"})
    public void checkQuestionSolvingControl() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       statisticMethod.checkSolvingQuestion();

    }
}
