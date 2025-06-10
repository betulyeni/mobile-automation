package constants.menuTab;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class DcpConstants {
        public static By CREATE_DCP = AppiumBy.xpath("//android.widget.TextView[@text=\"Programı Başlat\"]");
        public static By MONDAY_SCHEDULE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Saat Arttır Butonu\"])[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
        public static By TUESDAY_SCHEDULE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Saat Arttır Butonu\"])[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
        public static By WEDNESDAY_SCHEDULE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Saat Arttır Butonu\"])[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
        public static By THURSDAY_SCHEDULE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Saat Arttır Butonu\"])[4]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
        public static By FRIDAY_SCHEDULE = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Saat Arttır Butonu\"])[5]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");
        public static By CREATE_PRIVATE_DCP = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Özel Program Oluştur Butonu\"]");
        public static By CONTINUE_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Devam Et\"]");
        public static By LESSON_SELECTION_BUTTON = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Müfredat Seçme Butonu\"])[1]");
        public static By TEST_SELECTION_BUTTON = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Seçim Butonu\"])[2]");
        public static By VIDEO_SELECTION_BUTTON = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Seçim Butonu\"])[1]");
        public static By DCP_BUTTON = AppiumBy.xpath("//android.widget.TextView[@text=\"Programı Tamamla\"]");
        public static By DCP_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"Ders Çalışma Programın Hazır!\"]");
        public static By DCP_CREATE_LAST_BUTTON= AppiumBy.xpath("//android.widget.TextView[@text=\"Program Oluştur\"]");
        public static By DCP_STOP_BUTTON= AppiumBy.xpath("//android.widget.TextView[@text=\"Programı Durdur\"]");
        public static By DCP_EDIT_BUTTON= AppiumBy.xpath("//android.widget.TextView[@text='Programı Düzenle']");
        public static By DCP_CLOSE_BUTTON= AppiumBy.xpath("//android.widget.TextView[@text=\"Vazgeç\"]");
        public static By DCP_NAVIGATION_BUTTON= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Programım Navigasyon Butonu\"]/com.horcrux.svg.SvgView");
        public static By DCP_ALL_SELECTION_BUTTON= AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Daha Fazla butonu']/com.horcrux.svg.SvgView");
        public static By DCP_NEW_CREATE_BUTTON= AppiumBy.xpath("//android.widget.TextView[@text=\"Yeni Program Oluştur\"]");
        public static By DCP_SCHEDULE_BUTTON= AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"Saat Azalt Butonu\"])[4]");
        public static By DCP_EDIT_CLOSE_BUTTON= AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Değişiklikleri Kaydet Butonu\"]");
        public static By DCP_STOP_QUESTION_BUTTON= AppiumBy.xpath("//android.widget.TextView[@text=\"Durdur\"]");






}
