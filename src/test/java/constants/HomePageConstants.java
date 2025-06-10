package constants;


import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePageConstants {

    public static By VERBAL = AppiumBy.xpath("//android.widget.TextView[@text=\"Sözel\"]\n");
    public static By NUMERICAL = AppiumBy.xpath("//android.widget.TextView[@text=\"Sayısal\"]\n");
    public static By DAY_TASK_TEXT = AppiumBy.xpath("//android.widget.TextView[@text='Çalışma Programı']");
    public static By DAY_LESSON_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
    public static By HOME_PAGE_MENU = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Ana Sayfa Navigasyon Butonu']/com.horcrux.svg.SvgView");
    public static By LESSON_PLANNING_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Geri Butonu\"]\n");
    public static By NOTICE_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geri butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView\n");
    public static By NOTICE_ALL_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Tümünü Gör\"]");
    public static By GET_SEARCH_BUTTON = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Arama Yazısı Girişi\"]");
    public static By NOTIFICATION = AppiumBy.xpath("//android.view.ViewGroup[@content-desc='bildirimler butonu']/com.horcrux.svg.SvgView");
    public static By NOTIFICATION_TEXT = AppiumBy.xpath("(//android.widget.TextView[@text=\"Bildirimler\"])[1]\n");
    public static By SEARCH_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Ders, ünite ya da konu ara\"]\n");
    public static By ALL_SEE_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Tümünü Gör\"]\n");
    public static By ALL_SEE_USER = AppiumBy.xpath("//android.widget.TextView[@text=\"Betül Y.\"]\n");
    public static By PROGRAM_SELECTION = AppiumBy.xpath("//android.widget.TextView[@text=\"Program Seçimi\"]\n");
    public static By PROGRAM_SELECTION_CREATE = AppiumBy.xpath("//android.widget.TextView[@text=\"Program Oluştur\"]\n");
    public static By LESSON_TEXT_VERBAL = AppiumBy.xpath("//android.widget.TextView[@text=\"4. Sınıf Sosyal Bilgiler\"]\n");
    public static By LESSON_TEXT_NUMERICAL = AppiumBy.xpath("//android.widget.TextView[@text=\"4. Sınıf Reflekslerle Matematik\"]\n");
    public static By SEARCH_RESULT_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"İlgili Sonuçlar\"]");
    public static By LAST_ACTIVITY_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Son Aktivitelerim\"]\n");
    public static By LAST_ACTIVITY_LOCATOR = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Son aktivite Seç butonu 0\"]\n");
    public static By LAST_ACTIVITY_GIVE_UP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"geriye dön butonu\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView\n");
    public static By GET_NOTIFICATION_ALLOW_GET = AppiumBy.xpath("//android.widget.TextView[@text=\"Bildirimlere İzin Ver\"]\n");
    public static By POP_UP_ALLOW = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]\n");
    public static By BACK_BUTTON = AppiumBy.xpath("//com.horcrux.svg.SvgView\n");
    public static By GIVE_UP = AppiumBy.xpath("//android.widget.TextView[@text=\"Vazgeç\"]");
    public static By NOTICE = AppiumBy.xpath("//android.widget.TextView[@text=\"Duyurular\"]\n");
    public static By DAILY_TASK = AppiumBy.xpath("//android.widget.TextView[@text=\"Günlük Görevlerim\"]");
    public static By TODAY_LESSON = AppiumBy.xpath("//android.widget.TextView[@text=\"Bugünün Dersleri\"]");
    public static By TODAY_LESSON_PLAN = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"günlük ders butonu 0\"]/android.view.ViewGroup[1]");
    public static By EVERYDAY_DOPING = AppiumBy.xpath("//android.widget.TextView[@text=\"Her güne 1 Doping\"]\n");
    public static By STUDY_SCHEDULE = AppiumBy.xpath("//android.widget.TextView[@text=\"Çalışma Programını Oluştur\"]\n");

}
