package tests;

import method.LoginMethod;
import method.ProfileMethod;
import method.menuTab.MenuTabMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class ProfileTests extends BaseTest {
    LoginMethod loginMethod;
    MenuTabMethod menuTabMethod;
    ProfileMethod profileMethod;


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
    public void profilePackageReviewer() throws Exception
    {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        profileMethod = new ProfileMethod(driver);
        profileMethod.profilePackageReviewer();


    }

    @Test(groups = {"profile"})
    public void profileVerify() throws Exception
    {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        profileMethod = new ProfileMethod(driver);
        profileMethod.profileUserDetailsVerify();

    }

    @Test(groups = {"profile"})
    public void profileGoals() throws Exception
    {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        profileMethod = new ProfileMethod(driver);
        profileMethod.profileGoals();

    }



}
