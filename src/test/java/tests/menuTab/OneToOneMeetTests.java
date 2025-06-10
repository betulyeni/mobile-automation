package tests.menuTab;
import method.HomePageMethod;
import method.LoginMethod;
import method.menuTab.MenuTabMethod;
import method.menuTab.OneToOneMeetMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;
public class OneToOneMeetTests extends BaseTest {
    OneToOneMeetMethod oneToOneMeetMethod;
    MenuTabMethod menuTabMethod;
    LoginMethod loginMethod;
    HomePageMethod homePageMethod;

   @Test(groups = {"oneToOneMeet"})
    public void instantQuestionSolutionClick() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       oneToOneMeetMethod.instantQuestionSolutionClick();
    }

   @Test(groups = {"oneToOneMeet"})
    public void oneOnOnePrivateLessonsClick()throws Exception  {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       oneToOneMeetMethod.oneOnOnePrivateLessonsClick();
    }

   @Test(groups = {"oneToOneMeet"})
    public void oneOnOneGuidanceCoachingClick() throws Exception {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       oneToOneMeetMethod.oneOnOneGuidanceCoachingClick();
    }

   @Test(groups = {"oneToOneMeet"})
    public void myCouponsClick()throws Exception  {
       loginMethod = new LoginMethod(driver);
       loginMethod.login();
       homePageMethod = new HomePageMethod(driver);
       homePageMethod.allowPopupControl();
       menuTabMethod.menuTabClick();
       oneToOneMeetMethod.myCouponsClick();
    }

}
