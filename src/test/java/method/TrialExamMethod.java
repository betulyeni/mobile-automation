package method;

import utilities.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static constants.StringConstants.ERROR_MSG;
import static constants.TrialExamConstants.*;
import static java.lang.Thread.sleep;

public class TrialExamMethod extends BasePage {
    public TrialExamMethod(AppiumDriver driver) {
        super(driver);
    }
    public TrialExamMethod() {
        super(null);
    }
    public void openTrialExam() {
        clickClickableElement(TRIAL_EXAM,ERROR_MSG);
        clickClickableElement(FIRST_TRIAL_EXAM,ERROR_MSG);
        if (!driver.findElements(START_EXAM_BUTTON).isEmpty()) {
            clickClickableElement(START_EXAM_BUTTON,ERROR_MSG);
        } else {
            scroll(RESET_AND_START_EXAM_BUTTON, ScrollDirection.DOWN, 0.3);
            if (!driver.findElements(RESET_AND_START_EXAM_BUTTON).isEmpty()) {
                clickClickableElement(RESET_AND_START_EXAM_BUTTON,ERROR_MSG);
            }
        }
    }


    public void checkQuestionChange() throws InterruptedException {
        int questionNumber = getQuestionNumber();
        Assert.assertEquals(questionNumber, 1);
        clickClickableElement(NEXT_QUESTION_BUTTON,ERROR_MSG);

        sleep(1000);
        questionNumber = getQuestionNumber();
        Assert.assertEquals(questionNumber, 2);
        clickClickableElement(PREVIOUS_QUESTION_BUTTON,ERROR_MSG);

        sleep(1000);
        questionNumber = getQuestionNumber();
        Assert.assertEquals(questionNumber, 1);

    }

    private int getQuestionNumber() {
        List<WebElement> trialExamText = findElements(HEADER_TEXT);
        String questionNumberText = trialExamText.get(trialExamText.size() - 1).getText();
        String[] parts = questionNumberText.split("/");
        return Integer.parseInt(parts[0]);
    }

    private int getTotalQuestionNumber() {
        List<WebElement> trialExamText = findElements(HEADER_TEXT);
        String questionNumberText = trialExamText.get(trialExamText.size() - 1).getText();
        String[] parts = questionNumberText.split("/");
        return Integer.parseInt(parts[1]);
    }

    public void checkAnswerKey() {
        clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
        clickClickableElement(ANSWER_KEY,ERROR_MSG);
        clickClickableElement(SECOND_QUESTION_ON_ANSWER_KEY,ERROR_MSG);

        Integer questionNumber = getQuestionNumber();
        Assert.assertEquals((int) questionNumber, 2);
    }

    public void proceedToLastQuestionAndEndTheExam() {
        clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
        clickClickableElement(ANSWER_KEY,ERROR_MSG);
        clickClickableElement(DROPDOWN_OF_SECTION_ON_ANSWER_KEY,ERROR_MSG);

        List<WebElement> sections = findElements(TRIAL_EXAM_SELECTION);
        String lastSectionDropdownLocatorStr = DROPDOWN_OF_SECTION_ON_ANSWER_KEY + "[" + Integer.toString(sections.size()) + "]";
        String lastSectionDropdownLocatorParts[] = lastSectionDropdownLocatorStr.split(": ");
        By lastSectionDropdownLocator = AppiumBy.xpath(lastSectionDropdownLocatorParts[1]);

        clickClickableElement(lastSectionDropdownLocator);
        clickClickableElement(FIRST_QUESTION_OF_SECTION_ANSWER_KEY,ERROR_MSG);

        int questionNumber = getQuestionNumber();
        int totalQuestionNumber = getTotalQuestionNumber();

        while (questionNumber < totalQuestionNumber) {
            clickClickableElement(NEXT_QUESTION_BUTTON,ERROR_MSG);
            questionNumber = getQuestionNumber();

        }
        findElement(END_EXAM_BUTTON);
        clickClickableElement(END_EXAM_BUTTON,ERROR_MSG);
        clickClickableElement(DIALOG_ACCEPT_BUTTON,ERROR_MSG);
        findElement(DETAILED_RESULT_ANALYSIS_TITLE);

    }

    public void endExamCheckTestAnalysis() {
        clickClickableElement(MORE_OPTIONS_MENU,ERROR_MSG);
        clickClickableElement(END_EXAM_BUTTON,ERROR_MSG);
        clickClickableElement(DIALOG_ACCEPT_BUTTON,ERROR_MSG);
        findElement(DETAILED_RESULT_ANALYSIS_TITLE);
        findElement(AVERAGE_SUCCESS_RATE);
        findElement(REVIEW_ANSWERS_TITLE);
    }
}