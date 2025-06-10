package tests;
import method.TrialExamMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class TrialExamSteps extends BaseTest {

    TrialExamMethod trialExamMethod;
   @Test(groups = {"trialExam"})
    public void checkExamQuestionPageAnswerAndQuestionChange () throws InterruptedException {
        trialExamMethod= new TrialExamMethod(driver);
        trialExamMethod.openTrialExam();
        trialExamMethod.checkQuestionChange();
    }

   @Test(groups = {"trialExam"})
    public void selectQuestionOnAnswerKey () {
        trialExamMethod= new TrialExamMethod(driver);
        trialExamMethod.openTrialExam();
        trialExamMethod.checkAnswerKey();
    }

   @Test(groups = {"trialExam"})
    public void  finishAllQuestionsAndEndTheExam() {
        trialExamMethod= new TrialExamMethod(driver);
        trialExamMethod.openTrialExam();
        trialExamMethod.proceedToLastQuestionAndEndTheExam();
    }

   @Test(groups = {"trialExam"})
    public void checkTestAnalysis () {
        trialExamMethod= new TrialExamMethod(driver);
        trialExamMethod.openTrialExam();
        trialExamMethod.endExamCheckTestAnalysis();
    }

}
