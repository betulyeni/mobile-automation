package tests.menuTab;

import method.HomePageMethod;
import method.LoginMethod;
import method.menuTab.DcpMethod;
import method.menuTab.MenuTabMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class DcpTests extends BaseTest {
    MenuTabMethod menuTabMethod;
    LoginMethod loginMethod;
    HomePageMethod homePageMethod;
    DcpMethod dcpMethod;


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

}
