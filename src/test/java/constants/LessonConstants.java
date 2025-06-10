package constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LessonConstants {
    public static By LESSON_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Dersler Navigasyon Butonu\"]");
    public static By ALL_LESSON= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"filtre butonu 0\"]");
    public static By VERBAL= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"filtre butonu 1\"]");
    public static By NUMERIC = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"filtre butonu 2\"]");
    public static By LESSON_SCIENCE = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Ders butonu 0\"]");
    public static By LESSON_MATCH = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Ders butonu 1\"]");
    public static By LESSON_SOCIETY = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Ders butonu 2\"]");
    public static By LESSON_TURKISH = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Ders butonu 3\"]");
    public static By LESSON_ENGLISH = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Ders butonu 4\"]");
    public static By LESSON_START_BUTTON = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"derse başla butonu\"]");



}
