package constants.menuTab;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;


public class SmartEvaluationPanelConstants {
    public static By SMART_EVALUATION_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text='Akıllı Değerlendirme Paneli']");
    public static By SYLLABUS_BUTTON_ONE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Müfredat Seçme Butonu\"])[1]/android.view.ViewGroup");
    public static By SYLLABUS_BUTTON_TWO = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Müfredat Seçme Butonu\"])[2]/android.view.ViewGroup");
    public static By SYLLABUS_BUTTON_THREE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Müfredat Seçme Butonu\"])[3]/android.view.ViewGroup");
    public static By SYLLABUS_BUTTON_FOUR = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Müfredat Seçme Butonu\"])[4]/android.view.ViewGroup");
    public static By SYLLABUS_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Ortalama Başarı Oranı: %16.89\"]");
    public static By SYLLABUS_BUTTON_ENG = AppiumBy.xpath("//android.widget.TextView[@text=\"6. Sınıf İngilizce\"]");
    public static By SYLLABUS_BUTTON_FIVE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Müfredat Seçme Butonu\"])[5]/android.view.ViewGroup");
    public static By SUBJECT_NAME= AppiumBy.xpath("//android.widget.TextView[@text=\"Ünite Adı\"]");
    public static By SCROLL= AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]");
    public static By SMART_EVALUATION_GIVE_UP= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView");

    }






