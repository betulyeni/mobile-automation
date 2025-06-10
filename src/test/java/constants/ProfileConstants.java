package constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProfileConstants {
    public static By VGBS_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Davet Oluştur\"]");
    public static By USER_DETAILS = AppiumBy.xpath("//android.widget.TextView[@text=\"Kullanıcı Bilgileri\"]");
    public static By PHONE_DETAILS = AppiumBy.xpath("//android.widget.TextView[@text=\"5316673769\"]\n");
    public static By NAME_DETAILS = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"İsim Girişi\"]");
    public static By SAVE_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Kaydet butonu\"]/android.view.View");
    public static By SCHOOL_DETAILS = AppiumBy.xpath("//android.widget.TextView[@text=\"Boztahta Şehit Serdar Yıldırım İlkokulu\"]");
    public static By CITY_DETAILS = AppiumBy.xpath(" //android.widget.TextView[@text=\"İzmir\"]\n");
    public static By LAST_NAME_DETAILS = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Soyisim Girişi\"]");
    public static By PACKAGE_REVIEWER_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Paketleri İncele\"]\n");
    public static By VGBS_GUARDIAN = AppiumBy.xpath("//android.widget.TextView[@text=\"Veli\"]");
    public static By VGBS_TEACHER = AppiumBy.xpath("//android.widget.TextView[@text=\"Öğretmen\"]");
    public static By VGBS_EMAIL = AppiumBy.xpath("//android.widget.EditText[@text=\"Davet edeceğin mail adresi\"]");
    public static By SEND_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Gönder\"]");
    public static By EDIT_USERNAME_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Ad Soyad Düzenle\"]");
    public static By MORE_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Daha Fazla butonu\"]");
    public static By ACCOUNT_WITHOUT_BUTTON = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/signin_fre_dismiss_button\"]");
    public static By PACKAGE_TITLE_BUTTON = AppiumBy.xpath("//android.webkit.WebView[@text=\"Doping Hafıza Dijital Öğrenme Platformu | YKS, TYT, AYT, LGS, KPSS, DGS'ye 7 /24 Online Hazırlanın!\"]/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View/android.widget.TextView");
    public static By NEGATIVE_BUTTON = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/negative_button\"]");
    public static By GOALS_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Hedeflerini Belirle\"]");





}
