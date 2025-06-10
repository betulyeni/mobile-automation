package tests;


import method.LessonMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class LessonTests extends BaseTest {
    LessonMethod lessonMethod;

   @Test(groups = {"lesson"})
    public void clickScience() {
     lessonMethod= new LessonMethod (driver);
     lessonMethod.clickLessonScience();

    }

   @Test(groups = {"lesson"})
    public void clickMatch() {
        lessonMethod= new LessonMethod (driver);
        lessonMethod.clickLessonMatch();

    }

   @Test(groups = {"lesson"})
    public void clickSociety() {
        lessonMethod= new LessonMethod (driver);
        lessonMethod.clickLessonSociety();

    }

   @Test(groups = {"lesson"})
    public void clickEnglish() {
        lessonMethod= new LessonMethod (driver);
        lessonMethod.clickLessonEnglish();

    }

   @Test(groups = {"lesson"})
    public void clickTurkish() {
        lessonMethod= new LessonMethod (driver);
        lessonMethod.clickLessonTurkish();


    }
}
