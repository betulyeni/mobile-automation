package tests;

import method.GoalsMethod;
import method.HomePageMethod;
import method.LoginMethod;
import method.menuTab.ClassMethod;
import method.menuTab.MenuTabMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;



public class GoalsTests extends BaseTest {
    HomePageMethod homePageMethod;
    LoginMethod loginMethod;
    GoalsMethod goalsMethod;
    MenuTabMethod menuTabMethod;
    ClassMethod classMethod;


    @Test(groups = {"goals"})
    public void createGoals() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }

    @Test(groups = {"goals"})
    public void goalsSelectionClass4() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange4();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }
    @Test(groups = {"goals"})
    public void goalsSelectionClass5() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange5();
        menuTabMethod.goalsClick();
    }
    @Test(groups = {"goals"})
    public void goalsSelectionClass6() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange6();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }
    @Test(groups = {"goals"})
    public void goalsSelectionClass7() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange7();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }
    @Test(groups = {"goals"})
    public void goalsSelectionClass9() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange9();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }

    @Test(groups = {"goals"})
    public void goalsSelectionClass10() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange10();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }
    @Test(groups = {"goals"})
    public void goalsSelectionClass11() throws Exception {
        loginMethod = new LoginMethod(driver);
        loginMethod.login();
        menuTabMethod = new MenuTabMethod(driver);
        menuTabMethod.menuTabClick();
        menuTabMethod.gradeChangeControl();
        classMethod = new ClassMethod(driver);
        classMethod.classChange11();
        menuTabMethod.goalsClick();
        goalsMethod = new GoalsMethod(driver);
        goalsMethod.goalsCreate();
    }

}
