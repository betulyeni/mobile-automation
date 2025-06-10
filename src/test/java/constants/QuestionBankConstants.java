package constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class QuestionBankConstants {
    public static By QUESTION_BANK_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Soru Bankası Navigasyon Butonu']");
    public static By QUESTION_BANK_TEXT = AppiumBy.xpath("(//android.widget.TextView[@text=\"Soru Bankası\"])[1]");
    public static By CLASS_SELECTION = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Müfredatı Aç butonu\"]");
    public static By UNIT_SELECTION = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Unite Göster butonu\"]");
    public static By TEST_TYPE = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test tipi göster butonu\"]");
    public static By QUESTION_BANK_PAGE = AppiumBy.accessibilityId("Soru Bankası Sayfası");
    public static By CURRICULUM_BUTTON = AppiumBy.accessibilityId("Müfredatı Aç butonu");
    public static By SELECT_UNIT_BUTTON = AppiumBy.accessibilityId("Unite Göster butonu");
    public static By PHILOSOPHY_LESSON_BUTTON = AppiumBy.accessibilityId("Felsefe Seçim Butonu");
    public static By EPISTEMOLGY_UNIT_BUTTON = AppiumBy.accessibilityId("Bilgi Felsefesi Seçim Butonu");
    public static By QUESTION_BANK_EPISTEMOLGY_TEXT = AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Bilgi Felsefesi')]");
    public static By TEST_A = AppiumBy.accessibilityId("Kart Listesi butonu 0");
    public static By START_TEST_BUTTON = AppiumBy.accessibilityId("Testi Başlat butonu");
    public static By CONTINUE_TEST_BUTTON = AppiumBy.accessibilityId("Teste Devam et butonu");
    public static By QUESTION_BANK_SOLVE_PAGE = AppiumBy.accessibilityId("Soru Bankası Çözme Sayfası");
    public static By CHOICE_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc, 'Seçim Butonu')]");
    public static By QUESTION_TEXT = AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Soru')]");
    public static By FIRST_ANSWER_BUTTON = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
    public static By ALL_TEST_TEXT = AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Tüm Testler')]");
    public static By RESET_AND_START_BUTTON = AppiumBy.accessibilityId("Sıfırla ve Başlat butonu");
    public static By ALL_TEST_TITLE = AppiumBy.xpath("//android.widget.TextView[@text=\"Tüm Testler\"]");
    public static By SOLUTION_VIDEO_BUTTON = AppiumBy.accessibilityId("Çözüm Videosu butonu");
    public static By VIDEO = AppiumBy.accessibilityId("Kontrolleri Gizleme Butonu");
    public static By PLAY_PAUSE_VIDEO_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Kontrolleri Gizleme Butonu\"]/android.view.ViewGroup[3]/android.view.ViewGroup[2]");
    public static By VIDEO_PROGRESS_BAR = AppiumBy.className("android.widget.SeekBar");
    public static By VIDEO_TIME = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Kontrolleri Gizleme Butonu\"]/android.view.ViewGroup[4]/android.view.ViewGroup[1]/*");
    public static By BACK_BUTTON = AppiumBy.accessibilityId("Geri butonu");
    public static By SIMILAR_QUESTION_BUTTON = AppiumBy.accessibilityId("Benzer Soru butonu");
    public static By HEADER_TEXT = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Soru Bankası Çözme Sayfası\"]/android.view.ViewGroup[1]/android.widget.TextView");
    public static By NEXT_QUESTION_BUTTON = AppiumBy.accessibilityId("Sonraki Soru butonu");
    public static By PREVIOUS_QUESTION_BUTTON = AppiumBy.accessibilityId("Önceki Soru butonu");
    public static By MORE_OPTIONS_MENU = AppiumBy.accessibilityId("Daha Fazla butonu");
    public static By ANSWER_KEY = AppiumBy.accessibilityId("Cevap Anahtarı butonu");
    public static By FINISH_TEST = AppiumBy.accessibilityId("Testi Bitir butonu");
    public static By SIMILAR_QUESTION = AppiumBy.accessibilityId("Bottom Sheet");
    public static By DIALOG_APPROVE_BUTTON = AppiumBy.accessibilityId("diyalog kabul et butonu");
    public static By DETAILS_ANALYSIS_PAGE = AppiumBy.accessibilityId("Detaylı Analiz Sayfası");
    public static By TEST_START= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Dersler Navigasyon Butonu\"]");
    public static By TEST_B= AppiumBy.accessibilityId("Cevap Satırı Seç 1");

    public static int TOTAL_QUESTION_NUMBER;
    public static String LAST_QUESTION_IN_ANSWER_KEY_STR = "//android.view.ViewGroup[@content-desc='Cevap Satırı Seç " + Integer.toString(TOTAL_QUESTION_NUMBER -2) + "']";
    public static By LAST_QUESTION_IN_ANSWER_KEY = AppiumBy.xpath(LAST_QUESTION_IN_ANSWER_KEY_STR);

}
