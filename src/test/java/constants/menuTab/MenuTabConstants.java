package constants.menuTab;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class MenuTabConstants {
    public static By USER_ID = AppiumBy.xpath("//android.widget.TextView[@text='#37002']");
    public static By USER_LOGIN_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Doping Hafıza’ya Hoş geldin!\"]");
    public static By USER_DETAILS_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Kullanıcı Bilgileri\"]\n");
    public static By USER_DETAILS_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]");
    public static By STUDY_WORKING = AppiumBy.xpath("//android.widget.TextView[@text=\"Çalışma Programı Oluştur\"]");
    public static By STUDY_WORKING_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Çalışma Programı\"]");
    public static By STUDY_WORKING_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Geri Butonu\"]/com.horcrux.svg.SvgView");
    public static By CHANGE_CLASS = AppiumBy.xpath("//android.widget.TextView[@text=\"Sınıf Değiştir\"]");
    public static By CHANGE_CLASS_SELECTION = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"sınıf butonu 1\"]");
    public static By GUIDING_VIDEOS = AppiumBy.xpath("//android.widget.TextView[@text=\"Rehberlik Videoları\"]");
    public static By GUIDING_VIDEOS_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
    public static By STATISTICS = AppiumBy.xpath("//android.widget.TextView[@text=\"İstatistikler\"]");
    public static By STATISTICS_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView");
    public static By GOALS = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"geri bildirim butonu\"])[1]");
    public static By GOALS_GIVE_UP = AppiumBy.xpath("//android.widget.TextView[@text='Hedeflerim']");
    public static By GOALS_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Hedeflerim\"]");
    public static By SMART_EVALUATION_PANEL = AppiumBy.xpath("//android.widget.TextView[@text=\"Akıllı Değerlendirme Paneli\"]\n");
    public static By SMART_EVALUATION_PANEL_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
    public static By FEEDBACK = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"geri bildirim butonu\"])[2]");
    public static By FEEDBACK_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView");
    public static By FEEDBACK_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Görüş ve Öneri\"]\n");
    public static By ONE_TO_ONE_BUTTON = AppiumBy.accessibilityId("bire bir görüşmeler butonu");
    public static By SETTINGS = AppiumBy.accessibilityId("ayarlar butonu");
    public static By SETTINGS_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView");
    public static By SETTINGS_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Ayarlar\"]");
    public static By ROSETTE = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"rozet butonu\"]/android.view.View\n");
    public static By ROSETTE_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Betül Y.\"]");
    public static By ROSETTE_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
    public static By ONE_TO_ONE_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Anında Soru Çözümü\"]");


}
