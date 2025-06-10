package constants.menuTab;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class StatisticConstants {
    public static By SEE_VIDEO_BUTTON= AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    public static By QUESTION_SOLVING_BUTTON= AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    public static By ACTIVITY= AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]");
    public static By STATISTIC= AppiumBy.xpath("//android.widget.TextView[@text='İstatistikler']");
    public static By DISSOLVING_QUESTION= AppiumBy.xpath("//android.widget.TextView[@text=\"Çözülen Soru Sayısı\"]");


}
