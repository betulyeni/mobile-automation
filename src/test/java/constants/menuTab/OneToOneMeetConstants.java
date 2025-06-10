package constants.menuTab;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class OneToOneMeetConstants {
    public static By INSTANT_QUESTION_SOLUTION = AppiumBy.xpath("//android.widget.TextView[@text=\"Anında Soru Çözümü\"]");
    public static By PRIVATE_LESSON = AppiumBy.xpath("//android.widget.TextView[@text=\"Bire Bir Özel Ders\"]");
    public static By GUIDANCE_COACHING = AppiumBy.xpath("//android.widget.TextView[@text=\"Bire Bir Rehberlik/Koçluk\"]");
    public static By MY_COUPONS = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"kuponlarım butonu\"]");
    public static By COUPONS = AppiumBy.xpath("//android.widget.TextView[@text=\"Kuponlarım\"]");
    public static By COUPONS_DE_ACTIVITY = AppiumBy.xpath("//android.widget.TextView[@text=\"Kullanılan Kuponlarım\"]");
    public static By COUPONS_ACTIVITY = AppiumBy.xpath("//android.widget.TextView[@text=\"Aktif Kuponlarım\"]");
    public static By COUPONS_ALL = AppiumBy.xpath("//android.widget.TextView[@text=\"Tümü\"]\n");
    public static By SOLVENT = AppiumBy.xpath("(//android.widget.TextView[@text='Çözücü'])[1]");
    public static By NOW_UNDERSTAND = AppiumBy.xpath("(//android.widget.TextView[@text=\"Şimdi Anladım\"])[1]");
    public static By WITH_ME_COACHING = AppiumBy.xpath("(//android.widget.TextView[@text=\"Koçum Yanımda\"])[1]\n");


}
