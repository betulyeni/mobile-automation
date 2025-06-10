package constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginConstants {
    public static By LOGIN_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Giriş Yap\"]\n");
    public static By USERNAME_LOCATOR = AppiumBy.accessibilityId("Kullanıcı Adı Kutusu");
    public static By USERNAME_ADD = AppiumBy.accessibilityId("Kullanıcı Ekle Butonu");
    public static By SAME_USERNAME = AppiumBy.accessibilityId("Kayıtlı Kullanıcılar");
    public static By PASSWORD_LOCATOR = AppiumBy.accessibilityId("Şifre Kutusu");
    public static By EULA_CHECKBOX_LOCATOR = AppiumBy.accessibilityId("Seçim Butonu");
    public static By LOGIN_BUTTON_LOCATOR = AppiumBy.accessibilityId("Giriş Yap Butonu");
    public static By LOG_OUT_OK = AppiumBy.xpath("//android.widget.TextView[@text=\"Devam Et\"]\n");
    public static By ADD_USER = AppiumBy.xpath("//android.widget.TextView[@text=\"Kullanıcı Ekle\"]\n");
    public static By NEW_USER = AppiumBy.xpath("//android.widget.TextView[@text=\"Yeni Kullanıcı Ekle\"]\n");
    public static By USER_ERROR_MSG = AppiumBy.xpath("//android.widget.TextView[@text=\"Kullanıcı adı ya da şifre hatalıdır (USER401)\"]");
    public static By MIN_PASSWORD_ERROR_MSG = AppiumBy.xpath("//android.widget.TextView[@text=\"Şifre 5 karakterden daha az olamaz\"]");
    public static By MIN_USERNAME_ERROR_MSG = AppiumBy.xpath("//android.widget.TextView[@text=\"Kullanıcı adı 5 karakterden daha az olamaz\"]");
    public static By MENU_BUTTON = AppiumBy.accessibilityId("menüyü aç butonu");


}
