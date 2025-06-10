package constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class TrialExamConstants {
    public static  By TRIAL_EXAM = AppiumBy.xpath("//android.widget.TextView[@text=\"Denemeler\"]");
    public static  By FIRST_TRIAL_EXAM = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"deneme sınavı buton 0\"]");
    public static By START_EXAM_BUTTON = AppiumBy.accessibilityId("sınavı başlat butonu");
    public static By RESET_AND_START_EXAM_BUTTON = AppiumBy.accessibilityId("sıfırla ve başlat butonu");
    public static By QUESTION = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Deneme Sınavı Çözme Sayfası\"]/android.view.ViewGroup[1]");
    public static By ANSWER_CHOICE = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup");
    public static By FIRST_ANSWER_CHOICE = AppiumBy.accessibilityId("soru şıkkı 0");
    public static By SECOND_ANSWER_CHOICE = AppiumBy.accessibilityId("soru şıkkı 1");
    public static By NEXT_QUESTION_BUTTON = AppiumBy.accessibilityId("sonraki butonu");
    public static By PREVIOUS_QUESTION_BUTTON = AppiumBy.accessibilityId("önceki butonu");
    public static By HEADER_TEXT = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Deneme Sınavı Çözme Sayfası\"]/android.view.ViewGroup[1]/android.widget.TextView");
    public static By MORE_OPTIONS_MENU = AppiumBy.accessibilityId("daha fazla butonu");
    public static By ANSWER_KEY = AppiumBy.accessibilityId("cevap anahtarı butonu");
    public static By TRIAL_EXAM_SELECTION = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup");
    public static By END_EXAM_BUTTON = AppiumBy.accessibilityId("sınavı bitir butonu");
    public static By DIALOG_ACCEPT_BUTTON = AppiumBy.accessibilityId("diyalog kabul et butonu");
    public static By DETAILED_RESULT_ANALYSIS_TITLE = AppiumBy.xpath("//android.widget.TextView[@text=\"Detaylı Sonuç Analizi\"]");
    public static By AVERAGE_SUCCESS_RATE = AppiumBy.xpath("//android.widget.TextView[@text=\"Ortalama Başarı Oranı: \"]");
    public static By REVIEW_ANSWERS_TITLE = AppiumBy.xpath("//android.widget.TextView[@text=\"Cevapları İncele\"]");
    public static By SECOND_QUESTION_ON_ANSWER_KEY = AppiumBy.accessibilityId("Cevap Satırı Seç 1");
    public static By DROPDOWN_OF_SECTION_ON_ANSWER_KEY = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Aşağı Doğru Aç Butonu\"])");
    public static By FIRST_QUESTION_OF_SECTION_ANSWER_KEY = AppiumBy.accessibilityId("Cevap Satırı Seç 0");

}
