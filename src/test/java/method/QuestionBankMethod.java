package method;

import utilities.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static constants.QuestionBankConstants.*;
import static constants.StringConstants.*;
import static java.lang.Thread.sleep;

public class QuestionBankMethod extends BasePage {

    public QuestionBankMethod(AppiumDriver driver) {
        super(driver);
    }
    public QuestionBankMethod() {
        super(null);
    }
    public void clickQuestionBankButton() {
        clickClickableElement(QUESTION_BANK_BUTTON,ERROR_MSG);
        verifyTextControl(QUESTION_BANK_TEXT,ERROR_MSG,QUESTION_BANK_MSG);
    }
    public void clickClassSelection() {
        clickClickableElement(CLASS_SELECTION,ERROR_MSG);

    }
    public void clickUnitSelection() {
        clickClickableElement(UNIT_SELECTION,ERROR_MSG);

    }
    public void clickTestTypeSelection() {
        clickClickableElement(TEST_TYPE,ERROR_MSG);

    }
    public void clickTestStart() {
        clickClickableElement(TEST_START, ERROR_MSG);
        clickClickableElement(NEXT_QUESTION_BUTTON, ERROR_MSG);
        clickClickableElement(BACK_BUTTON, ERROR_MSG);
        clickClickableElement(NEXT_QUESTION_BUTTON, ERROR_MSG);
    }

    public void checkIfQuestionBankPage () {
        findElement(QUESTION_BANK_PAGE);
    }

    public void selectPhilosophyLesson () {
        clickClickableElement(CURRICULUM_BUTTON,ERROR_MSG);
        clickClickableElement(PHILOSOPHY_LESSON_BUTTON,ERROR_MSG);
    }

    public void selectEpistemologyUnit () {
        clickClickableElement(SELECT_UNIT_BUTTON,ERROR_MSG);
        clickClickableElement(EPISTEMOLGY_UNIT_BUTTON,ERROR_MSG);
    }

    public void checkUnitInQuestionBankList () {
        Assert.assertTrue(findElements(QUESTION_BANK_EPISTEMOLGY_TEXT).size() > 1);
    }

    public void openFirstQuestionBank () {
        clickClickableElement(TEST_A,ERROR_MSG);
        if (!driver.findElements(START_TEST_BUTTON).isEmpty()) {
            clickClickableElement(START_TEST_BUTTON,ERROR_MSG);
        } else if (!driver.findElements(CONTINUE_TEST_BUTTON).isEmpty()) {
            clickClickableElement(CONTINUE_TEST_BUTTON,ERROR_MSG);
        } else if (!driver.findElements(RESET_AND_START_BUTTON).isEmpty()) {
            clickClickableElement(RESET_AND_START_BUTTON,ERROR_MSG);
        }
    }

    public void checkQuestionPage () {
        findElement(QUESTION_BANK_SOLVE_PAGE);
        findElement(QUESTION_TEXT);
        findElement(CHOICE_BUTTON);
    }

    public void openSmartTest ()  {
        if (driver.findElements(ALL_TEST_TEXT).isEmpty()) {
            scroll(ALL_TEST_TEXT, ScrollDirection.DOWN, 0.4);
        }
        clickClickableElement(ALL_TEST_TEXT,ERROR_MSG);

        if (!driver.findElements(CONTINUE_TEST_BUTTON).isEmpty()) {
            clickClickableElement(CONTINUE_TEST_BUTTON,ERROR_MSG);
            clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
            clickClickableElement(FINISH_TEST,ERROR_MSG);
            clickClickableElement(DIALOG_APPROVE_BUTTON,ERROR_MSG);
            clickClickableElement(BACK_BUTTON,ERROR_MSG);

            if (driver.findElements(ALL_TEST_TEXT).isEmpty()) {
                scroll(ALL_TEST_TEXT, ScrollDirection.DOWN, 0.4);
            }
            clickClickableElement(ALL_TEST_TEXT,ERROR_MSG);
            clickClickableElement(RESET_AND_START_BUTTON,ERROR_MSG);

        } else if (!driver.findElements(RESET_AND_START_BUTTON).isEmpty()) {
            clickClickableElement(RESET_AND_START_BUTTON,ERROR_MSG);
        } else if (!driver.findElements(START_TEST_BUTTON).isEmpty()) {
            clickClickableElement(START_TEST_BUTTON,ERROR_MSG);
        }

        findElement(ALL_TEST_TITLE);
    }

    public void checkSolutionVideo () throws InterruptedException {
        clickClickableElement(FIRST_ANSWER_BUTTON,ERROR_MSG);
        clickClickableElement(SOLUTION_VIDEO_BUTTON,ERROR_MSG);
        findElement(VIDEO);
        playVideoAndCheckTime();
    }

    public void stopVideo () {
        clickClickableElement(PLAY_PAUSE_VIDEO_BUTTON,ERROR_MSG);
    }

    public void playVideoAndCheckTime () throws InterruptedException {
        float videoStartPointProgressBarValue = Float.parseFloat(findElement(VIDEO_PROGRESS_BAR).getText());
        clickClickableElement(PLAY_PAUSE_VIDEO_BUTTON,ERROR_MSG);
        sleep(2000);
        stopVideo();
        String videoTimeText = findElements(VIDEO_TIME).get(0).getText();
        int videoSecond = Integer.parseInt(videoTimeText.substring(videoTimeText.length() - 2));
        float videoStopPointProgressBarValue = Float.parseFloat(findElement(VIDEO_PROGRESS_BAR).getText());
        Assert.assertTrue(videoSecond > 0);
        Assert.assertTrue(videoStopPointProgressBarValue > videoStartPointProgressBarValue);

    }

    public void closeCheckSolutionVideo () {
        clickClickableElement(BACK_BUTTON,ERROR_MSG);
    }

    public void openSimilarQuestion () {
        clickClickableElement(SIMILAR_QUESTION_BUTTON,ERROR_MSG);
    }

    public void checkSimilarQuestion () {
        findElement(SIMILAR_QUESTION);
    }

    private int getQuestionNumber() {
        List<WebElement> trialExamText = findElements(HEADER_TEXT);
        String questionNumberText = trialExamText.get(trialExamText.size()-1).getText();
        String[] parts = questionNumberText.split("/");
        return Integer.parseInt(parts[0]);
    }

    private int getTotalQuestionNumber() {
        List<WebElement> trialExamText = findElements(HEADER_TEXT);
        String questionNumberText = trialExamText.get(trialExamText.size()-1).getText();
        String[] parts = questionNumberText.split("/");
        return Integer.parseInt(parts[1]);
    }

    public void checkQuestionChange () throws InterruptedException {
        int questionNumber = getQuestionNumber();
        clickClickableElement(NEXT_QUESTION_BUTTON,ERROR_MSG);

        sleep(1000);
        int nextQuestionNumber = getQuestionNumber();
        Assert.assertTrue(questionNumber < nextQuestionNumber);
        clickClickableElement(PREVIOUS_QUESTION_BUTTON,ERROR_MSG);

        sleep(1000);
        int previousQuestionNumber = getQuestionNumber();
        Assert.assertEquals(questionNumber, previousQuestionNumber);

    }

    public void checkAnswerKey () {
        clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
        clickClickableElement(ANSWER_KEY,ERROR_MSG);
        clickClickableElement(TEST_B,ERROR_MSG);
        Integer questionNumber = getQuestionNumber();
        Assert.assertEquals((int) questionNumber, 2);
    }

    public void selectFirstAnswerofFirstQuestion () {
        clickClickableElement(FIRST_ANSWER_BUTTON);
    }

    public void proceedToLastQuestionAndEndTheQuestionBank () {
        TOTAL_QUESTION_NUMBER = getTotalQuestionNumber();
        clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
        clickClickableElement(ANSWER_KEY,ERROR_MSG);
        scroll(LAST_QUESTION_IN_ANSWER_KEY, ScrollDirection.DOWN, 0.10);
        clickClickableElement(LAST_QUESTION_IN_ANSWER_KEY,ERROR_MSG);
        int questionNumber = getQuestionNumber();
        while (questionNumber < TOTAL_QUESTION_NUMBER) {
            clickClickableElement(NEXT_QUESTION_BUTTON);
            questionNumber = getQuestionNumber();
        }
        clickClickableElement(FINISH_TEST,ERROR_MSG);
        clickClickableElement(DIALOG_APPROVE_BUTTON,ERROR_MSG);
    }

    public void checkIfDetailedAnalysisPage () {
        findElement(DETAILS_ANALYSIS_PAGE);
    }

    public void finishTestInMoreOptions () {
        clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
        clickClickableElement(FINISH_TEST,ERROR_MSG);
        clickClickableElement(DIALOG_APPROVE_BUTTON,ERROR_MSG);
    }
}
