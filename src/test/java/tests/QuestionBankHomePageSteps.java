package tests;

import method.LoginMethod;
import method.QuestionBankMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;
public class QuestionBankHomePageSteps extends BaseTest {
   QuestionBankMethod questionBankMethod;
    LoginMethod loginMethod;

  @Test(groups = {"questionBank"})
   public void clickQuestionBankButton() throws Exception {
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
   }

  @Test(groups = {"questionBank"})
   public void clickClassSelection() throws Exception  {
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.clickClassSelection();
   }

  @Test(groups = {"questionBank"})
   public void clickUnitSelection() throws Exception{
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.clickUnitSelection();
   }

  @Test(groups = {"questionBank"})
   public void clickTestTypeSelection() throws Exception{
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.clickTestTypeSelection();
   }

  @Test(groups = {"questionBank"})
   public void checkQuestionAndAnswersInQuestionBank ()throws Exception {
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.openFirstQuestionBank();
      questionBankMethod.checkQuestionPage();

   }


  @Test(groups = {"questionBank"})
   public void checkQuestionChangeInQuestionBank () throws Exception {
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.openFirstQuestionBank();
      questionBankMethod.checkQuestionChange();

   }

  @Test(groups = {"questionBank"})
   public void selectQuestionOnAnswerKeyInQuestionBank ()throws Exception {
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.openFirstQuestionBank();
      questionBankMethod.checkAnswerKey();
   }

  @Test(groups = {"questionBank"})
   public void finishTestInMoreOptions ()throws Exception {
      loginMethod = new LoginMethod(driver);
      loginMethod.login();
      questionBankMethod = new QuestionBankMethod(driver);
      questionBankMethod.clickQuestionBankButton();
      questionBankMethod.openFirstQuestionBank();
      questionBankMethod.finishTestInMoreOptions();
      questionBankMethod.checkIfDetailedAnalysisPage();
   }
}
